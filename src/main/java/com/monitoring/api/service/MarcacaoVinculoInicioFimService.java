package com.monitoring.api.service;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monitoring.api.objects.MarcacaoVinculoInicioFimVO;
import com.monitoring.api.objects.TotalPeriodoDTO;
import com.monitoring.api.repository.MarcacaoVinculoInicioFimRepository;
import com.monitoring.api.utils.DateUtils;

@Service
public class MarcacaoVinculoInicioFimService {

  @Autowired
  private MarcacaoVinculoInicioFimRepository marcacaoVinculoInicioFimRepository;

  public TotalPeriodoDTO listaTotalPeriodo(String cpf, OffsetDateTime dataInicial, OffsetDateTime dataFinal) {
    List<MarcacaoVinculoInicioFimVO> listaMarcacoes = marcacaoVinculoInicioFimRepository
        .findAllGroupedByDia(cpf, dataInicial, dataFinal);

    Map<String, List<MarcacaoVinculoInicioFimVO>> mapResultados = groupMarcacoesByDia(listaMarcacoes);

    TotalPeriodoDTO totalPeriodoDTO = new TotalPeriodoDTO();
    calculateTotalPeriod(mapResultados, totalPeriodoDTO.getTotalPeriodo());
    calculateHorasNoturnasCLT(mapResultados, totalPeriodoDTO.getHorasNoturnasCLT());

    totalPeriodoDTO.getMarcacaoListTotalPeriodo().putAll(mapResultados);

    return totalPeriodoDTO;
  }

  private Map<String, List<MarcacaoVinculoInicioFimVO>> groupMarcacoesByDia(
      List<MarcacaoVinculoInicioFimVO> listaMarcacoes) {
    return listaMarcacoes.stream()
        .collect(Collectors.groupingBy(marcacao -> DateUtils.formataData(marcacao.getDia())));
  }

  private void calculateTotalPeriod(Map<String, List<MarcacaoVinculoInicioFimVO>> mapResultados,
      Map<String, String> mapTotalPeriodo) {
    calculateDuration(mapResultados, mapTotalPeriodo, marcacao -> Duration.between(
        marcacao.getDataHoraMarcacaoInicio(), marcacao.getDataHoraMarcacaoFim()));
  }

  private void calculateHorasNoturnasCLT(Map<String, List<MarcacaoVinculoInicioFimVO>> mapResultados,
      Map<String, String> horasNoturnasCLT) {
    calculateDuration(mapResultados, horasNoturnasCLT, marcacao -> {
      OffsetDateTime dataInicio = marcacao.getDataHoraMarcacaoInicio();
      OffsetDateTime dataFim = marcacao.getDataHoraMarcacaoFim();
      return (dataInicio.getHour() >= 22 || dataInicio.getHour() <= 5) ? Duration.between(dataInicio, dataFim)
          : Duration.ZERO;
    });
  }

  private void calculateDuration(Map<String, List<MarcacaoVinculoInicioFimVO>> mapResultados,
      Map<String, String> map, Function<MarcacaoVinculoInicioFimVO, Duration> durationFunction) {
    Map<String, Duration> intervalos = new HashMap<>();

    mapResultados.values().stream().flatMap(List::stream).forEach(marcacao -> {
      Duration interval = durationFunction.apply(marcacao);
      intervalos.merge(marcacao.getNome(), interval, Duration::plus);
    });

    intervalos.forEach((key, value) -> map.put(key, DateUtils.formatDuration(value)));
  }
}

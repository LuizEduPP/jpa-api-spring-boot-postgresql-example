package com.monitoring.api.service;

import java.time.LocalDateTime;
import java.util.List;

import com.monitoring.api.model.Marcacao;

public interface MarcacaoService {

  public Marcacao salvarMarcacao(Marcacao marcacao);

  public List<Marcacao> buscarPorCpfColaborador(String cpf, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim);

  public List<Marcacao> buscarPorTipoMarcacao(String tipoMarcacao);

  // Outros métodos específicos da sua aplicação
}

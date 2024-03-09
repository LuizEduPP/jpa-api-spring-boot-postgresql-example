package com.monitoring.api.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.monitoring.api.model.Marcacao;

public interface MarcacaoRepository extends JpaRepository<Marcacao, Long> {

  @Query("SELECT m FROM Marcacao m " +
      "WHERE m.cpfColaborador = ?1 AND m.dataHoraMarcacao BETWEEN ?2 AND ?3")
  public List<Marcacao> buscarPorCpfColaborador(String cpf, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim);

  public List<Marcacao> findByTipoMarcacao(String tipoMarcacao);
}

package com.monitoring.api.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARCACAO")
public class Marcacao {

  private Long codigo;

  private MarcacaoTipo tipoMarcacao;

  private Colaborador colaborador;

  private LocalDateTime dataHoraMarcacao;

  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public MarcacaoTipo getTipoMarcacao() {
    return tipoMarcacao;
  }

  public void setTipoMarcacao(MarcacaoTipo tipoMarcacao) {
    this.tipoMarcacao = tipoMarcacao;
  }

  public Colaborador getColaborador() {
    return colaborador;
  }

  public void setColaborador(Colaborador colaborador) {
    this.colaborador = colaborador;
  }

  public LocalDateTime getDataHoraMarcacao() {
    return dataHoraMarcacao;
  }

  public void setDataHoraMarcacao(LocalDateTime dataHoraMarcacao) {
    this.dataHoraMarcacao = dataHoraMarcacao;
  }

}

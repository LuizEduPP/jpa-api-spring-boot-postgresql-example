package com.monitoring.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARCACAO_TIPO")
public class MarcacaoTipo {

  private Long codigo;

  private String nome;

  private Long tempoRecomendadoEmMinutos;

  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Long getTempoRecomendadoEmMinutos() {
    return tempoRecomendadoEmMinutos;
  }

  public void setTempoRecomendadoEmMinutos(Long tempoRecomendadoEmMinutos) {
    this.tempoRecomendadoEmMinutos = tempoRecomendadoEmMinutos;
  }

}

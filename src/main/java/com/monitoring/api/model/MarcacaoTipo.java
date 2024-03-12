package com.monitoring.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARCACAO_TIPO")
public class MarcacaoTipo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long codigo;
  private String nome;
  private Long tempoRecomendadoMinutos;

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

  public Long getTempoRecomendadoMinutos() {
    return tempoRecomendadoMinutos;
  }

  public void setTempoRecomendadoMinutos(Long tempoRecomendadoMinutos) {
    this.tempoRecomendadoMinutos = tempoRecomendadoMinutos;
  }
}
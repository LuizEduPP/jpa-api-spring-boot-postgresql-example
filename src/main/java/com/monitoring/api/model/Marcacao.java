package com.monitoring.api.model;

import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARCACAO")
public class Marcacao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CODIGO")
  private Long codigo;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "COD_TIPO_MARCACAO", nullable = false)
  private MarcacaoTipo marcacaoTipo;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CPF_COLABORADOR", referencedColumnName = "CPF")
  private Colaborador colaborador;

  @Column(name = "DATA_HORA_MARCACAO", nullable = false)
  private OffsetDateTime dataHoraMarcacao;

  @Column(name = "TIPO_MARCACAO", nullable = false)
  private String tipoMarcacao;

  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public MarcacaoTipo getMarcacaoTipo() {
    return marcacaoTipo;
  }

  public void setMarcacaoTipo(MarcacaoTipo marcacaoTipo) {
    this.marcacaoTipo = marcacaoTipo;
  }

  public Colaborador getColaborador() {
    return colaborador;
  }

  public void setColaborador(Colaborador colaborador) {
    this.colaborador = colaborador;
  }

  public OffsetDateTime getDataHoraMarcacao() {
    return dataHoraMarcacao;
  }

  public void setDataHoraMarcacao(OffsetDateTime dataHoraMarcacao) {
    this.dataHoraMarcacao = dataHoraMarcacao;
  }

  public String getTipoMarcacao() {
    return tipoMarcacao;
  }

  public void setTipoMarcacao(String tipoMarcacao) {
    this.tipoMarcacao = tipoMarcacao;
  }
}
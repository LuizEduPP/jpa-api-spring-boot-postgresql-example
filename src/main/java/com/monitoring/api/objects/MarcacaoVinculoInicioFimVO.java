package com.monitoring.api.objects;

import java.time.OffsetDateTime;
import java.util.Date;

public class MarcacaoVinculoInicioFimVO {

  private Long codigo;
  private String nome;
  private String colaborador;
  private Date dia;
  private OffsetDateTime dataHoraMarcacaoInicio;
  private OffsetDateTime dataHoraMarcacaoFim;

  public MarcacaoVinculoInicioFimVO() {
  }

  public MarcacaoVinculoInicioFimVO(Long codigo, String nome, String colaborador, Date dia,
      OffsetDateTime dataHoraMarcacaoInicio, OffsetDateTime dataHoraMarcacaoFim) {
    this.codigo = codigo;
    this.nome = nome;
    this.colaborador = colaborador;
    this.dia = dia;
    this.dataHoraMarcacaoInicio = dataHoraMarcacaoInicio;
    this.dataHoraMarcacaoFim = dataHoraMarcacaoFim;
  }

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

  public String getColaborador() {
    return colaborador;
  }

  public void setColaborador(String colaborador) {
    this.colaborador = colaborador;
  }

  public Date getDia() {
    return dia;
  }

  public void setDia(Date dia) {
    this.dia = dia;
  }

  public OffsetDateTime getDataHoraMarcacaoInicio() {
    return dataHoraMarcacaoInicio;
  }

  public void setDataHoraMarcacaoInicio(OffsetDateTime dataHoraMarcacaoInicio) {
    this.dataHoraMarcacaoInicio = dataHoraMarcacaoInicio;
  }

  public OffsetDateTime getDataHoraMarcacaoFim() {
    return dataHoraMarcacaoFim;
  }

  public void setDataHoraMarcacaoFim(OffsetDateTime dataHoraMarcacaoFim) {
    this.dataHoraMarcacaoFim = dataHoraMarcacaoFim;
  }
}

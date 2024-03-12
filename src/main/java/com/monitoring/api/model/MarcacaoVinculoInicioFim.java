package com.monitoring.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARCACAO_VINCULO_INICIO_FIM")
public class MarcacaoVinculoInicioFim {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long codigo;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "COD_MARCACAO_INICIO", unique = true, nullable = false)
  private Marcacao marcacaoInicio;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "COD_MARCACAO_FIM", unique = true, nullable = false)
  private Marcacao marcacaoFim;

  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public Marcacao getMarcacaoInicio() {
    return marcacaoInicio;
  }

  public void setMarcacaoInicio(Marcacao marcacaoInicio) {
    this.marcacaoInicio = marcacaoInicio;
  }

  public Marcacao getMarcacaoFim() {
    return marcacaoFim;
  }

  public void setMarcacaoFim(Marcacao marcacaoFim) {
    this.marcacaoFim = marcacaoFim;
  }
}
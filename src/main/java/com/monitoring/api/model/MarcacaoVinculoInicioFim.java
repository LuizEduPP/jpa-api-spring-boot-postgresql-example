package com.monitoring.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARCACAO_VINCULO_INICIO_FIM")
public class MarcacaoVinculoInicioFim {

  private Long codigo;

  private Marcacao marcacaoInicio;

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

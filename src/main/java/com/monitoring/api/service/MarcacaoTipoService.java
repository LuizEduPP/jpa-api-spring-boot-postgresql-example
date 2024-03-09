package com.monitoring.api.service;

import java.util.List;

import com.monitoring.api.model.MarcacaoTipo;

public interface MarcacaoTipoService {

  public MarcacaoTipo salvarMarcacaoTipo(MarcacaoTipo marcacaoTipo);

  public List<MarcacaoTipo> buscarTodosTiposMarcacao();

  public MarcacaoTipo buscarPorNome(String nome);

  // Outros métodos específicos da sua aplicação
}

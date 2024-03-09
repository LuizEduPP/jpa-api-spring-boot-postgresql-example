package com.monitoring.api.service;

import java.util.List;

import com.monitoring.api.model.Colaborador;

public interface ColaboradorService {

  public Colaborador salvarColaborador(Colaborador colaborador);

  public Colaborador buscarPorCpf(String cpf);

  public List<Colaborador> buscarTodos();

  // Outros métodos específicos da sua aplicação
}

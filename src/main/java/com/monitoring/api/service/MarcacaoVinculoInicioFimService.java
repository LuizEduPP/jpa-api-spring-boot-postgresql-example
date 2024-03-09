package com.monitoring.api.service;

import com.monitoring.api.model.MarcacaoVinculoInicioFim;

public interface MarcacaoVinculoInicioFimService {

  public MarcacaoVinculoInicioFim salvarVinculo(MarcacaoVinculoInicioFim vinculo);

  public MarcacaoVinculoInicioFim buscarPorId(Long id);

  // Outros métodos específicos da sua aplicação
}

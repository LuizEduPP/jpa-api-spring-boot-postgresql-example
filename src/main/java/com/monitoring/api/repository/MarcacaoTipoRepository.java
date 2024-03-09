package com.monitoring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monitoring.api.model.MarcacaoTipo;

public interface MarcacaoTipoRepository extends JpaRepository<MarcacaoTipo, Long> {

  public MarcacaoTipo findByNome(String nome);
}

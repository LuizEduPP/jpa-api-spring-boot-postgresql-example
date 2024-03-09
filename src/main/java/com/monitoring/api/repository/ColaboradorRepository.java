package com.monitoring.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monitoring.api.model.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, String> {

  public Optional<Colaborador> findByCpf(String cpf);
}

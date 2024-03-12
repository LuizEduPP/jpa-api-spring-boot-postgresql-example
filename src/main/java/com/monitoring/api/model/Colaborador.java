package com.monitoring.api.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Colaborador {

  @Id
  private String cpf;
  private String nome;

  public Colaborador() {
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Colaborador that = (Colaborador) o;
    return Objects.equals(cpf, that.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf);
  }
}
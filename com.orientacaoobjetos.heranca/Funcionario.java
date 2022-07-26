package com.orientacaoobjetos.heranca;

public class Funcionario extends Pessoa {
  
  private String setor;
  private boolean trabalhando;
  
  public void mudarTrabalho() {
    this.trabalhando = ! this.trabalhando;
  }
  
  public String getSetor() {
    return setor;
  }
  
  public void setSetor(String setor) {
    this.setor = setor;
  }
  
  public boolean getTrabalhando() {
    return trabalhando;
  }
  
  public void setTrabalhando(boolean trabalhando) {
    this.trabalhando = trabalhando;
  }
  
  @Override
  public String toString() {
    return "Funcionário { " + "nome: " + this.getNome() + ", idade: " + this.getIdade() + ", sexo: " + this.getSexo() + ", setor: " + this.getSetor() + ", trabalhando: " + this.getTrabalhando() + " }";
  }
  
}
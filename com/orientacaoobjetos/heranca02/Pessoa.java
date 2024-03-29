package com.orientacaoobjetos.heranca02;

public abstract class Pessoa {
  
  // classe abstrata não pode ser instanciada, só pode servir como progenitora
  protected String nome, sexo;
  protected int idade;
  
  public final void fazerAniversario() {
    this.idade++;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public int getIdade() {
    return idade;
  }
  
  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  public String getSexo() {
    return sexo;
  }
  
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  
  @Override
  public String toString() {
    return "Dados { " + "nome: " + this.getNome() + ", idade: " + this.getIdade() + ", sexo: " + this.getSexo() + " }";
  }
  
}
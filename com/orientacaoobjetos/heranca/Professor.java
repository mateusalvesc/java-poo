package com.orientacaoobjetos.heranca;

public class Professor extends Pessoa {
  
  private String especialidade;
  private float salario;
  
  public void receberAumento(float aumento) {
    this.salario += aumento;
  }
  
  public String getEspecialidade() {
    return especialidade;
  }
  
  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }
  
  public float getSalario() {
    return salario;
  }
  
  public void setSalario(float salario) {
    this.salario = salario;
  }
  
   @Override
   public String toString() {
     return "Professor {" + " nome: " + this.getNome() + ", idade: " + this.getIdade() + ", sexo: " + this.getSexo() + ", especialidade: " + this.getEspecialidade() + ", salário: " + this.getSalario() + " },";
  }
  
}
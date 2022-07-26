package com.orientacaoobjetos.heranca;

public class Aluno extends Pessoa {
  
  private int matricula;
  private String curso;
  
  public void cancelarMatricula() {
    System.out.println("Matrícula Cancelada.");
  }
  
  public int getMatricula() {
    return matricula;
  }
  
  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }
  
  public String getCurso() {
    return curso;
  }
  
  public void setCurso(String curso) {
    this.curso = curso;
  }
  
   @Override
  public String toString() {
    return "Aluno {" + " nome: " + this.getNome() + ", idade: " + this.getIdade() + ", sexo: " + this.getSexo() + ", matrícula: " + this.getMatricula() + ", curso: " + this.getCurso() + " },";
  }
  
}
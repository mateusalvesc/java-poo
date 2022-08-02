package com.orientacaoobjetos.heranca02;

public class Aluno extends Pessoa {
  
  // herança para diferença
  private int matricula;
  private String curso;
  
  public void pagarMensalidade() {
    System.out.println("Pagando mensalidade do aluno " + this.nome);
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
}
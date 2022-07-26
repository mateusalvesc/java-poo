package com.orientacaoobjetos.heranca2;

public class Tecnico extends Aluno {
  
  private int registroPro;
  
  public void praticar() {
    System.out.println(this.nome + " praticando...");
  }
  
  public int getRegistroPro() {
    return registroPro;
  }
  
  public void setRegistroPro(int registroPro) {
    this.registroPro = registroPro;
  }
}
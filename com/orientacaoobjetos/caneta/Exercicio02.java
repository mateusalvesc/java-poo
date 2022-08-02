package com.orientacaoobjetos.caneta;

public class Exercicio02 {

  public static void main(String[] args) {
    
    CanetaB c1 = new CanetaB();
    c1.modelo = "BIC Cristal";
    c1.cor = "Azul";
    //c1.ponta = 0.5f;
    c1.carga = 80;
    //c1.tampada = false;
    c1.tampar();
    c1.status();
    c1.rabiscar();
  }
  
}
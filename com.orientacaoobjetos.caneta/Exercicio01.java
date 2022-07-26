package com.orientacaoobjetos.caneta;

public class Exercicio01 {

  public static void main(String[] args) {
    
    CanetaA c1 = new CanetaA();
    c1.cor = "Azul";
    c1.ponta = 0.5f;
    c1.tampar();
    
    c1.status();
    c1.rabiscar();
    
    CanetaA c2 = new CanetaA();
    c2.modelo = "Hostnet";
    c2.cor = "Preta";
    c2.destampar();
    
    c2.status();
    c2.rabiscar();
  }
  
}
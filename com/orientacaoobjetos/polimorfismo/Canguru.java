package com.orientacaoobjetos.polimorfismo;

public class Canguru extends Mamifero {
  
  public void usarBolsa() {
    System.out.println("Usando bolsa...");
  }
  
  @Override
  public void locomover() {
    System.out.println("Saltando...");
  }
  
}
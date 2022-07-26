package com.orientacaoojetos.contabancaria;

public class ExercicioMain {

  public static void main(String[] args) {

    ContaBanco p1 = new ContaBanco();
    p1.abrirConta("CC");
    p1.setNumConta(1884);
    p1.setDono("Mateus");
    
    ContaBanco p2 = new ContaBanco();
    p2.abrirConta("CP");
    p2.setNumConta(2778);
    p2.setDono("Sara");
    
    p1.depositar(2450);
    p2.depositar(1850);
    p2.sacar(100);
    
    p1.sacar(2500);
    p1.fecharConta();
    
    p1.estadoAtual();
    p2.estadoAtual();
    
  }
}
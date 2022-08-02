package com.orientacaoobjetos.combate;

import java.util.Random;

public class Luta {
  
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;
  
  public void marcarLuta(Lutador l1, Lutador l2) {
    if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
      this.setAprovada(true);
      this.setDesafiado(l1);
      this.setDesafiante(l2);
    } else {
      this.setAprovada(false);
      this.setDesafiado(null);
      this.setDesafiante(null);
    }
  }
  
  public void lutar() {
    if (this.getAprovada()) {
      System.out.println("### Desafiado ###");
      this.desafiado.apresentar();
      System.out.println("### Desafiante ###");
      this.desafiante.apresentar();
      
      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3); // 0 1 2
      System.out.println("===== Resultado da luta =====");
      switch (vencedor) {
        case 0: // empate
          System.out.println("Empatou");
          this.desafiado.empatarLuta();
          this.desafiante.empatarLuta();
        break;
        case 1: // Ganhou Desafiado
          System.out.println("Vitória do " + this.desafiado.getNome());
          this.desafiado.ganharLuta();
          this.desafiante.perderLuta();
        break;
        case 2: // Ganhou Desafiante
          System.out.println("Vitória do " + this.desafiante.getNome());
          this.desafiante.ganharLuta();
          this.desafiado.perderLuta();
        break;
        default:
          System.out.println("[ERRO]!");
        break;
      }
    } else {
      System.out.println("A luta não pode acontecer!");
    }
  }
  
  public Lutador getDesafiado() {
    return desafiado;
  }
  
  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }
  
  public Lutador getDesafiante() {
    return desafiante;
  }
  
  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }
  
  public int getRounds() {
    return rounds;
  }
  
  public void setRounds(int rounds) {
    this.rounds = rounds;
  }
  
  public boolean getAprovada() {
    return aprovada;
  }
  
  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }
}
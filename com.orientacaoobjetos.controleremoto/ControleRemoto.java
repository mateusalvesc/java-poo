package com.orientacaoojetos.controleremoto;

public class ControleRemoto implements Controlador {
  
  // atributos
  private int volume;
  private boolean ligado;
  private boolean tocando;
  
  // métodos especiais
  public ControleRemoto() {
    this.setVolume(50);
    this.setLigado(true);
    this.setTocando(false);
  }
  
  private int getVolume() {
    return volume;
  }
  
  private void setVolume(int volume) {
    this.volume = volume;
  }
  
  private boolean getLigado() {
    return ligado;
  }
  
  private void setLigado(boolean ligado) {
    this.ligado = ligado;
  }
  
  private boolean getTocando() {
    return tocando;
  }
  
  private void setTocando(boolean tocando) {
    this.tocando = tocando;
  }
  
  // sobreescrevendo métodos
  @Override
  public void ligar() {
    this.setLigado(true);
  }
  
  @Override
  public void desligar() {
    this.setLigado(false);
  }
  
  @Override
  public void abrirMenu() {
    System.out.println("------- Menu -------");
    System.out.println("Está ligado? " + this.getLigado());
    System.out.println("Está tocando? " + this.getTocando());
    System.out.print("Volume: " + this.getVolume());
    for (int i = 1; i <= this.getVolume(); i+=10) {
      System.out.print("|");
    }
    System.out.println("");
  }
  
  @Override
  public void fecharMenu() {
    System.out.println("Fechando Menu...");
  }
  
  @Override
  public void maisVolume() {
    if (this.getLigado()) {
      this.setVolume(this.getVolume() + 5);
    } else {
      System.out.println("Impossível aumentar volume.");
    }
  }
  
  @Override
  public void menosVolume() {
    if (this.getLigado()) {
      this.setVolume(this.getVolume() - 5);
    } else {
      System.out.println("Impossível diminuir volume.");
    }
  }
  
  @Override
  public void ligarMudo() {
    if (this.getLigado() && this.getVolume() > 0) {
      this.setVolume(0);
    }
  }
  
  @Override
  public void desligarMudo() {
    if (this.getLigado() && this.getVolume() == 0) {
      this.setVolume(50);
    }
  }
  
  @Override
  public void play() {
    if (this.getLigado() && !(this.getTocando())) {
      this.setTocando(true);
    } else {
      System.out.println("Impossível reproduzir.");
    }
  }
  
  @Override
  public void pause() {
    if (this.getLigado() && this.getTocando()) {
      this.setTocando(false);
    } else {
      System.out.println("Impossível pausar");
    }
  }
  
}
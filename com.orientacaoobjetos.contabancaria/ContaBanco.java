package com.orientacaoojetos.contabancaria;

public class ContaBanco {
  
  // atributos
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;
  
  // métodos personalizados
  public void estadoAtual() {
    System.out.println("---------------");
    System.out.println("Conta: " + this.getNumConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Dono: " + this.getDono());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.getStatus());
  }
  
  public void abrirConta(String t) {
    this.setTipo(t);
    this.setStatus(true);
    if (t == "CC") {
      this.setSaldo(50);
    } else if (t == "CP") {
      this.setSaldo(150);
    }
    System.out.println("Conta aberta com sucesso!");
  }
  
  public void fecharConta() {
    if (this.getSaldo() > 0) {
      System.out.println("Não é possível fechar a conta, pois a mesma ainda possui saldo.");
    } else if (this.getSaldo() < 0) {
      System.out.println("Não é possível fechar a conta, pois a mesma possui débito.");
    } else {
      this.setStatus(false);
      System.out.println("Conta fechada com sucesso!");
    }
  }
  
  public void depositar(float v) {
    if (this.getStatus()) {
      this.setSaldo(this.getSaldo() + v);
      System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
    } else {
      System.out.println("Impossível depositar, pois a conta correspondente não se encontra aberta.");
    }
  }
  
  public void sacar(float v) {
    if (this.getStatus()) {
      if (this.getSaldo() >= v) {
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Saque realizado com sucesso da conta de " + this.getDono());
      } else {
        System.out.println("Saldo insuficiente para saque.");
      }
    } else {
      System.out.println("Impossível sacar, pois a conta se encontra fechada.");
    }
  }
  
  public void pagarMensal() {
    float v = 0;
    if (this.getTipo() == "CC") {
      v = 12;
    } else if (this.getTipo() == "CP") {
      v = 20;
    }
    if (this.getStatus()) {
      if (this.getSaldo() >= v) {
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Mensalidade paga com sucesso por " + this.getDono());
      } else {
        System.out.println("Saldo insuficiente para pagar mensalidade.");
      }
    } else {
      System.out.println("Impossível pagar com uma conta fechada.");
    }
  }
  
  // construtor
  public ContaBanco() {
    this.setSaldo(0);
    this.setStatus(false);
  }
  
  // métodos especiais
  public void setNumConta(int n) {
    this.numConta = n;
  }
  
  public int getNumConta() {
    return numConta;
  }
  
  public void setTipo(String t) {
    this.tipo = t;
  }
  
  public String getTipo() {
    return tipo;
  }
  
  public void setDono(String d) {
    this.dono = d;
  }
  
  public String getDono() {
    return dono;
  }
  
  public void setSaldo(float s) {
    this.saldo = s;
  }
  
  public float getSaldo() {
    return saldo;
  }
  
  public void setStatus(boolean s) {
    this.status = s;
  }
  
  public boolean getStatus() {
    return status;
  }
  
}
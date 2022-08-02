package com.orientacaoobjetos.combate;

public class Lutador {

  // atributos
  private String nome, nacionalidade, categoria;
  private int idade, vitorias, derrotas, empates;
  private float altura, peso;
  
  // métodos especiais
  public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
    this.setNome(nome);
    this.setNacionalidade(nacionalidade);
    this.setIdade(idade);
    this.setAltura(altura);
    this.setPeso(peso);
    this.setVitorias(vitorias);
    this.setDerrotas(derrotas);
    this.setEmpates(empates);
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getNacionalidade() {
    return nacionalidade;
  }
  
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }
  
  public int getIdade() {
    return idade;
  }
  
  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  public float getAltura() {
    return altura;
  }
  
  public void setAltura(float altura) {
    this.altura = altura;
  }
  
  public float getPeso() {
    return peso;
  }
  
  public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
  }
  
  public String getCategoria() {
    return categoria;
  }
  
  private void setCategoria() {
    if (this.getPeso() < 52.5) {
      this.categoria = "Inválido";
    } else if (this.getPeso() <= 70.3) {
      this.categoria = "Leve";
    } else if (this.getPeso() <= 83.9) {
      this.categoria = "Médio";
    } else if (this.getPeso() <= 120.2) {
      this.categoria = "Pesado";
    } else {
      this.categoria = "Inválido";
    }
  }
  
  public int getVitorias() {
    return vitorias;
  }
  
  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }
  
  public int getDerrotas() {
    return derrotas;
  }
  
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }
  
  public int getEmpates() {
    return empates;
  }
  
  public void setEmpates(int empates) {
    this.empates = empates;
  }
  
  // métodos
  public void apresentar() {
    System.out.println("‐-----------------------");
    System.out.println("Apresentamos o lutador: " + this.getNome());
    System.out.print("Diretamemte de: " + this.getNacionalidade());
    System.out.println(", com " + this.getIdade() + " anos, " + this.getAltura() + "m de altura e pesando " + this.getPeso() + "Kg");
    System.out.println("Ele possui: " + this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
  }
  
  public void status() {
    System.out.println(this.getNome() + " é um lutador peso " + this.getCategoria());
    System.out.println("Com " + this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
  }
  
  public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
  }
  
  public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
  }
  
  public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
  }
   
}
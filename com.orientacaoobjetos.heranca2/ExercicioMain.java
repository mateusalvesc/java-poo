package com.orientacaoobjetos.heranca2;

public class ExercicioMain {

  public static void main(String[] args) {
    
    //Pessoa p1 = new Pessoa();
    
    Visitante v1 = new Visitante();
    v1.setNome("Alini");
    v1.setIdade(30);
    v1.setSexo("F");
    
    Aluno a1 = new Aluno();
    a1.setNome("Wesley");
    a1.setMatricula(111);
    a1.setCurso("Informática");
    a1.setIdade(16);
    a1.setSexo("M");
    a1.pagarMensalidade();
    
    Bolsista b1 = new Bolsista();
    b1.setMatricula(112);
    b1.setNome("André");
    b1.setBolsa(12.5f);
    b1.setSexo("M");
    b1.pagarMensalidade();
    
    Tecnico t1 = new Tecnico();
    t1.setNome("Rosani");
    t1.setIdade(35);
    t1.setSexo("F");
    t1.praticar();
    
    Professor p1 = new Professor();
    p1.setNome("Jailson");
    p1.setIdade(37);
    p1.setSexo("M");
    p1.setEspecialidade("Java");
    p1.setSalario(8000.00f);
    p1.receberAumento(500.00f);
    System.out.println(p1.toString());
    
  }
  
}
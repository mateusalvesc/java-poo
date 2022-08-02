package com.orientacaoobjetos.exercicios;

public class Dados {

	String nome = "Mateus";
	String sobrenome = "Alves";
	int idade = 20;
	
	public static void main(String[] args) {
		
		Dados usuario = new Dados();
		
		System.out.println("Nome do usu�rio: " + usuario.nome + " " + usuario.sobrenome);
		System.out.println("Idade do usu�rio: " + usuario.idade);
	}
}
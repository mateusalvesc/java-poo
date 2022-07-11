package orientacaoobjetos;

public class Aluno {

	int id = 15;
	String nome = "Mateus";
	int idade = 19;
	int matricula = 61642;
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		System.out.println("O id do aluno(a) é: " + aluno.id);
		System.out.println("O nome do aluno(a) é: " + aluno.nome);
		System.out.println("A idade do aluno(a) é: " + aluno.idade);
		System.out.println("A matrícula do aluno(a) é: " + aluno.matricula);
		
	}
}
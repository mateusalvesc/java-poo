package orientacaoobjetos;

public class Exemplo05 {

	int numero = 75;
	
	public static void main(String[] args) {
		
		// criar objeto 01
		Exemplo05 objeto01 = new Exemplo05();
		
		// criar objeto 02
		Exemplo05 objeto02 = new Exemplo05();
		
		// alterar valor do objeto02
		objeto02.numero = 145;
		
		System.out.println("Objeto01: " + objeto01.numero);
		System.out.println("Objeto02: " + objeto02.numero);
		
	}
}
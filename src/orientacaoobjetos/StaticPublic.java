package orientacaoobjetos;

public class StaticPublic {

	static void soma() {
		
		int valor1 = 37;
		int valor2 = 53;
		int soma = valor1 + valor2;
		System.out.println("O resultado da soma entre " + valor1 + " e " + valor2 + " é igual a: " + soma);	
	}
	
	public void subtracao() {
		int valor1 = 250;
		int valor2 = 115;
		int subtracao = valor1 - valor2;
		System.out.println("O resultado da subtração entre " + valor1 + " e " + valor2 + " é igual a: "+ subtracao);
	}
	
	public static void main(String[] args) {
		
		soma();
		
		StaticPublic objeto = new StaticPublic();
		objeto.subtracao();
	}
}
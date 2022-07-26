package orientacaoobjetos;

public class StaticPublic02 {
	
	static void multiplicacao() {
		
		int valor1 = 10;
		int valor2 = 7;
		int multiplicacao = valor1 * valor2;
		System.out.println("O resultado da multiplicação entre " + valor1 + " e " + valor2 + " é igual a: " + multiplicacao);	
	}
	
	public void divisao() {
		int valor1 = 350;
		int valor2 = 8;
		float divisao = (float) valor1 / valor2;
		System.out.println("O resultado da divisão entre " + valor1 + " e " + valor2 + " é igual a: "+ divisao);
	}
	
	public static void main(String[] args) {
		
		multiplicacao();
		//divisao();
		StaticPublic02 objeto = new StaticPublic02();
		objeto.divisao();
	}
}
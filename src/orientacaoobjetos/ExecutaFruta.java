package orientacaoobjetos;

public class ExecutaFruta {

	public static void main(String[] args) {
		
		// instanciar objeto
		Fruta abacate = new Fruta();
		
		System.out.println("Cor: " + abacate.cor);
		System.out.println("Tamnaho (cm): " + abacate.tamanho);
		System.out.println("Preço (R$): " + abacate.preco);
		System.out.println("País de origem: " + abacate.paisOrigem);
		
	}
}
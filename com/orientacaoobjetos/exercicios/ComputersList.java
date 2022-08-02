package orientacaoobjetos;

import java.util.ArrayList;

public class ComputersList {

	public static void main(String[] args) {
		
		ArrayList<String> computador = new ArrayList<String>();
		
		computador.add("Dell");
		computador.add("Samsung");
		computador.add("Lenovo");
		computador.add("LG");
		
		System.out.println(computador.remove(3));
		System.out.println(computador.get(2));
		System.out.println(computador);
	}
}
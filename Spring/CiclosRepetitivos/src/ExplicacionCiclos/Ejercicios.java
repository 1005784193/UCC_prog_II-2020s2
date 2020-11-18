package ExplicacionCiclos;

import java.util.Random;

public class Ejercicios  {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  16 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();

		boolean condicion = false;

		do {
			
			Random random = new Random();
			int intRandom = random.nextInt(1000);
			condicion = true;
			int contador, i, numero;
			numero = intRandom;
			contador = 0;
			
			for (i = 1; i <= numero; i++) {
				if ((numero % i) == 0) {
					contador++;
				}
			}
			if (contador <= 2)
				condicion = false;

			System.out.println("numero : " + intRandom + " finalizara cuando sea primo ");

		} while (condicion);

	}
}
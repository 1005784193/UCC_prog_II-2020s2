package ExplicacionCiclos;
import java.util.Random;

public class ExplicacionesCiclosFOR  {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  14 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		
		boolean condicion = true;
		int contador = 0; 
		int acumulador = 0;
		while (condicion) {
			contador = contador + 1;
			Random random = new Random();
			int intRandom = random.nextInt(50);
			acumulador = acumulador + intRandom;
			condicion =true;
			if (intRandom < 30 && intRandom > 25) condicion = false;
		System.out.println("Estoy dentro del ciclo haga mientras: random= "+ intRandom+" Condicion de salida ciclo>> "+condicion);
		 
		}
		System.out.println("+|----------------------------------+");
		System.out.println("    Ciclos realizados: " + contador   );
		System.out.println("    Valor acumulado: "+ acumulador    );
		System.out.println("+-----------------------------------+");
	}
}
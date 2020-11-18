package ExplicacionCiclos;
import java.util.Random;

public class ExplicacionesCiclosWHILE  {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  14 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		
		boolean condicion = true;
		int contador = 0; 
		int acumulador = 0;
		Random aleatorio = new Random();
		int intCantidadCiclos = aleatorio.nextInt(50);
		int intRandom = 0;
		System.out.println("Cantidad de ciclos: ");
		for (int i =0; i <= intCantidadCiclos; i++) {
			contador = i;
			intRandom = aleatorio.nextInt(50);
			acumulador = acumulador + intRandom;
			condicion =true;
			System.out.println("Estoy dentro del ciclo haga FOR: random= "+ intRandom+" Condicion de salida ciclo>> "+condicion);
			if (intRandom < 30 && intRandom > 25) break;
		}
		System.out.println("+|----------------------------------+");
		System.out.println("    Ciclos realizados: " + contador   );
		System.out.println("    Valor acumulado: "+ acumulador    );
		System.out.println("+-----------------------------------+");
	}
}
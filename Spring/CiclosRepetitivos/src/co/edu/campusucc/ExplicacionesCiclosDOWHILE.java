package co.edu.campusucc;
import java.util.Random;

public class ExplicacionesCiclosDOWHILE  {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  14 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		
		boolean condicion = false;
		do {
			Random random = new Random();
			int intRandom = random.nextInt(10);
			condicion =true;
			if (intRandom < 5) condicion = false;
		System.out.println("Estoy dentro del ciclo haga mientras: random= "+ intRandom+" Condicion de salida ciclo>> "+condicion);
		} while (condicion);
	}
}
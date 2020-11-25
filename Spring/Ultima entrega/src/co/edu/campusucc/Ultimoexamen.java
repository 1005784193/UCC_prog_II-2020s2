package co.edu.campusucc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ultimoexamen {
	public static void main(String[] args) {
		System.out.println("+-----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  21 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		String opprog = "";
		int  comando = 0;
		int cate = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 1 para abrir el programa Ejemplo2");
		System.out.println("Digite 2 para abrir el programa Ejercicio1");
		System.out.println("Digite 3 para abrir el programa Ejercicio2");
		System.out.println("Digite 4 para abrir el programa Ejercicio3");
		System.out.println("Digite 5 para abrir el programa Ejercicio4");
		System.out.println("Digite 6 para abrir el programa Ejercicio5");
		System.out.println("Digite 7 para abrir el programa Ejercicio6");
		System.out.println("Digite 8 para abrir el programa miguel1");
		System.out.println("Digite 9 para abrir el programa miguel2");
		System.out.println("Digite 10 para abrir el programa miguel3");
		System.out.println("Digite 11 para abrir el programa miguel4");
		System.out.println("Digite 12 para abrir el programa miguel5");
		System.out.println("Digite 13 para abrir el programa miguel6");
		System.out.println("Digite 14 para abrir el programa miguel7");
		System.out.println("Digite 15 para abrir el programa miguel8");
		comando = scan.nextInt();

		
		switch (comando) {
		case 1:
			new Ejemplo2().main(args);
			break;
		case 2:
			new Ejercicio1().main(args);
			break;
		case 3:
			new miguel1().main(args);
			break;
		case 4:
			new miguel2().main(args);
			break;
		case 5:
			new miguel2().main(args);
			break;
		case 6:
			new miguel3().main(args);
			break;
		case 7:
			new miguel4().main(args);
			break;
		case 8:
			new miguel5().main(args);
			break;
		case 9:
			new miguel6().main(args);
			break;
		case 10:
			new miguel7().main(args);
			break;
		case 11:
			new miguel8().main(args);
			break;
		case 12:
			new miguel9().main(args);
			break;
		case 13:
			new miguel10().main(args);
			break;
		case 14:
			new miguel11().main(args);
			break;
		case 15:
			new miguel12().main(args);
			break;
		default:
			try
		{
			Runtime.getRuntime().exec(opprog);
		}
			catch (Exception e)
		{
			System.out.println("Error en el metodo exec ()");	
			e.printStackTrace();
		}
		}
			
		}
		
	}
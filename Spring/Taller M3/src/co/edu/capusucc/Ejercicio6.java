package co.edu.capusucc;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  07 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		String nom = "";
		int car1 = 5000;
		int car2 = 3000;
		int car3 = 2500;
		int car4 = 2000;
		int car5 = 2200;
		int car6 = 1700;
		int Dia = 0;
		int Dia2 = 0;
		int Dia3 = 0;
		int Dia4 = 0;
		int Dia5 = 0;
		int Dia6 = 0;
		int cum = 0;
		int imput = 0;
		int seme = 0;
		int val = 0;
		int nom1;
		int op = 0;
		float op2 = 0;
		int op3 = 0;
		int op4 = 0;
		int op5 = 0;
		int op6 = 0;
		String nom2 = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("  Tipo de carro        cargo");
		System.out.println("1.Mazda                $5000");
		System.out.println("2.Renault              $3000");
		System.out.println("3.Chevrolet            $2500");
		System.out.println("4.Fiat                 $2000");
		System.out.println("5.Dodge                $2200");
		System.out.println("6.Otros                $1700");
		System.out.println("");
		System.out.println("Digite el tipo de carro: (entre 1 - 6)");
		nom1 = scan.nextInt();
		switch (nom1) {
		case 1:
			nom = "Mazda";
			System.out.println("1.Cambio de aceite         $3500");
			System.out.println("2.Alineacion y balanceo    $2800");
			System.out.println("3.Engrase                  $1950");
			System.out.println("4.Cambio de filtro         $2750");
			System.out.println("5.Lavado                   $3000");
			System.out.println("6.Otros                    $1600");
			System.out.println("");
			System.out.println("Digite diagnostico deseado: (entre 1 - 6 ) 7 para omitir");
			val = scan.nextInt();
			switch (val) {
			case 1:
				Dia = 3500;
				System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
				seme = scan.nextInt();
				switch (seme) {
				case 2:
					Dia2 = 2800;
					op = Dia + Dia2;
					System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
					cum = scan.nextInt();
					switch (cum) {
					case 3:
						Dia3 = 1950;
						op3 = op + Dia3;
						System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
						imput = scan.nextInt();
						switch (imput) {
						case 4:
							Dia4 = 2750;
							op4 = op3 + Dia4;
							System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
							imput = scan.nextInt();
							switch (imput) {
							case 5:
								Dia5 = 3000;
								op5 = op4 + Dia5;
								System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
								imput = scan.nextInt();
								switch (imput) {
								case 6:
									Dia6 = 1600;
									op6 = op5 + Dia6;
									break;
								}
								break;
							}
							break;
						}
						break;
					}
					break;
				case 7:
					op2 = Dia + car1;
					System.out.println("El valor a cancelar es de: " + op2);
					break;
				}
				break;
			case 2:
				Dia2 = 2800;
				System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
				seme = scan.nextInt();
				switch (seme) {
				case 1:
					Dia = 3500;
					op = Dia + Dia2;
					System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
					cum = scan.nextInt();
					switch (cum) {
					case 3:
						Dia3 = 1950;
						op3 = op + Dia3;
						System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
						imput = scan.nextInt();
						switch (imput) {
						case 4:
							Dia4 = 2750;
							op4 = op3 + Dia4;
							System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
							imput = scan.nextInt();
							switch (imput) {
							case 5:
								Dia5 = 3000;
								op5 = op4 + Dia5;
								System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
								imput = scan.nextInt();
								switch (imput) {
								case 6:
									Dia6 = 1600;
									op6 = op5 + Dia6;
									break;
								}
								break;
							}
							break;
						}
						break;
					}
					break;
				case 7:
					op2 = Dia2 + car1;
					System.out.println("El valor a cancelar es de: " + op2);
					break;
				}
				break;
			case 3:
				Dia3 = 1950;

				System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
				seme = scan.nextInt();
				switch (seme) {
				case 1:
					Dia = 3500;
					op = Dia + Dia2;
					System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
					cum = scan.nextInt();
					switch (cum) {
					case 2:
						Dia2 = 2800;
						op3 = op + Dia2;
						System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
						imput = scan.nextInt();
						switch (imput) {
						case 4:
							Dia4 = 2750;
							op4 = op3 + Dia4;
							System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
							imput = scan.nextInt();
							switch (imput) {
							case 5:
								Dia5 = 3000;
								op5 = op4 + Dia5;
								System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
								imput = scan.nextInt();
								switch (imput) {
								case 6:
									Dia6 = 1600;
									op6 = op5 + Dia6;
									break;
								}
								break;
							}
							break;
						}
						break;
					}
					break;
				case 7:
					op2 = Dia3 + car1;
					System.out.println("El valor a cancelar es de: " + op2);
					break;
				}
				break;
			case 4:

				Dia4 = 2750;
				System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
				seme = scan.nextInt();
				switch (seme) {
				case 1:
					Dia = 3500;
					op = Dia + Dia2;
					System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
					cum = scan.nextInt();
					switch (cum) {
					case 2:
						Dia2 = 2800;
						op3 = op + Dia2;
						System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
						imput = scan.nextInt();
						switch (imput) {
						case 3:

							op4 = op3 + Dia3;
							System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
							imput = scan.nextInt();
							switch (imput) {
							case 5:
								Dia5 = 3000;
								op5 = op4 + Dia5;
								System.out.println("Digite otro diagnostico deseado ( 7 para omitir )");
								imput = scan.nextInt();
								switch (imput) {
								case 6:
									Dia6 = 1600;
									op6 = op5 + Dia6;
									break;
								}
								break;
							}
							break;
						}
						break;
					}
					break;
				case 7:
					op2 = Dia4 + car1;
					System.out.println("El valor a cancelar es de: " + op2);
					break;
				}
				break;
			default:
				nom1 = 0;
				System.out.println("Error");
			}

		}
	}
}
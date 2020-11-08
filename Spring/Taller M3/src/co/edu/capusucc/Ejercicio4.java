package co.edu.capusucc;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  07 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		String nom = "";
		int cant = 0;
		int base= 0;
		int val = 0;
		int nom1 =0;
		int pre1 = 0;
		float iva = 0;
		float total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. A");
		System.out.println("2. B");
		System.out.println("3. C");
		System.out.println("Ecoja un producto: ");
		nom1 = scan.nextInt();
		System.out.println("Digite la cantidad del producto: ");
		cant = scan.nextInt();
		switch (nom1) {
		case 1:
			nom = "A";
			if (cant < 501) {
				val = 500;
				base = val * cant;
				iva =(float) (base * 0.07);
				total = (float)(base + iva); 
				System.out.println("      Factura de venta      ");
				System.out.println("Tipo de producto comprado:  "+nom);
				System.out.println("Cantidad del producto:      "+ cant);
				System.out.println("Subtotal:                  $"+base);
				System.out.println("IVA:                       $"+iva);
				System.out.println("Total:                     $"+total);
				System.out.println("El producto A se vende a cantidades menores a 501 unidades por : " + val);
			} else {
				if (cant > 500) {
					pre1 = 1000;
					base = pre1 * cant;
					iva =(float) (base * 0.09);
					total = (float)(base + iva); 
					System.out.println("      Factura de venta      ");
					System.out.println("Tipo de producto comprado:  "+nom);
					System.out.println("Cantidad del producto:      "+ cant);
					System.out.println("Subtotal:                  $"+base);
					System.out.println("IVA:                       $"+iva);
					System.out.println("Total:                     $"+total);
					System.out.println("El producto A se vende a cantidades mayores a 500 unidades por : " + pre1);
				}
			}	
			break;
		case 2:
			if (cant < 501) {
				val = 800;
				base = val * cant;
				iva =(float) (base * 0.08);
				total = (float)(base + iva); 
				System.out.println("      Factura de venta      ");
				System.out.println("Tipo de producto comprado:  "+nom);
				System.out.println("Cantidad del producto:      "+ cant);
				System.out.println("Subtotal:                  $"+base);
				System.out.println("IVA:                       $"+iva);
				System.out.println("Total:                     $"+total);
				System.out.println("El producto B se vende a cantidades menores a 501 unidades por : " + val);
			} else {
				if (cant > 500) {
					pre1 = 1400;
					base = pre1 * cant;
					iva =(float) (base * 0.11);
					total = (float)(base + iva); 
					System.out.println("      Factura de venta      ");
					System.out.println("Tipo de producto comprado:  "+nom);
					System.out.println("Cantidad del producto:      "+ cant);
					System.out.println("Subtotal:                  $"+base);
					System.out.println("IVA:                       $"+iva);
					System.out.println("Total:                     $"+total);
					System.out.println("El producto B se vende a cantidades mayores a 500 unidades por : " + pre1);
				}
			}
			break;
		case 3:
			if (cant < 501) {
				val = 1000;
				base = val * cant;
				iva =(float) (base * 0.05);
				total = (float)(base + iva); 
				System.out.println("      Factura de venta      ");
				System.out.println("Tipo de producto comprado:  "+nom);
				System.out.println("Cantidad del producto:      "+ cant);
				System.out.println("Subtotal:                  $"+base);
				System.out.println("IVA:                       $"+iva);
				System.out.println("Total:                     $"+total);
				System.out.println("El producto C se vende a cantidades menores a 501 unidades por : " + val);
			} else {
				if (cant > 500) {
					pre1 = 1600;
					base = pre1 * cant;
					iva =(float) (base * 0.10);
					total = (float)(base + iva); 
					System.out.println("      Factura de venta      ");
					System.out.println("Tipo de producto comprado:  "+nom);
					System.out.println("Cantidad del producto:      "+ cant);
					System.out.println("Subtotal:                  $"+base);
					System.out.println("IVA:                       $"+iva);
					System.out.println("Total:                     $"+total);
					System.out.println("El producto C se vende a cantidades mayores a 500 unidades por : " + pre1);
				}
			}	
			break;
		}
		
		

	}

}

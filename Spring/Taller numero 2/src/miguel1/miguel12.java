package miguel1;
import java.util.ArrayList;
import java.util.Scanner;

public class miguel12 {
public static void main(String[] args) {
	System.out.println("+|----------------------------------+");
	System.out.println("+ Autor:  Miguel Alberto Castro     +");
	System.out.println("+ Fecha:  02 / 11 / 2020            +");
	System.out.println("+-----------------------------------+");
	System.out.println();
	
	int caracol = 10/1;
	int ciempies = 10/1;
	int gusano = 10/2;
   
	 if (caracol > ciempies) {
         if (caracol > gusano) {
        	 System.out.println("El que llego primero fue el caracol, y se demor�: "+caracol+" d�as");
         }else {
        	 System.out.println("El que llego primero fue el gusano, y se demor�: "+gusano+" d�as");     
         }
     } else if (ciempies < gusano) {
         System.out.println("El que llego primero fue el cienpi�s, y se demor�: "+ciempies+" d�as");
     } else {
         System.out.println("El que llego primero fue el gusano, y se demor�: "+gusano+" d�as");
     }
 }
	
}

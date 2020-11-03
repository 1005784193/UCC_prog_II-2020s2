public class Argumentos04 {
  public static void main(String[] args) {
	System.out.println("+|----------------------------------+");
	System.out.println("+ Autor:  Miguel Alberto Castro     +");
	System.out.println("+-----------------------------------+");
	System.out.println("+-----------------------------------+");
	System.out.println();
		System.out.println("argumento 1 ="+args[0]);
	 if ("H".compareTolgnoreCase(args[0])){
		 System.out.println("argumento 3 ="+args[0]);
		 	int num1 = Integer.parseInt(args[0]);
			if (num1<16){
				if(num1==10)System.out.println("A");
				if(num1==11)System.out.println("B");
				if(num1==12)System.out.println("C");
				if(num1==13)System.out.println("D");
				if(num1==14)System.out.println("E");
				if(num1==15)System.out.println("F");
				if(num1<10)System.out.println(num1);
			}else{
		 int resultado = num1 / 16;
		     System.out.println("El nuevo numero hexadecimal es: "+resultado%16);
		 //convierten a Hexadecimal
	 }
	 if ("B".compareTolgnoreCase(args[0])){
		 System.out.println("argumento 4 ="+args[0]);
		 	int num2 = Integer.parseInt(args[0]);
			if (num2==1);
            System.out.println("1");
	 }else{ 
			int resultado= num2/2;
		    System.out.println("El nuevo numero binario es: "+resultado);
//convierte a binario
	 }
	 }	 
 else{ 
	 System.out.println("No existe esta opcion");
//mensaje indicando que no existe es opción para convertir el numero
  }
  }
}
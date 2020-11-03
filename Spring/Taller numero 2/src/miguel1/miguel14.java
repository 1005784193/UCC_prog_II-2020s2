package miguel1;

public class miguel14 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  02 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();

		int niña1 = 8;
		int niña2 = 12;
		int pinta1 = 9;
		int pinta2 = 11;
		int sm1 = 10;
		int sm2 = 8;
		int tida1 = (1200 / niña1);
		int tida2 = (1200 / pinta1);
		int tida3 = (1200 / sm1);
		int tveni1 = (1200 / niña2);
		int tveni2 = (1200 / pinta2);
		int tveni3 = (1200 / sm2);
		int tf1 = tida1 + tveni1;
		int tf2 = (tida2 + tveni2);
		int tf3 = (tida3 + tveni3);

		if (tf1<=tf2) {
			if (tf2 <= tf3) {
				System.out.println("No llegaron igual a Buenos Aires, la Niña llegó primero en " +tf1+ " horas.");
				System.out.println("La Pinta llegó en " +tf2+" y la Santa María en "+tf3+ " horas");
			} else {
				System.out.println("No llegaron igual a Buenos Aires, la Santa María llegó primero en " +tf3+ " horas.");
				System.out.println("La Niña llegó en " +tf1+" y la Pinta en "+tf2+ " horas");
			}
		} else if (tf2 <= tf3) {
			System.out.println("No llegaron igual a Buenos Aires, la Pinta llegó primero en " +tf2+ " horas.");
			System.out.println("La Niña llegó en " +tf1+" y la Santa María en "+tf3+ " horas");
		} else {
			System.out.println("No llegaron igual a Buenos Aires, la Santa María llegó primero en " +tf3+ " horas.");
			System.out.println("La Niña llegó en " +tf1+" y la Pinta en "+tf2+ " horas");
		}
	}

}
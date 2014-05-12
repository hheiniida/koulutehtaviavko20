package vk5.java;

import java.util.Scanner;

public class Paivamaara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paivamaara;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print(("Anna päivämäärä muodossa kk-pp-vvvv: "));
		paivamaara = input.nextLine();

           // Tutkitaan, onko annettu päivämäärä haluttua muotoa
		if (paivamaara.matches("\\d{2}-\\d{2}-\\d{4}")) {
                // Otetaan merkkijonosta osamerkkijonot
			String kk = paivamaara.substring(0, 2);
			String pp = paivamaara.substring(3, 5);
			String vv = paivamaara.substring(6);

			System.out.println("Päivämäärä on suomalaisessa muodossa " + pp + "." + kk + "." + vv);
		} else {
			System.out.println("Päivämäärä ei ole muotoa kk-pp-vvvv");
		}
	}
}



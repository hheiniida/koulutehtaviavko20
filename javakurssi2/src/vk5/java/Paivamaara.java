package vk5.java;

import java.util.Scanner;

public class Paivamaara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paivamaara;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print(("Anna p‰iv‰m‰‰r‰ muodossa kk-pp-vvvv: "));
		paivamaara = input.nextLine();

           // Tutkitaan, onko annettu p‰iv‰m‰‰r‰ haluttua muotoa
		if (paivamaara.matches("\\d{2}-\\d{2}-\\d{4}")) {
                // Otetaan merkkijonosta osamerkkijonot
			String kk = paivamaara.substring(0, 2);
			String pp = paivamaara.substring(3, 5);
			String vv = paivamaara.substring(6);

			System.out.println("P‰iv‰m‰‰r‰ on suomalaisessa muodossa " + pp + "." + kk + "." + vv);
		} else {
			System.out.println("P‰iv‰m‰‰r‰ ei ole muotoa kk-pp-vvvv");
		}
	}
}



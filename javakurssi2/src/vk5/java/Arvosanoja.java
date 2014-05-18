package vk5.java;

import java.util.Scanner;

public class Arvosanoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arvostelu;
		int summa = 0;
		int lkm = 0;
		String arvosteluStr;

		Scanner input = new Scanner(System.in);

		System.out.print("Anna arvostelu (0-5), enter lopettaa: ");
		arvosteluStr = input.nextLine();

		// Jos käyttäjä antoi muuta kuin enter (rivinvaihdon)
		
		while (arvosteluStr.length() != 0) {

			// Tutkitaan, onko syötteen sisältönä vain numeroita
			
			if (arvosteluStr.matches("\\d+")) {    // Muutetaan merkkijono luvuksi
				arvostelu = Integer.parseInt(arvosteluStr);   // Onko annettu tieto 0-5
				if (arvostelu >= 0 && arvostelu <= 5) {   // Summataan annettu tieto edellisten annettujen tietojen summaan
					summa = summa + arvostelu;
					lkm++;
				} 
				
				else {
					System.out.println("Arvostelu voi olla numero 0-5");
				}
			} 
			
			else {
				System.out.println("Antamasi syöte ei ole numero");
			}

			System.out.print("Anna arvostelu (0-5), enter lopettaa: ");
			arvosteluStr = input.nextLine();
		}

		// Koska jakaja ja jaettava ovat kokonaislukuja, 
		// on kerrottava (double) vastauksen olevan desimaaliluku
		
		double keskiarvo = (double) summa / lkm;
		System.out.println("Keskiarvo on " + keskiarvo);
	}
	
		
}



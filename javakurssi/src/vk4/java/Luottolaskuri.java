package vk4.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		double hinta;
		int lukumaara;
		double kuukausiera;
		int maksetutErat = 0;
		double jaljellaOlevaHinta;

		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.print("Anna luotollisen ostoksen hinta: ");
		hinta = input.nextDouble();
		jaljellaOlevaHinta = hinta;
		
		System.out.print("Anna kuukausierien lukum‰‰r‰: ");
		lukumaara = input.nextInt();

		kuukausiera = (hinta / lukumaara) + 4;

		

		while (maksetutErat < lukumaara) {
			jaljellaOlevaHinta = (jaljellaOlevaHinta - kuukausiera) + 4;
			System.out.println((maksetutErat + 1) + ". er‰ " + desimaalit.format(kuukausiera)
					+ " euroa, luottoa j‰ljell‰ " + desimaalit.format(jaljellaOlevaHinta)
					+ " euroa");
			maksetutErat = maksetutErat + 1;
		}

	}

}

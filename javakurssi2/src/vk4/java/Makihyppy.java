package vk4.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Makihyppy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner input = new Scanner(System.in);
	
	final int TUOMAREITA = 5;

	double tyylipiste, pienin = 20, suurin = 0, yhteensa = 0;


	for (int i = 0; i < TUOMAREITA; i++) {
		System.out.print("Anna tuomarin " + (i + 1) + ". pisteet: ");
		tyylipiste = input.nextDouble();

		if (tyylipiste > suurin) {
			suurin = tyylipiste;
		}

		if (tyylipiste < pienin) {
			pienin = tyylipiste;
		}

		yhteensa = yhteensa + tyylipiste;
	}

	yhteensa = yhteensa - suurin - pienin;

	DecimalFormat desimaalit = new DecimalFormat("0.0");
	System.out.println("Tyylipisteet ovat " + desimaalit.format(yhteensa));
}
	
		
	}



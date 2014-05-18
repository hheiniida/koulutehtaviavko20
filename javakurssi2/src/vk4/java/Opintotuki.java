package vk4.java;

import java.util.Scanner;

public class Opintotuki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		double op;
		double tuet = 0;
		boolean oikein = false;
		String kk="nolla";

		do {

			System.out.print("Kurssin opintopisteet (0 lopettaa): ");
			op = input.nextDouble();

			tuet = tuet + op;


		} while (op != 0);
		
		if (tuet < 60 && tuet >= 30) {
			kk = "viisi";
		} else if (tuet >= 60) {
			kk = "yhdeksän";
		} else {
			oikein = true;
		}
		
		System.out.println("Saat tukea " + kk + " kuukautta.");

	}
}

package vk6.java;

import java.util.Arrays;
import java.util.Scanner;

public class Lottorivi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerot;

		int numero;
		int lkm;

		Scanner input = new Scanner(System.in);
		System.out.print("Montako numeroa annat (7-10): ");
		lkm = input.nextInt();

                // Luodaan taulukko, kun nyt tiedetään sen koko
		numerot = new int[lkm];

		for (int i = 0; i < lkm; i++) {
			System.out.print("Anna " + (i + 1) + " lottonumerosi: ");
			numero = input.nextInt();

                        // Laitetaan käyttäjän antama numero taulukkoon i:nelle paikalle
			numerot[i] = numero;
		}

                // Lajitellaan annetut lottonumerot nousevaan järjestykseen
		Arrays.sort(numerot, 0, lkm);

		System.out.print("Rivisi oli ");
		
		for (int i = 0; i < lkm; i++) {
			System.out.print(numerot[i] + " ");
		}
		
		input.close();
	
		}

}

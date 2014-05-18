package vk6;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lukija = new Scanner(System.in);
		
		int [] lampotilat = new int [100];
		
		int lampotila = 0;
		int lkm = 0;


		while (lampotila != -999) {

			System.out.print("Anna lämpötila: ");
			lampotila = lukija.nextInt();
			
			if (lampotila == -999) {
				break;
			}

			lampotilat[lkm] = lampotila;
			lkm++;
		}

		Arrays.sort(lampotilat, 0, lkm);

		System.out.print("Annoit lämpötilat: ");

		for (int i = 0; i < lkm; i++) {
			System.out.print(lampotilat[i] + " ");

		}
	}

}

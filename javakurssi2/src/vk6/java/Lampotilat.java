package vk6.java;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lukija = new Scanner(System.in);

		int[] taulukko;
		int lampotila = 0;
		int lkm = 0;

		taulukko = new int[100];

		while (lampotila != -999) {

			System.out.print("Anna lämpötila: ");
			lampotila = lukija.nextInt();
			
			if (lampotila == -999) {
				break;
			}

			taulukko[lkm] = lampotila;
			lkm++;
		}

		Arrays.sort(taulukko, 0, lkm);

		System.out.print("Annoit lämpötilat: ");

		for (int i = 0; i < lkm; i++) {
			System.out.print(taulukko[i] + " ");

		}
	}

}

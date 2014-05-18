package vk3.java;

import java.util.Scanner;

public class ALV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		double verotonhinta;
		int luokka;
		double alv;

		System.out.println("Anna hinta verottomana: ");
		verotonhinta = input.nextDouble();

		System.out.println("Anna alv luokka ( 1-3):");
		luokka = input.nextInt();

		switch (luokka) {

		case 1:
			System.out.println("Tuotteen Alv-hinta on " + verotonhinta
					+ verotonhinta * 23 / 100.0 + " euroa ja Alv:n osuus on "
					+ ((verotonhinta + verotonhinta * 23 / 100.0) - verotonhinta)
					+ " euroa");
			break;

		case 2:
			System.out.println("Tuotteen Alv-hinta on " + verotonhinta
					+ verotonhinta * 13 / 100.0 + " euroa ja Alv:n osuus on "
					+ ((verotonhinta + verotonhinta * 13 / 100.0) - verotonhinta)
					+ " euroa");
			break;

		case 3:
			System.out.println("Tuotteen Alv-hinta on " + verotonhinta
					+ verotonhinta * 9 / 100.0 + " euroa ja Alv:n osuus on "
					+ ((verotonhinta + verotonhinta * 9 / 100.0) - verotonhinta)
					+ " euroa");
			break;
		}

	}

}

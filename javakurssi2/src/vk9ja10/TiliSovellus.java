package vk9ja10;

import java.util.Scanner;

public class TiliSovellus {
	private Tili tili = null;
	static Scanner lukija = new Scanner(System.in);

	private void teeTili() {

		String numero;
		double saldo;

		System.out.println("Anna tilinumero: ");
		numero = lukija.nextLine();

		System.out.println("Anna alkusaldo: ");
		saldo = lukija.nextDouble();

		tili = new Tili(numero, saldo);

	}

	private void teeOtto() {
		double maara;
		System.out.println("Oton m‰‰r‰: ");
		maara = lukija.nextDouble();

		if (tili.otto(maara)) {
			System.out.println("Tilin saldo oton j‰lkeen " + tili.getSaldo());
		} else {
			System.out.println("Tilill‰ ei ole katetta");
		}
	}

	private void teePano() {
		double maara;

		System.out.println("Panon m‰‰r‰: ");
		maara = lukija.nextDouble();

		tili.pano(maara);
		System.out.println("Tilin saldo panon j‰lkeen " + tili.getSaldo());
	}

	private void naytaTili() {
		System.out.println("Tilinumero: " + tili.getNumero());
		System.out.println("Saldo: " + tili.getSaldo());
	}

	private void naytaKorko() {
		System.out.println("Korkoprosentti on " + Tili.getKorkoprosentti());
	}

	private void muutaKorko() {
		double korkoprosentti;

		System.out.print("Uusi korkoprosentti: ");
		korkoprosentti = lukija.nextDouble();

		Tili.setKorkoprosentti(korkoprosentti);
	}

	public static void main(String[] args) {

		TiliSovellus sovellus = new TiliSovellus();

		int valinta = -1;

		sovellus.teeTili();

		do {
			System.out.println("\n1. Otto");
			System.out.println("2. Pano");
			System.out.println("3. Tilin tiedot");
			System.out.println("4. N‰yt‰ korko");
			System.out.println("5. Muuta korko");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-5): ");
			valinta = lukija.nextInt();

			switch (valinta) {
			case 1:

				sovellus.teeOtto();
				break;
			case 2:
				sovellus.teePano();
				break;
			case 3:
				sovellus.naytaTili();
				break;
			case 4:
				sovellus.naytaKorko();
				break;
			case 5:
				sovellus.muutaKorko();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);
	}
}
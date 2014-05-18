package vk11toinentili;

import java.util.Scanner;

public class TiliSovellus {
	private Tili tili = null;
	// omistajaa ei ole aluksi
	private Asiakas omistaja = null;

	private void teeTili() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna tilin omistajan hetu: ");
		String hetu = input.nextLine();
		System.out.print("Anna tilin omistajan nimi: ");
		String nimi = input.nextLine();

		// Luodaan omistaja
		omistaja = new Asiakas(hetu, nimi);

		System.out.print("Anna tilinnumero: ");
		String numero = input.nextLine();
		System.out.print("Anna alkusaldo: ");
		double saldo = input.nextDouble();

		tili = new Tili(numero, saldo);

		// Laitetaan tiliin viite omistajaan k‰ytt‰en Tili-luokan metodia
		tili.setOmistaja(omistaja);

	}

	private void teeOtto() {
		Scanner input = new Scanner(System.in);

		System.out.print("Oton m‰‰r‰: ");
		double maara = input.nextDouble();

		if (tili.otto(maara)) {
			System.out.println("Tilin saldo oton j‰lkeen " + tili.getSaldo());
		} else {
			System.out.println("Tilill‰ ei ole katetta");
		}
	}

	private void teePano() {
		Scanner input = new Scanner(System.in);

		System.out.print("Panon m‰‰r‰: ");
		double maara = input.nextDouble();
		
		tili.pano(maara);
		
		
		System.out.println("Tilin saldo panon j‰lkeen " + tili.getSaldo());
	}

	private void naytaTili() {
		System.out.println("Tilinumero: " + tili.getNumero());
		System.out.println("Saldo: " + tili.getSaldo());
		
		System.out.println("Omistajan nimi: " + tili.getOmistaja().getNimi());
	}

	private void naytaKorko() {
		System.out.println("Korkoprosentti on " + Tili.getKorkoprosentti());
	}

	private void muutaKorko() {
		Scanner input = new Scanner(System.in);

		System.out.print("Uusi korkoprosentti: ");
		double korkoprosentti = input.nextDouble();

		Tili.setKorkoprosentti(korkoprosentti);
	}

	public static void main(String[] args) {
		TiliSovellus sovellus = new TiliSovellus();

		int valinta = -1;
		Scanner input = new Scanner(System.in);

		sovellus.teeTili();

		do {
			System.out.println("\n1. Otto");
			System.out.println("2. Pano");
			System.out.println("3. Tilin tiedot");
			System.out.println("4. N‰yt‰ korko");
			System.out.println("5. Muuta korko");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-5): ");
			valinta = input.nextInt();

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
	
	


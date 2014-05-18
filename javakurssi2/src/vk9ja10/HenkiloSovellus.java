package vk9ja10;

import java.util.Scanner;

public class HenkiloSovellus {
	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		int valinta = 0;
		Henkilo henkilo = new Henkilo();

		do {

			System.out.println("1. Anna henkilö ");
			System.out.println("2. Näytä henkilön tiedot");
			System.out.println("3. Muuta henkilön tietoja ");
			System.out.println("0. Lopetus ");
			System.out.println("Anna valintasi (0-3): ");
			valinta = lukija.nextInt();
			lukija.nextLine();

			switch (valinta) {
			case 1:
				System.out.println("Anna nimi: ");
				String nimi = lukija.nextLine();
				System.out.println("Anna osoite: ");
				String osoite = lukija.nextLine();
				// tiedot tallennetaan henkilo-olioon
				
				henkilo.setNimi(nimi);
				henkilo.setOsoite(osoite);
				break;
				
			case 2:
				System.out.println(henkilo.getNimi());
				System.out.println(henkilo.getOsoite());
				break;
				
			case 3:

				break;

			default:

				break;

			}
		} while (valinta != 0);
	}
}
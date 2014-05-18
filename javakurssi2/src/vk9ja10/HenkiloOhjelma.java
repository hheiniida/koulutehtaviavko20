package vk9ja10;

import java.util.Scanner;

public class HenkiloOhjelma {

	public static void main(String[] args) {

		/*
		 * Henkilo henkilo1 = new Henkilo("Jorma ", "Heikatu 5");
		 * System.out.println(henkilo1.toString());
		 * 
		 * henkilo1.setNimi("Moi"); System.out.println(henkilo1);
		 * System.out.println(henkilo1.getNimi()+ " "+ henkilo1.getOsoite());
		 */

		Scanner lukija = new Scanner(System.in);

		System.out.print("Anna nimi: ");
		String nimi = lukija.nextLine();

		System.out.print("Anna osoite: ");
		String osoite = lukija.nextLine();

		Henkilo henkilo2 = new Henkilo(nimi, osoite);
		Henkilo henkilo3 = new Henkilo();

		// henkilo2.setNimi(nimi);
		// henkilo2.setOsoite(osoite);

		System.out.print("Nimi: " + henkilo2.getNimi());
		System.out.println(" Osoite: " + henkilo2.getOsoite());

		System.out.print("\nAnna nimi: ");
		String nimi2 = lukija.nextLine();

		System.out.print("Anna osoite: ");
		String osoite2 = lukija.nextLine();

		henkilo3.setNimi(nimi2);
		henkilo3.setOsoite(osoite2);

		System.out.print(henkilo3.toString());
	}

}


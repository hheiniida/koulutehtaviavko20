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
			System.out.print("Anna valintasi (0-3): ");
			valinta = lukija.nextInt();
			lukija.nextLine();

			switch (valinta) {
			case 1:
				System.out.print("Anna nimi: ");
				String nimi = lukija.nextLine();
				
				
				System.out.print("Anna osoite: ");
				String osoite = lukija.nextLine();
				// tiedot tallennetaan henkilo-olioon
				
				henkilo.setNimi(nimi);
				henkilo.setOsoite(osoite);
				break;
				
			case 2:
				if(henkilo != null){
				System.out.print("nimi="+henkilo.getNimi());
				System.out.println("osoite="+henkilo.getOsoite());
				}
				else{
					System.out.print("Henkilöä ei ole");
				}
				break;
				
			case 3:
				System.out.print("Anna nimi: ");
				String nimi2 = lukija.nextLine();
				henkilo.setNimi(nimi2);
				
				System.out.print("Anna osoite: ");
				String osoite2 = lukija.nextLine();
				henkilo.setOsoite(osoite2);
				
				break;

			default:
				System.out.print("Henkilöä ei ole");
				break;

			}
		} while (valinta != 0);
	}
}
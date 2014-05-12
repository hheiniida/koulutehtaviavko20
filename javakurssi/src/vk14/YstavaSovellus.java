package vk14;

import java.util.HashMap;
import java.util.Scanner;

public class YstavaSovellus {

	static Ystava ystava;

	static Scanner lukija = new Scanner(System.in);

	static HashMap<String, Ystava> ystavat = new HashMap<>();

	public static void main(String[] args) {

		int toiminto;

		boolean olenkoPaalla = true;

		while (olenkoPaalla ==true) {
			System.out
					.print("1) Lisää ystävä\n2) Etsi ystävä\n3) Poista Ystävä\n4) Tulosta ystävät\n0) Lopeta");
			toiminto = lukija.nextInt();

			switch (toiminto) {
			case 1:
				lisaaYstava();
				break;
			case 2:
				etsiYstava();
				break;
			case 3:
				poistaYstava();
				break;
			case 4:
				tulostaYstavat();
				break;
			case 0:
				olenkoPaalla = false;
				break;
			default:
				break;
			}
		}

	}

	private static void tulostaYstavat() {

	}

	private static void poistaYstava() {
		System.out.print("Anna ystävän lempinimi: ");
		String poistettava = lukija.nextLine();

		System.out.print("Poistetaan ystävän tiedot: ");
		ystavat.get(poistettava).toString();

		ystavat.remove(ystavat.get(poistettava));

	}

	private static void etsiYstava() {
		System.out.print("Anna ystävän lempinimi: ");
		String etsittava = lukija.nextLine();
		if (!ystavat.containsKey(etsittava)) {

			System.out.print("Ystävää, jonka lempinimi on " + etsittava
					+ " ei ole");
			return;

		} else {

			System.out.print("Ystävän tiedot: "
					+ ystavat.get(etsittava).toString());

		}

	}

	private static void lisaaYstava() {

		String lempinimi;
		String nimi;
		String puhelin;
		String syntymapaivamaara;

		System.out.print("Anna ystävän lempinimi: ");
		lempinimi = lukija.nextLine();

		System.out.print("Anna ystävän nimi: ");
		nimi = lukija.nextLine();

		System.out.print("Anna ystävän puhelinnumero: ");
		puhelin = lukija.nextLine();

		System.out
				.print("Anna ystävän syntymäpäivämäärä muodossa pp.kk.vvvv: ");
		syntymapaivamaara = lukija.nextLine();

		ystava = new Ystava(lempinimi, nimi, puhelin, syntymapaivamaara);
		ystavat.put(ystava.getLempinimi(), ystava);
	}

}

class Ystava {
	String lempinimi;
	String nimi;
	String puhelin;
	String syntymapaivamaara;

	public Ystava() {

	}

	public Ystava(String lempinimi, String nimi, String puhelin,
			String syntymapaivamaara) {
		super();
		this.lempinimi = lempinimi;
		this.nimi = nimi;
		this.puhelin = puhelin;
		this.syntymapaivamaara = syntymapaivamaara;

	}

	public String getLempinimi() {
		return lempinimi;
	}

	public void setLempinimi(String lempinimi) {
		this.lempinimi = lempinimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getPuhelin() {
		return puhelin;
	}

	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}

	public String getSyntymapaivamaara() {
		return syntymapaivamaara;
	}

	public void setSyntymapaivamaara(String syntymapaivamaara) {
		this.syntymapaivamaara = syntymapaivamaara;
	}

	@Override
	public String toString() {
		return "lempinimi=" + lempinimi + ", nimi=" + nimi + ", puhelin="
				+ puhelin + ", syntpvm=" + syntymapaivamaara;
	}

}
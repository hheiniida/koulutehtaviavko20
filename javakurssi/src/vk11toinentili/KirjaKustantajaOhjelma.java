package vk11toinentili;

import java.util.Scanner;

import vk11.Kirja;
import vk11.Kustantaja;

public class KirjaKustantajaOhjelma {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);

		String kirjanNimi;
		String isbn;
		double hinta;
		String kustantajanNimi;
		String kustantajanOsoite;
		String kustantajanPuhelin;
		Kustantaja kustantaja;
		Kirja kirja;

		System.out.print("Kirjan nimi: ");
		kirjanNimi = lukija.nextLine();

		System.out.print("Kirjan isbn: ");
		isbn = lukija.nextLine();

		System.out.print("Kirjan hinta: ");
		hinta = lukija.nextDouble();

		System.out.print("Kustantajan nimi: ");
		lukija.nextLine();
		kustantajanNimi = lukija.nextLine();

		System.out.print("Kustantajan osoite: ");
		kustantajanOsoite = lukija.nextLine();

		System.out.print("Kustantajan puhelin: ");
		kustantajanPuhelin = lukija.nextLine();

		kustantaja = new Kustantaja(kustantajanNimi, kustantajanOsoite,
				kustantajanPuhelin);
		kirja = new Kirja(kirjanNimi, isbn, hinta, kustantaja);
		System.out.println(kirja.toString());

	}

}

package vk11;

import java.util.Scanner;

public class HenkiloAutoOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lukija = new Scanner(System.in);
		String malli;
		String merkki;
		String rekkari;
		int vuosimalli;
		String nimi;
		String osoite;

		Auto auto1 = new Auto();
		Henkilo henkilo;

		System.out.print("Anna merkki: ");
		merkki = lukija.nextLine();

		System.out.print("Anna malli: ");
		malli = lukija.nextLine();

		System.out.print("Anna rekisterinumero: ");
		rekkari = lukija.nextLine();

		System.out.print("Anna vuosimalli: ");
		vuosimalli = lukija.nextInt();
		
		
		System.out.print("Anna nimi: ");
		lukija.nextLine();
		nimi = lukija.nextLine();
		
		
		System.out.print("Anna osoite: ");
		
		osoite = lukija.nextLine();
		

		auto1.setMerkki(merkki);
		auto1.setMalli(malli);
		auto1.setRekkari(rekkari);
		auto1.setVuosimalli(vuosimalli);
		
		henkilo=new Henkilo(nimi, osoite, auto1);
		
		
		System.out.println(henkilo.toString());
		//System.out.println("Rekisterinumero: " + " " + auto1.getRekkari());
		//System.out.print("Vuosimalli: " + " " + auto1.getVuosimalli());
	}

}

package vk12;

import vk9ja10.Tuote;

public class TuoteOhjelma {

	public static void main(String[] args) {
		int numero;
		String nimi;
		double hinta;

		Tuote tuote1 = new Tuote();

		tuote1.setNumero(200);
		tuote1.setNimi("Saha");
		tuote1.setHinta(23.56);

		System.out.println("Numero: "+tuote1.getNumero());
		System.out.println("Nimi: "+tuote1.getNimi());
		System.out.println("Hinta: "+tuote1.getHinta());

		
		Tuote tuote2 = new Tuote(300,"Vasara", 13.5); // olio luodaan käyttäen parametriä

		System.out.println("\nNumero: "+tuote2.getNumero());
		System.out.println("Nimi: "+tuote2.getNimi());
		System.out.println("Hinta: "+tuote2.getHinta());
		
		
	

	}

}

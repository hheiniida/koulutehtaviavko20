package vk9ja10;

import java.util.Scanner;

public class TiliOhjelma {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		Tili tili = new Tili();

		String tilinumero;
		double saldo;
		double pano;
		double otto;

		System.out.println("Anna tilinumero: ");
		tilinumero = lukija.nextLine();
		tili.setNumero(tilinumero);

		System.out.println("Anna alkusaldo: ");
		saldo = lukija.nextDouble();
		tili.setSaldo(saldo);

		System.out.println("Panon m‰‰r‰: ");
		pano = lukija.nextDouble();
		tili.pano(pano);

		System.out.println("Tilin saldo panon j‰lkeen " + tili.getSaldo());

		System.out.println("Oton m‰‰r‰: ");
		otto = lukija.nextDouble();

		if (tili.otto(pano)) {
			System.out.println("Tilin saldo oton j‰lkeen " + tili.getSaldo());
		} else {
			System.out.println("Tilill‰ ei ole katetta");
		}
		System.out.println("\nTilinumero: " + tili.getNumero());
		System.out.println("Saldo: " + tili.getSaldo());
	}

}


	
	
	


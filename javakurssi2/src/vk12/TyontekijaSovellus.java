package vk12;

import java.util.Scanner;

public class TyontekijaSovellus {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		int osastonNumero;
		String tyontekijanNimi;
		int tyontekijanNumero;
		String osastonNimi;
		double veroprosentti;
		double kuukausipalkka;
		
		System.out.print("Anna osaston numero: ");
		osastonNumero =lukija.nextInt();
		lukija.nextLine();
		
		System.out.print("Anna osaston nimi: ");
		osastonNimi =lukija.nextLine();
		
		System.out.print("Anna ty�ntekij�n numero: ");
			tyontekijanNumero=lukija.nextInt();
			lukija.nextLine();
			
		System.out.print("Anna ty�ntekij�n nimi: ");
			tyontekijanNimi=lukija.nextLine();
			
		System.out.print("Anna kuukausipalkka: ");
			kuukausipalkka=lukija.nextDouble();
			lukija.nextLine();
			
		System.out.print("Anna veroprosentti: ");
			veroprosentti =lukija.nextDouble();
			lukija.nextLine();
			
			
		Osasto osasto = new Osasto (osastonNimi, osastonNumero);
		Palkka palkka = new Palkka (kuukausipalkka, veroprosentti);
		Tyontekija tyontekija = new Tyontekija(tyontekijanNumero, tyontekijanNimi, osasto, palkka);
			
			
			
			
		System.out.print("Ty�ntekij� "+tyontekija.getNimi()+" ty�skentelee osastolla "+ osasto.getNimi()+ "\nKuukausipalkka on "+tyontekija.getPalkka().getKuukausipalkka());
		
		
		
	}

}

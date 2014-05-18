package vk13;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class SanalistaSovellus {

	private List<String> sanaLista = new ArrayList<String>();

	private void lisaaSana() {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna sana: ");
		String sana = lukija.nextLine();
		sanaLista.add(sana);
	}

	private void listaaSanat() {
		for (int i = 0; i < sanaLista.size(); i++) {
			System.out.println(sanaLista.get(i) + " ");
		}

	}

	private void laskeSanat() {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna sana, minkä esiintymiskerrat lasketaan: ");
		String sana = lukija.nextLine();
		int sananEsiintymiskerrat = 0;

		for (int i = 0; i < sanaLista.size(); i++) {
			if (sanaLista.get(i).equals(sana)) {
				sananEsiintymiskerrat = sananEsiintymiskerrat + 1;
			}
		}
		System.out.println("Sana " + sana + " esiintyi "
				+ sananEsiintymiskerrat + " kertaa");
	}

	private void poistaSana() {
		Scanner lukija=new Scanner(System.in);
		System.out.print("Anna sana, joka poistetaan: ");
		String sana=lukija.nextLine();
		
		
		
		
		for(int i=0; i< sanaLista.size();i++){
			if(sanaLista.get(i).equals(sana)){
				sanaLista.remove(i);
				System.out.println("Jokainen sana "+sana+" on poistettu listasta");
			}
			else {
				System.out.println("Sanaa "+sana+ " ei ollut listassa");
				break;
			}
		
		}
		
			
				
	
	}

	public static void main(String[] args) {
		SanalistaSovellus ohjelma = new SanalistaSovellus();

		int valinta;

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1 = Lisää sana");
			System.out.println("2 = Listaa sanat");
			System.out.println("3 = Laske sanat");
			System.out.println("4 = Poista sanat");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi: ");

			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				ohjelma.lisaaSana();
				break;

			case 2:
				ohjelma.listaaSanat();
				break;

			case 3:
				ohjelma.laskeSanat();
				break;

			case 4:
				ohjelma.poistaSana();
				break;

			}
		} while (valinta != 0);
	}

}

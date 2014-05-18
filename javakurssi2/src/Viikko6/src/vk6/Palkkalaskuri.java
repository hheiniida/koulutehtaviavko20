package vk6;

import java.util.Scanner;

public class Palkkalaskuri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner lukija = new Scanner(System.in);

	int [] tunnitTaulu=null;	
	int tunnit;
	double tuntipalkka;
	int paivat=0;	
	int yht=0;
	double bpalkka;
	
		
	System.out.print("Anna tuntipalkkasi: ");
	tuntipalkka = lukija.nextInt();
	
	
	System.out.print("Monenko päivän tuntimäärät annat: ");
	paivat= lukija.nextInt();
	
	
	for(int i=1; i<=paivat; i++){
	System.out.print("Anna tuntien määrä päivässä: ");
	tunnit=lukija.nextInt();
	yht= yht+tunnit;
	
	tunnitTaulu[i]= tunnit;
	}
	
	bpalkka = yht * tuntipalkka;
	
	
	
		
		System.out.print("Tunteja yhteensä: "+ yht);
		System.out.println("Bruttopalkkasi: "+ bpalkka);
		System.out.println("Annoit tunnit: ");
		
		for (int i = 0; i <=paivat; i++) {
			System.out.print(tunnitTaulu[i] + " ");
		}
	}

}

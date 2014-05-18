package vk6;

import java.util.Scanner;

public class MinigolfTilasto {

	/**
	 * @Heini
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lukija = new Scanner (System.in);
	
	int lkm;
	int tulos;
	int yht=0;
	int [] taulu=null;
	double keskiarvo=0;
	
	System.out.print("Anna pelaajien lukumäärä: ");
	lkm = lukija.nextInt();
	//taulu= new int[??];
	
	for(int i =1; i<=lkm; i++){
		System.out.print("Anna pelaajan "+i +". tulos: ");	
		tulos = lukija.nextInt();
		taulu[i]= tulos;
		yht = yht + tulos;	
	
	}	
		
		
		
	keskiarvo = (double) yht / lkm;	
	System.out.println("Pelien keskiarvo oli "+ keskiarvo);	
	
	System.out.println("Pienin peli oli ");	
	
	System.out.println("Suurin peli oli ");	
	
	
	System.out.println(" pelaajalla oli keskiarvoa pienempi tulos");	
	}

}

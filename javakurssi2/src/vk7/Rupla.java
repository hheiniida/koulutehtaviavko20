package vk7;

import java.util.Scanner;

public class Rupla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lukija = new Scanner(System.in)	;
		
	System.out.println("Anna ruplat: ");
	double ruplat =lukija.nextDouble();
	
	double ruplatEuroina=0;
	
	
	
	ruplatEuroina = muunnaEuroiksi(ruplat); // metodin kutsu
	
	System.out.println("Ruplat euroina: "+ ruplatEuroina);
	
	
	
	
		
	} public static double muunnaEuroiksi (double ruplat){
		
		double ruplatEuroina = 0;
		ruplatEuroina = ruplat / 50.5348;
		
		return ruplatEuroina;
	}

}

package vk7;

import java.util.Scanner;

public class Rupla2 { // metodi

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lukija = new Scanner(System.in)	;
		
		System.out.println("Anna ruplat: ");
		double ruplat =lukija.nextDouble();
		
		double ruplatEuroinaTammikuussa = muunnaEuroiksi(ruplat, 1);
		double ruplatEuroinaMaaliskuussa = muunnaEuroiksi(ruplat, 3);
		double ruplanArvoOnLaskenut = ((100-(ruplatEuroinaMaaliskuussa
				/ ruplatEuroinaTammikuussa)*100));
		

		
		System.out.println("Ruplat euroina: "+ ruplatEuroinaMaaliskuussa);
		System.out.println("Ruplan arvo on laskenut: "+ ruplanArvoOnLaskenut);
		
		
		
			
	} public static double muunnaEuroiksi (double ruplat, int kuukausi){
		
			double ruplatEuroina = 0;
			
			
			if(kuukausi ==3){
				ruplatEuroina=ruplat/50.5348;
			}else if(kuukausi==1){
				ruplatEuroina= ruplat / 45;
			}
			
			
			return ruplatEuroina;
		}
	
		
		
	}



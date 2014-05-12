package vk6.java;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner (System.in);
		
		int maara=1;
		Integer[] lottonumerot = new Integer[7];
		
		
		while(maara <=7){
			int satunnainenLuku = (int) (Math.random()*39)+1;
			
			if (Arrays.asList(lottonumerot).contains(satunnainenLuku)){
				
			} else {
				lottonumerot[maara-1] = satunnainenLuku;
				maara++;
				
			}
			
		}
		int oikeatNumerot=0;
		int omienMaara =0;
		
		while(omienMaara < 7){
			System.out.println("Anna "+ (omienMaara +1)+ ". lottonumerosi: ");
			
			int lottonumero = input.nextInt();
			
			
			for(int i =0; i < lottonumerot.length; i++){
				if(lottonumerot[i]== lottonumero){
					oikeatNumerot++;
				}
			}
			
			omienMaara++;
		}
		
		Arrays.sort(lottonumerot);
		System.out.println("Sinulla oli "+oikeatNumerot+ " oikein.");
		System.out.println("Oikea rivi oli ");
		for(int i=0; i < lottonumerot.length; i++);
			System.out.println(lottonumerot[i] +" ");
	}

}

package vk5.java;

import java.util.Scanner;

public class RekisteriNro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner lukija = new Scanner(System.in);
	String rekkari;
	String merkki;
		
		
	System.out.print("Anna rekisterinumero: ");
	rekkari = lukija.nextLine();
		
		
	if(rekkari.matches("\\w{3}-\\d{3}")){
		
	System.out.println("Rekisterinumero on kelvollinen");	
	}
	else{
		System.out.println("virhe");
	}
	System.out.println("Anna merkki: ");
	merkki = lukija.nextLine();
	
	if(merkki.matches("\\w{2,30}")){
		System.out.print("Merkki on kelvollinen");
	}
	else{
		System.out.print("virhe");
	}
	}

}

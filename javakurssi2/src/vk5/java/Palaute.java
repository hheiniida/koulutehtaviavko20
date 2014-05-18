package vk5.java;

import java.util.Scanner;

public class Palaute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
		
		
	char merkit;
	String palaute;
	boolean loytyiKysymysmerkki = false;
	
	System.out.println("Kirjoita palautteesi: ");
	palaute = input.nextLine();
	
	
	
	System.out.println("Palautteesi pituus oli "+ palaute.length() +" merkkiä.");
	
	for(int i=0; i< palaute.length(); i++){
		
	if(palaute.charAt(i)=='?'){
	loytyiKysymysmerkki = true;
	
	}
	}
	if(loytyiKysymysmerkki == true){
	System.out.println("Kysymykseesi vastataan mahdollisimman pian.");	
		
	}
	else{
		System.out.println("Palautteesi on otettu vastaan.");
		
	}
	}
	}	
		
		
	


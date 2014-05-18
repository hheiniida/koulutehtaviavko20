package vk5.java;

import java.util.Scanner;

public class Nimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
		
	String kokonimi="";
	String etunimi="";
	String sukunimi="";

	
	System.out.print("Kirjoita etu- ja sukunimesi: ");
	kokonimi = input.nextLine();
	
	
	
	kokonimi = kokonimi.trim();
			
	int valilyonninPaikka = kokonimi.indexOf(" ");
	etunimi = kokonimi.substring(0, valilyonninPaikka );
	sukunimi = kokonimi.substring(valilyonninPaikka + 1);
	
	etunimi = etunimi.toLowerCase();
	
	etunimi = (etunimi.charAt(0)+ "").toUpperCase() +etunimi.substring(1);
	
	sukunimi= sukunimi.toUpperCase();
	
	
	

	System.out.println("Etu- ja sukunimi: " + etunimi+" "+ sukunimi);      
	}
}



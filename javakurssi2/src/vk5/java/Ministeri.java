package vk5.java;

import java.util.Scanner;

public class Ministeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
	String kirjasinkoko;
	String vastaus;
	
		
	System.out.println("Oliko Ministeri Arhinmäki humalassa?");
	vastaus = input.nextLine();
	
	System.out.println("Kirjoitetaanko suurella vai pienellä?");
	kirjasinkoko = input.nextLine();
	
		
	if (kirjasinkoko.equals("suurella")){
		System.out.println(vastaus.toUpperCase());
	}
	else{
		System.out.println(vastaus.toLowerCase());
	}
	}
		
		}



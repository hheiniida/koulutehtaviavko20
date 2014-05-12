package vk3.java;

import java.util.Scanner;

public class Ylinopeussakko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
	int rajoitus;
	int nopeus;
	int erotus;
	
	System.out.println("Anna rajoitus: ");
	rajoitus = input.nextInt();
	
	System.out.println("Anna nopeus: ");
	nopeus = input.nextInt();	
	
	erotus = nopeus - rajoitus;
		
	if(nopeus>=10&& nopeus <=60 && erotus<=15 && erotus>0){
		System.out.println("Ylinopeus, rikesakko 85e");
	}
		
	else if(nopeus>=10&&nopeus<=60 && erotus >15 && erotus >=20){
		System.out.println("Ylinopeus, rikesakko 115e");
	}
	else if(nopeus>=70&&nopeus<=120 && erotus <=15 && erotus >0){
	System.out.println("Ylinopeus, rikesakko 70e");	
	}
	else if(nopeus >=70&&nopeus<=120 && erotus >15 && erotus <=20) {
		System.out.println("Ylinopeus, rikesakko 100e");
	}
	else if ( erotus >20){
		System.out.println("Ylinopeus, päiväsakko");
		
	}
	else{
		System.out.println("Ajat rajoitusten mukaisesti :)");
	}
	}

}

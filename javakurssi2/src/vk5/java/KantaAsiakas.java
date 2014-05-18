package vk5.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KantaAsiakas { // Kantaasiakas

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lukija= new Scanner(System.in);
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	String kantaAsiakas="";
	double ostokset;	
	double alennus=0;	
		
	System.out.print("Anna ostosten summa: ");
	ostokset = lukija.nextDouble();
	lukija.nextLine();
	
	System.out.print("Oletko kanta-asiakas (kyll�, ei): ");
	kantaAsiakas = lukija.nextLine();
	
	if(kantaAsiakas.equals("kyll�") && ostokset>1000){
		alennus= ostokset* 0.01;
		ostokset = ostokset-alennus;
		
	}
	else if(kantaAsiakas.equals("kyll�") && ostokset<=1000){
		alennus= ostokset* 0.05;
		ostokset = ostokset-alennus;
	}
	else if(kantaAsiakas.equals("ei")){
		alennus= ostokset* 0.0;
		ostokset = ostokset-alennus;
		
	}
	
		
		System.out.println("Ostosten loppusumma on "+ desimaalit.format(ostokset));
		
		
		
		
	}

}

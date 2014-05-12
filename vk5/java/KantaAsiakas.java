package vk5.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KantaAsiakas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lukija= new Scanner(System.in);
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	String kantaAsiakas;
	double ostokset;	
	double alennus=0;	
		
	System.out.print("Anna ostosten summa: ");
	ostokset = lukija.nextDouble();
	
	System.out.print("Oletko kanta-asiakas (kyllä, ei): ");
	kantaAsiakas = lukija.nextLine();
	
	if(kantaAsiakas.equals("kyllä")&& ostokset>1000){
		alennus= ostokset*1.0;
		ostokset = ostokset-alennus;
		
	}
	else if(kantaAsiakas.equals("kyllä")&& ostokset<=1000){
		alennus= ostokset*0.5;
		ostokset = ostokset-alennus;
	}
	else if(kantaAsiakas.equals("ei")){
		alennus= ostokset*0.0;
		ostokset = ostokset-alennus;
		
	}
	
		
		System.out.println("Ostosten loppusumma on "+ desimaalit.format(ostokset));
		
		
		
		
	}

}

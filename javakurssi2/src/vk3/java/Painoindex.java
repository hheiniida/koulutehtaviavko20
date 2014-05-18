package vk3.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Painoindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
	double paino;
	double pituus;
	double indeksi;
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	System.out.println("Anna paino: ");
	paino = input.nextDouble();
	
	System.out.println("Anna pituus: ");
	pituus = input.nextDouble();
	
	indeksi = paino / (pituus* pituus);
		
	if (indeksi <= 18.4){
		System.out.println(desimaalit.format(indeksi) + " - normaalia alhaisempi paino.");
		
	}
		
	else if (indeksi >= 18.5 && indeksi <= 24.9){
		System.out.println(desimaalit.format(indeksi) +" - normaali paino.");
	}
	
	else{
		System.out.println(desimaalit.format(indeksi) +" - ylipaino.");
		
	}
}
	}

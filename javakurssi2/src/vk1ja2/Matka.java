package vk1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
		
		int pituus;   
		int keskinopeus;
		double aika;
		
		
		System.out.print("Anna matka:");
		pituus = input.nextInt();
		
		System.out.print("Anna nopeus:");
		keskinopeus = input.nextInt();
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		aika = (double) pituus/keskinopeus;
		
		System.out.print("Aikaa menee " + desimaalit.format(aika) + " tuntia");
		
		
		
	}

}

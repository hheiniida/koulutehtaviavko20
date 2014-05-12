package vk5.java;

import java.util.Scanner;

public class Sananlasku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lukija = new Scanner(System.in);
	
		
	String nimi = "";	
	int lkm = 0;
	int merkkienMaara = 0;
	
	while (!nimi.equals("LOPPU"))	{
		
		System.out.println("Anna sananlasku: ");
		nimi = lukija.nextLine();
		merkkienMaara = merkkienMaara + nimi.length();
		lkm++;
	}
	lkm =lkm-1;
	System.out.println("Sananlaskuja oli "+lkm+" kappaletta.");
	System.out.println("Sananlaskuja oli merkkejä yhteensä "+merkkienMaara);
	
	}

}

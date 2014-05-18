package vk6.java;

import java.util.Scanner;

public class TuulenNopeus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lkm;
		
		
		Scanner lukija = new Scanner(System.in);
		
		
	 String [] tuulet = {"Tyyni", "Hiljainen", "Heikko", "Heikonlainen", "Kohtalainen",
				"Navakka", "Kova", "Luja", "Raju", "Myrsky", "Kova myrsky", "Ankara myrsky",
				"Hirmumyrsky"};
	
	System.out.print("Anna tuulen lukema boforeissa (0-12): ");
	lkm = lukija.nextInt();
	
	if(lkm<=12)	{
		
	
	System.out.print("Lukemalla "+ lkm + " tuulen nopeus on "+  tuulet[lkm] );	
		
	}
	else{
		System.out.print("Lukemaa "+lkm+" ei ole boforeissa");
	}
			
		
	}

}

package vk6.java;

import java.util.Arrays;
import java.util.Scanner;

public class PeArvonta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
		
		
		final int MAX = 15;

		
		String[] nimet = new String[MAX];
		String nimi;
		int lkm = 0;
		int voittaja;

		

		System.out.print("Anna nimi: ");
		nimi = input.nextLine();
		nimi = nimi.trim();

		
		while (lkm < MAX && nimi.length() != 0) {
			
			nimet[lkm] = nimi;
			lkm++;

			
			if (lkm < MAX) {
				System.out.print("Anna nimi: ");
				nimi = input.nextLine();
				nimi = nimi.trim();
			} else {
				System.out.println("Nimiä on jo maksimi " + MAX
						+ " kappaletta.");
			}
		}


		voittaja = (int)(Math.random()*lkm);
		
		System.out.println("Voittaja on "+ voittaja);
		
		}	
		
	}



package vk5.java;

import java.util.Scanner;

public class PienellaSuurella {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String teksti;
			String nayttaminen;

			Scanner input = new Scanner(System.in);

			System.out.print("Kirjoita teksti: ");
			teksti = input.nextLine();

			System.out.print("N�ytet��nk� suurella vai pienell�: ");
			nayttaminen = input.nextLine();

	                // Onko k�ytt�j�n antaman merkkijonon sis�lt�n� "pienell�"
			if (nayttaminen.equals("pienell�")) {
				teksti = teksti.toLowerCase();
			}
			else if (nayttaminen.equals("suurella")) {
				teksti = teksti.toUpperCase();
			}

			System.out.println("Teksti on " + nayttaminen + " " + teksti);
		}

	
	}



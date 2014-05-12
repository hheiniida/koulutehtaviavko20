package vk7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Verkkokauppa {
	
	static DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {
		 
		double yhteispaino = kysyJaLaskePainot();
		naytaPostikulut(yhteispaino);
		
	}

	public static double kysyJaLaskePainot() {

		double paino;
		double summa = 0;
		int lkm = 0;

		System.out.print("Anna paino (-1 lopettaa): ");
		paino = lukija.nextDouble();

		while (paino >= 0) {
			summa = summa + paino;
			lkm = lkm + 1;
			System.out.print("Anna paino (-1 lopettaa): ");
			paino = lukija.nextDouble();
		}
		
		return summa;
	
	
	}

	public static void naytaPostikulut(double summa) {
		double kulut;  
		
		if (summa < 20) {
			kulut = 8.10;
		} else if (summa >= 20 && summa <= 100) {
			kulut = 14.00;
		} else {
			kulut = 19.00;
		}

		System.out.println("Yhteispaino on " + desimaalit.format(summa) + " kiloa");
		System.out.print("Postituskulut ovat " + desimaalit.format(kulut) + " euroa.");
		
		
	}
}

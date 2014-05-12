package vk1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alennus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		double hinta;   
		int alennusprosentti;
		double aleHinta;
		
		
		
		System.out.print("Anna alentamaton hinta: ");
		hinta = input.nextDouble();
		
		System.out.print("Anna alennusprosentti: ");
		alennusprosentti = input.nextInt();
		
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		aleHinta = hinta *(100- alennusprosentti)/100.0;
		
		System.out.print("Alennettu hinta on " + desimaalit.format(aleHinta) );
		
		
	}

}

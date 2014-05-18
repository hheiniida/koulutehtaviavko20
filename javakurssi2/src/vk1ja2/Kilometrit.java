package vk1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner input = new Scanner(System.in);
	
	double ajettu;
	double korvaus;
	
	System.out.print("Anna kilometrit: ");
	ajettu = input.nextDouble();
	
	korvaus = ajettu * 0.45;
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	System.out.println("Korvauksen m‰‰r‰: "+ desimaalit.format(korvaus)+"euroa");
		
	}

}

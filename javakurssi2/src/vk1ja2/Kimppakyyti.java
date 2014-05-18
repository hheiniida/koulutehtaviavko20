package vk1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kimppakyyti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);	
		
	double ajettu;
	double kulutus;
	double bensaHinta;
	int lkm;
	double hinta;
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	System.out.print("Anna ajetut kilometrit: ");
	ajettu = input.nextDouble();
	
	System.out.print("Auton kulutus per 100km: ");
	kulutus = input.nextDouble();
	
	System.out.print("Bensan litrahinta: ");
	bensaHinta = input.nextDouble();
	
	System.out.print("Kyytil‰isten lukum‰‰r‰: ");
	lkm = input.nextInt();
	
	hinta = kulutus/100.0*bensaHinta*ajettu/lkm;
	
			System.out.print("Jokainen maksaa: "+ desimaalit.format(hinta)+ " euroa");
	
	}

}

package vk3.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Valityspalkkio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
	double myyntihinta;
	double valityspalkkio;
	final double PALKKIOPROSENTTI = 3.44;
	final double MINPALKKIO = 2214.00;
	
	System.out.println("Anna myyntihinta: ");
	myyntihinta = input.nextDouble();
	
	valityspalkkio= myyntihinta * (PALKKIOPROSENTTI / 100);
	
	if( valityspalkkio < MINPALKKIO){
		valityspalkkio = MINPALKKIO;
	}
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	System.out.println("Myyntipalkkio on "+ desimaalit.format(valityspalkkio));
	
	}

}

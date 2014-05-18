package vk1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ALV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
		
	int alvP = 23;
	double hinta;
	double alvHinta;
	double alv;
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	System.out.print("Anna veroton hinta: ");
	hinta = input.nextDouble();
	alvHinta = hinta + hinta * alvP/100.0;
	System.out.println("Tuotteen alvillinen hinta on: "+ desimaalit.format(alvHinta));
	alv = alvHinta-hinta;
	System.out.println("Alv:n osuus on "+ desimaalit.format(alv)+" euroa");
	
	}

}

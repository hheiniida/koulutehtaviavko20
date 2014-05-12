package vk7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ylevero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija =new Scanner (System.in);
		DecimalFormat desimaalit = new DecimalFormat("0,00");
		
		double tulot;
		int ika;
		double ylevero;
		
		System.out.print("Anna vuositulosi ja ikäsi: ");
		tulot= lukija.nextDouble();
		ika=lukija.nextInt();
		
		ylevero=laskeYlevero(tulot, ika);
		
		System.out.print("Ylevero on " + desimaalit.format(ylevero));
		
		
	}


public static double laskeYlevero(double tulot, int ika){
	
	double ylevero; 
	
	
	if(ika<=18|| tulot< 7353){
		ylevero=0;
		
	}
	else{
		ylevero = tulot * 0.68/100;
		if(ylevero>140){
			ylevero=140;
			
		}
	}
	return ylevero;
	
}
}
package vk4.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Verkkokauppa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);	
			
		double paino;
		double kulut;
		double summa=0;
		int lkm=0;
			
		System.out.print("Anna paino (-1 lopettaa): ");
		paino= input.nextDouble();	
		
	 while (paino >=0){
		summa = summa + paino;
		lkm = lkm+1;
		System.out.print("Anna paino (-1 lopettaa): ");
		paino = input.nextDouble();
	 }
	if(summa<20){
		kulut=8.10;
	}
	else if(summa>=20 && summa <=100){
		kulut = 14.00;
	}
	else{
		kulut=19.00;
	}

	System.out.println("Yhteispaino on " + desimaalit.format(summa) +" kiloa");
	System.out.print("Postituskulut ovat " + desimaalit.format(kulut)+" euroa.") ;	
	}		
			
			
	public static double kysyJaLaskePainot(){
		
		
		return 0;
	}
	
	public static void naytaPostituskulut(double yhteispaino){
		
		
		
		
	}
}

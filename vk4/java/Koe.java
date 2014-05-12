package vk4.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Koe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	Scanner input= new Scanner(System.in);
	
	int pisteet;
	
	int summa=0; 
	int lkm=0;
	
	System.out.print("Anna koepisteet: ");
		pisteet= input.nextInt();	
		
	 while (pisteet >=0){
		summa = summa + pisteet;
		lkm = lkm+1;
		System.out.print("Anna koepisteet: ");
		pisteet = input.nextInt();
	 }
	double keskiarvo = (double) summa / lkm;
	
	
	System.out.print("Keskiarvo on " + desimaalit.format(keskiarvo)) ;	
	}	
		
		
		
	
		
		
		
		
}



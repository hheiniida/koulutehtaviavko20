package vk3.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                                                      

	Scanner input = new Scanner(System.in);	
		
	double pizza1;
	double pizza2;
	double pizza3;
	double summa;
	double halvin=0;
	double keskihinta;
	
	System.out.print("Anna pizzojen hinnat (3): ");
	pizza1= input.nextDouble(); 
	pizza2= input.nextDouble();	
	pizza3= input.nextDouble();	                  
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");	
	
	if(pizza1 < pizza2 && pizza1 < pizza3){
		pizza1 = halvin;
	}
	else if (pizza2 < pizza1 && pizza2 < pizza3){
		pizza2 = halvin;
	}
	else{
		pizza3 = halvin;
	}
	
	summa = pizza1 + pizza2 + pizza3 - halvin;	
		
	keskihinta = summa / 3;	
		
	System.out.println("Maksettavaa: " + desimaalit.format(summa));	
	System.out.print("Yksittäisen hinta: " + desimaalit.format(keskihinta));	
	}

}

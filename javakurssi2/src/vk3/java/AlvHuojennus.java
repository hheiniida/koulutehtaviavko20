package vk3.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlvHuojennus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	double huojennus;	
	double maksettuAlvvero;
	double liikevaihto;

	DecimalFormat desimaalit = new DecimalFormat("0.00");  
	Scanner input = new Scanner(System.in);
		
	System.out.print("Tulot ja maksettu alv: ");	
	liikevaihto = input.nextDouble();
	maksettuAlvvero = input.nextDouble();
	 
	if(liikevaihto>8500) {
		huojennus = maksettuAlvvero-(liikevaihto-8500)* maksettuAlvvero/14000.0;
	}
	else{
		huojennus = 0;
	}
		
		System.out.print("Huojennus on: " + desimaalit.format(huojennus));
		
		
	}

}

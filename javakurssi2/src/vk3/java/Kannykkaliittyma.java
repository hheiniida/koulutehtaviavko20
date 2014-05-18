package vk3.java;

import java.util.Scanner;

public class Kannykkaliittyma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	double minuutit;
	int viestienmaara;
	double norppa;
	double kampanja;
	double minyli=0;
	double viesyli=0;
	
		
	System.out.println("Anna puheluiden minuuttimäärä per kk: ");
	minuutit = input.nextDouble();
		
	System.out.println("Anna tekstiviestien lkm per kk: ");
	viestienmaara = input.nextInt();
	
	norppa = (minuutit * 0.066) + (viestienmaara * 0.066) +0.66;
	
	if(minuutit >1000)	{
		minyli = (minuutit-1000)*0.099;
	}
		
	else if (viestienmaara > 500){
		viesyli =(viestienmaara -500);
		
	}
		kampanja = 19.90 + minyli + viesyli;
		System.out.println("Norppa maksaa: "+norppa );
		System.out.println("Kampanja maksaa: "+kampanja);
		
		if(norppa>kampanja){
			System.out.println("KAMPANJA");
		}
		else if(norppa<kampanja){
			System.out.println("NORPPA");
		}
		else{
			System.out.println("Saman hintaiset");
		}
	}

}

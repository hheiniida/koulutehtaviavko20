package vk4.java;

import java.util.Scanner;

public class Hissi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
		
	
	double paino;
	double hissi =0;
	boolean oikein = false;
	
	do{
	System.out.print("Paljonko painat: ");
	paino = input.nextDouble();
	hissi = hissi +paino;
	
	if(hissi <=240 && paino<=240){
		System.out.println("Tule kyytiin.");
	oikein= false;	
	}
	
	else if(paino == 0){
		break;
	}
	else {
		System.out.print("Hissi on jo täynnä. Odota seuraavaa hissiä.");
		oikein = true;
	}
	} while  (oikein ==false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

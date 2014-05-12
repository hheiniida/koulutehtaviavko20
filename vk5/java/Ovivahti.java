package vk5.java;

import java.util.Scanner;

public class Ovivahti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lukija = new Scanner(System.in);
	
	String tunnusSana= "ruska";
	String arvaus;
	int i=0;
	boolean auki=false;
	
	
	for(i=1; i<04; i++)	{
	System.out.print("Ovivahti kysyy "+ i +". kertaa, tunnussana? ");	
	arvaus= lukija.nextLine();
	
	if(tunnusSana.equals(arvaus)){
		auki=true;
		System.out.println("SISÄÄN");
		
	}
	
	else if(!tunnusSana.equals(arvaus)&& i==3){
	auki = false;
		System.out.println("OVI ON LUKITTU");
	}
		
	}		
		
	}

}

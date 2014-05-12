package vk3.java;

import java.util.Scanner;

public class Opintoraha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int ika;
	int muoto;
	int opintoraha;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Anna ikäsi: ");
	ika = input.nextInt();
	
	System.out.print("Asutko kotona (0=ei, 1=kyllä) : ");
	muoto = input.nextInt();
		
		
		
		
	if(ika >=20 && muoto == 0){
		opintoraha =298;
	}
	
	else if(ika >=20 && muoto ==1){
		opintoraha = 122;
	}
	
	else if(ika >=18 && ika<=19 && muoto ==0){
		opintoraha = 298;
	
	}
	
	else if(ika >=17 && ika<=19 && muoto ==1){
		opintoraha = 55;
	}
	
	else {
		opintoraha = 0;
	}
	
	System.out.print("Opintoraha on "+ opintoraha + " euroa");
	
	
	}

}

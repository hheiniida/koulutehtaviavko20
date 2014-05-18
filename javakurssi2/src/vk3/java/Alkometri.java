package vk3.java;

import java.util.Scanner;

public class Alkometri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	double lukema;
	
	System.out.println("Anna alkometrinlukema: ");
	lukema = input.nextDouble();
	
	if (lukema > 0.5 && lukema < 1.2){
		System.out.println("Rattijuopumus");
	}
	else if (lukema > 1.2 ){
		System.out.println("Törkeä rattijuopumus");
	}
	else {
		System.out.println("Ei rattijuopumusta");
	}
	
	}

}

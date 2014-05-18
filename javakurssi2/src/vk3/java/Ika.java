package vk3.java;

import java.util.Scanner;

public class Ika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner input = new Scanner(System.in);
	
	int ika;
	
	System.out.println("Anna ikäsi: ");
	ika = input.nextInt();
	
	if (ika < 0|| ika > 120) {
		System.out.println("Virheellinen ikä!");
	}
	
	else if (ika < 18){
		System.out.println("Alaikäinen!");
	}
	else {
		System.out.println("Täysi-ikäinen");
	}
	
	}

}

package vk1ja2;

import java.util.Scanner;

public class Bensa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		double tankattuL;   
		int ajettuKm;
		double hintaL;
		double hintaKm;
		
		
		System.out.println("Syötä tankattu määrä:");
		tankattuL = input.nextDouble();
		
		System.out.println("Syötä ajetut kilometrit:");
		ajettuKm = input.nextInt();
		
		System.out.println("Syötä bensan litrahinta:");
		hintaL = input.nextDouble();
		
		hintaKm = tankattuL/ajettuKm * hintaL;
		
		System.out.println("Bensan hinta per kilometri: " + hintaKm);
		
	}

}

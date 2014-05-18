package vk1ja2;

import java.util.Scanner;

public class ElokuvalippuB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);	
		
	double lippu;
	double pakkaus;
	
	System.out.print("Anna pakkauksen hinta: ");
	pakkaus = input.nextDouble();
	
	lippu = pakkaus / 5;
	
	System.out.println("Yhden lipun hinta: "+ lippu);
	
	
	}

}

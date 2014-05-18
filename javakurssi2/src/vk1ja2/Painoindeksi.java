package vk1ja2;

import java.util.Scanner;

public class Painoindeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	
	
	int paino;
	double pituus;
	double indeksi;
	
	System.out.print("Anna paino: ");
	paino = input.nextInt();
	
	System.out.print("Anna pituus: ");
	pituus = input.nextDouble();
	
	indeksi = paino/(pituus*pituus);
	System.out.println("Painoindeksi on: "+ indeksi);
	
		
	}

}

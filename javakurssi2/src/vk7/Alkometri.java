package vk7;

import java.util.Scanner;

public class Alkometri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lukema2 = kysyLukema();
		naytaTulos(lukema2);
		
	}

	public static double kysyLukema() {

		Scanner input = new Scanner(System.in);

		double lukema;

		System.out.println("Anna alkometrinlukema: ");
		lukema = input.nextDouble();

		return lukema;
	}

	public static void naytaTulos(double lukema) {

		if (lukema > 0.5 && lukema < 1.2) {
			System.out.println("Rattijuopumus");
		} else if (lukema > 1.2) {
			System.out.println("Törkeä rattijuopumus");
		} else {
			System.out.println("Ei rattijuopumusta");
		}
	
	}
}

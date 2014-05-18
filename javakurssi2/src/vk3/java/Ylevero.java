package vk3.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ylevero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		final double VERO = 0.68;
		final int TULORAJA = 7537;
		double tulot;
		int ika;
		double maksettavaVero;
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		System.out.println("Anna vuositulosi ja ikäsi: ");
		tulot = input.nextDouble();
		ika = input.nextInt();

		if (ika < 19 || tulot < TULORAJA) {
			maksettavaVero = 0;
		} else {
			maksettavaVero = tulot * VERO / 100.0;
			if (maksettavaVero > 140.0) {
				maksettavaVero = 140;
			}
		}
		System.out.println("Ylevero on " + desimaalit.format(maksettavaVero));
	}

}

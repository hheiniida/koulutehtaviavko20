package vk6.java;

import java.util.Arrays;
import java.util.Scanner;

public class Lottorivi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] oikeatNumerot = { 3, 19, 18, 1, 2, 17, 16 };
		int[] omatNumerot = new int[7];
		int numero;
		int oNumerot=0;
		

		Scanner input = new Scanner(System.in);

		

			for (int i = 0; i < 7; i++) {
				System.out.print("Anna " + (i + 1) + ". lottonumerosi: ");
				numero = input.nextInt();

				omatNumerot[i] = numero;
				
			}

		

		for (int i = 0; i< omatNumerot.length; i++) {
			for (int j =0; j<oikeatNumerot.length; j++){
			if (oikeatNumerot[i] == omatNumerot[i]) {
				oNumerot++;
			}
			}
		}
		Arrays.sort(oikeatNumerot);
		

		System.out.println("Sinulla oli " + oNumerot+ " oikein.");

		System.out.print("Oikea rivi oli ");
		for (int i = 0; i < oikeatNumerot.length; i++) {
			System.out.print(oikeatNumerot[i] + " ");

		}
	}

}

package vk7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AsunnonMyynti {

	public static void main(String[] args) {
		
		
		
		double myyntihinta;
		double palkkio;
		
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		myyntihinta = kysyMyyntihinta();
		while (myyntihinta > 0) {

			palkkio = laskePalkkio(myyntihinta);
			System.out.println("Myyntipalkkio on " + desimaalit.format(palkkio));

			myyntihinta = kysyMyyntihinta();
		}
	}
	public static double kysyMyyntihinta() {	
		double myyntihinta;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Anna asunnon myyntihinta: ");
		myyntihinta = input.nextDouble();

		//input.close();
		return myyntihinta;
	}
	
	public static double laskePalkkio(double myyntihinta) {
		
		
		
		final double PALKKIO = 3.44;
		final double MINPALKKIO = 2214.00;
		double palkkio;
		
		
		palkkio = myyntihinta * (PALKKIO / 100.0);
		
		
		if (palkkio < MINPALKKIO) {
			palkkio = MINPALKKIO;
		}

		return palkkio;
	}
	
	


}
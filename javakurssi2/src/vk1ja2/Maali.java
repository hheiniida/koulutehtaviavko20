package vk1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Maali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	double leveys;
	double pituus;
	double korkeus;
	double litralla;
	double maalia;
	
	System.out.print("Anna huoneen leveys: ");
	leveys = input.nextDouble();
	
	System.out.print("Anna huoneen pituus: ");
	pituus = input.nextDouble();
	
	System.out.print("Anna huoneen korkeus: ");
	korkeus = input.nextDouble();
	
	System.out.print("Paljonko saadaan maalattua litralla maalia: ");
	litralla = input.nextDouble();
	
	maalia = (leveys+leveys+pituus+pituus)*korkeus/litralla;
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	System.out.println("Maalia tarvitaan koko huoneen maalaamiseen "+ desimaalit.format(maalia)+" l");
	}

}

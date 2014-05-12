package vk1ja2;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Osakkeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int osakelkm;
		double myyntivoitto;
		double myyntihinta = 15.36;
		double ostohinta = 11.03;
		
		System.out.print("Anna YIT-osakkeiden lukum‰‰r‰:");
		osakelkm = input.nextInt();
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		myyntivoitto = osakelkm * (myyntihinta - ostohinta);
		System.out.println("Voitto on: "+ desimaalit.format(myyntivoitto));
		
	}

}

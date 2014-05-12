package vk1ja2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

Scanner input = new Scanner(System.in);
		
		double veroprosentti;  
		int bruttopalkka;
		double aleHinta;
		double vero;
		double elakemaksu;
		double tyotmaksu;
		double kateen;
		
		
		System.out.print("Anna palkka: ");
		bruttopalkka = input.nextInt();
		
		System.out.print("Anna veroprosentti: ");
		veroprosentti = input.nextDouble();
		
		vero = bruttopalkka - bruttopalkka * (100 - veroprosentti) /100.0;
		elakemaksu = bruttopalkka * 5.55/100.0;
		tyotmaksu = bruttopalkka * 0.50/100.0;
		kateen = bruttopalkka - vero -elakemaksu - tyotmaksu;
		
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		
		System.out.println("Bruttopalkka "+ bruttopalkka );
		System.out.println("Veron osuus " +"(" + desimaalit.format(veroprosentti) + "% )" + desimaalit.format(vero)  );
		System.out.println("Työeläkevakuutusmaksun osuus "+ "(5,55%) "+ desimaalit.format(elakemaksu));
		System.out.println("Työttömyysvakuutuksen osuus "+ "(0,50%) " + desimaalit.format(tyotmaksu) );
		System.out.println("Käteen siis jää " + desimaalit.format(kateen));
		
	
		
		
	}

}

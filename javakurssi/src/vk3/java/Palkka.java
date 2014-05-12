package vk3.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int bpalkka;
	double verop;
	int ika;
	double tyotvak=0.50;
	double elakemaksu;
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	System.out.print("Anna palkka: ");
	bpalkka = input.nextInt();
	
	System.out.print("Anna veroprosentti: ");
	verop = input.nextDouble();
		
	System.out.print("Anna ik�: ");
	ika = input.nextInt();	
		
	System.out.println("Bruttopalkka "+bpalkka);
	
	System.out.println("Veron osuus "+ "("+ desimaalit.format(verop) +"%) " + desimaalit.format((bpalkka*verop/100)));
	
	if(ika <53){
		elakemaksu = 5.55;
	}
	else{
		elakemaksu = 7.05;
	}
	System.out.println("Ty�el�kevakuutusmaksun osuus "+ "("+ desimaalit.format(elakemaksu) +"% )" + desimaalit.format((bpalkka*elakemaksu/100)));
	
	System.out.println("Ty�tt�myysvakuutuksen osuus "+"("+ desimaalit.format(tyotvak)+"% )"+desimaalit.format((bpalkka*tyotvak/100)));
	
	System.out.println("K�teen siis j�� "+ desimaalit.format((bpalkka-((bpalkka*verop/100)+(bpalkka*elakemaksu/100)+(bpalkka*tyotvak/100)))));	
	}

}

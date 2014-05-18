package vk9ja10;

import java.util.Scanner;

public class VarastotietoOhjelma {

	public static void main(String[] args) {
		
		Scanner lukija=new Scanner(System.in);
		
		String hylly;
		int lokerikko;
		
		
		System.out.print("Anna hylly: ");
		hylly=lukija.nextLine();
		
		System.out.print("Anna lokerikko: ");
		lokerikko=lukija.nextInt();
		
		
		Varastotieto varasto= new Varastotieto();
		varasto.setHylly(hylly);
		varasto.setLokerikko(lokerikko);
		
		System.out.println("Hylly "+varasto.getHylly() +", lokerikko "+varasto.getLokerikko());
	}

}

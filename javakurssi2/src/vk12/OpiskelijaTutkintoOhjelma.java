package vk12;

import java.util.Scanner;

public class OpiskelijaTutkintoOhjelma {

	public static void main(String[] args) {
		
		Scanner lukija =new Scanner(System.in);
		
		System.out.print("Anna opiskelijanumero: ");
		String numero = lukija.nextLine();

		System.out.print("Anna opiskelijan nimi: ");
		String nimi =lukija.nextLine();
		
		System.out.print("Annan opiskelijan kotikunta: ");
		String kunta =lukija.nextLine();
		
		System.out.print("Annan tutkinnon nimi: ");
		String tutkinnonNimi =lukija.nextLine();
		
		System.out.print("Anna tutkinnon suuntaus: ");
		String suuntaus =lukija.nextLine();
		
		System.out.print("Anna tutkinnon tavoitteena oleva valmistumisvuosi: ");
		int vuosi =lukija.nextInt();
		
		Opiskelija opiskelija=new Opiskelija();
		Tutkinto tutkinto =new Tutkinto();
		
		tutkinto.setSuuntaus(suuntaus);
		tutkinto.setTavoiteVuosi(vuosi);
		tutkinto.setTutkintoNimi(tutkinnonNimi);
		
		opiskelija.setTutkinto(tutkinto);
		opiskelija.setKotikunta(kunta);
		opiskelija.setNimi(nimi);
		opiskelija.setNumero(numero);
		
		System.out.println("Opiskelija "+opiskelija.getNimi()+" suorittaa tutkintoa "+opiskelija.getTutkinto().getTutkintoNimi());
		
		lukija.close();
	}
	

}

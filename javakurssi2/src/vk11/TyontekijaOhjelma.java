package vk11;

import java.util.Scanner;

public class TyontekijaOhjelma {

	public static void main(String[] args) {
		
		
		Osasto osasto =new Osasto();
		Tyontekija tyontekija =new Tyontekija();
		
		Scanner lukija= new Scanner(System.in);
		
		
		
		System.out.print("Anna osaston numero: ");
		int osastonNumero = lukija.nextInt();
		lukija.nextLine();
		
		
		System.out.print("Anna osaston nimi: ");
		String osastonNimi =lukija.nextLine();
		
		System.out.print("Anna ty�ntekij�n numero: ");
		int tyontekijanNumero=lukija.nextInt();
		lukija.nextLine();
		
		System.out.print        ("Anna ty�ntekij�n nimi: ");
		String tyontekijanNimi=lukija.nextLine();
		
		tyontekija.setNimi(tyontekijanNimi);
		tyontekija.setNumero(tyontekijanNumero);
		tyontekija.setOsasto(osasto);
		
		osasto.setNimi(osastonNimi);
		osasto.setNumero(osastonNumero);
		
		System.out.print("Ty�ntekij� "+ tyontekija.getNimi() +" ty�skentelee "+ osasto.getNimi() +" osastolla");
	}

}

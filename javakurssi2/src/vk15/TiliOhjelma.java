package vk15;

import java.util.Scanner;

public class TiliOhjelma {

	public static void main(String[] args) {
		
		Scanner lukija=new Scanner(System.in);

		
		System.out.print("Anna tilinumero: ");
		String tilinumero=lukija.nextLine();
		
		System.out.print("Anna alkusaldo: ");
		double alkusaldo=lukija.nextDouble();
		
		System.out.print("Anna luottoraja: ");
		double luottoraja=lukija.nextDouble();
		
		LuottoTili luottotili  = new LuottoTili(tilinumero,alkusaldo,luottoraja);
		
		System.out.print("Panon m‰‰r‰: ");
		double pano=lukija.nextDouble();
		luottotili.setSaldo(alkusaldo+pano);
		
		System.out.print("Tilin saldo panon j‰lkeen "+luottotili.getSaldo()+"\n");
		
		System.out.print("Oton m‰‰r‰: ");
		double otto=lukija.nextDouble();
		
		System.out.print("Tilin saldo oton j‰lkeen "+luottotili.getSaldo());
		
		
		
		
		
		
		
		
	}

}




























































































































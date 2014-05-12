package vk11;

import java.util.Scanner;


public class KirjaHallinta {
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		Kirja kirja = null;
		Kustantaja kustantaja = null;
		boolean onkoKirjaa = false;
		boolean onkoKustantajaa = false;
		int valinta =-1;

		do {
			System.out.println("\n1 = Luo/muuta kustantaja");
			System.out.println("2 = Luo/muuta kirja");
			System.out.println("3 = Lisää kirjalle kustantaja");
			System.out.println("4 = Näytä kirjan tiedot");
			System.out.println("0 = lopetus");

			System.out.print("\nAnna valintasi: ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				kustantaja = luoMuutaKustantaja();
				onkoKustantajaa = true;
				break;
			case 2:
				kirja = luoMuutaKirja();
				break;
			case 3:
				if(!onkoKirjaa){
					kirja = luoMuutaKirja();
					onkoKirjaa = true;
				}
				if(!onkoKustantajaa){
					kustantaja = luoMuutaKustantaja();
				}
				lisaaKirjalleKustantaja(kirja ,kustantaja);
				
				break;
			case 4:
				if(onkoKirjaa){
				naytaKirjanTiedot(kirja, onkoKustantajaa);
				}
				else {
					System.out.println("Kirjaa ei ole");
				}
				break;
			
		
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);


	}
	
private static Kustantaja luoMuutaKustantaja() {
		
		System.out.print("\nAnna kustantajan nimi: ");
		input.nextLine();
		String nimi = input.nextLine();
		
		System.out.print("Anna kustantajan osoite: ");
		String osoite =input.nextLine();
		
		System.out.print("Anna kustantajan puhelin: ");
		String puhelin =input.nextLine();
		
		
		return new Kustantaja(nimi,osoite,puhelin);
	}

	private static void naytaKirjanTiedot(Kirja kirja, boolean onkoKustantajaa) {
		
		System.out.println("Nimi: " + kirja.getNimi());
		System.out.println("Isbn: " + kirja.getIsbn());
		System.out.println("Hinta: " + kirja.getHinta());
		if(onkoKustantajaa){
			System.out.println("Kustantaja: ");
		}else{
		System.out.println("Kustantaja: " + kirja.getKustantaja().getNimi());
		}
		
	
	}

	private static void lisaaKirjalleKustantaja(Kirja kirja, Kustantaja kustantaja) {
		
		kirja.setKustantaja(kustantaja);
		
	}

	private static Kirja luoMuutaKirja() {
		System.out.print("Anna kirjan nimi: ");
		input.nextLine();
		String nimi = input.nextLine();
		
		System.out.print("Anna kirjan isbn: ");
		String osoite =input.nextLine();
		
		System.out.print("Anna kirjan hinta: ");
		double hinta = input.nextDouble();
		
		return new Kirja(nimi, osoite, hinta);
		
	}

}

package vk13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PelaajalistaSovellus {
	
static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList <Pelaaja> pelaajaLista = new ArrayList<>();
		
		int valinta = -1;
	
		do {
			System.out.println("\n1. Lisää pelaaja");
			System.out.println("2. Hae pelaaja");
			System.out.println("3. Näytä pelaajat");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-3): ");
			valinta = lukija.nextInt();

			switch (valinta) {
			case 1:
				pelaajaLista.add(lisaaPelaaja());
				break;
			case 2:
				System.out.println(haettavaPelaaja(pelaajaLista));
				break;
			case 3:
				naytaPelaajat(pelaajaLista);
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);
	}

	private static void naytaPelaajat(ArrayList<Pelaaja> pelaajaLista) {

		for(Pelaaja pelaaja : pelaajaLista){
			System.out.println("Pelinumero: " + pelaaja.getPelinumero());
			System.out.println("Nimi: " + pelaaja.getNimi());
			System.out.println("Pelipaikka: " + pelaaja.getPelipaikka());
			System.out.println();
		}
		
	}

	private static String haettavaPelaaja(ArrayList<Pelaaja> pelaajaLista) {
		System.out.println("Anna pelinumero: ");
		int haettavaPelinumero = lukija.nextInt();
		for(Pelaaja pelaaja : pelaajaLista){
			if(pelaaja.getPelinumero() == haettavaPelinumero){
				System.out.println();
				return pelaaja.toString();
			}
		}
		return "Pelaaja ei ole pelinumerolla "+ haettavaPelinumero;
	}

	private static Pelaaja lisaaPelaaja() {
		
		System.out.print("Anna pelinumero: ");
		int luku = lukija.nextInt();
		
		System.out.print("Anna nimi: ");
		lukija.nextLine();
		String nimi = lukija.nextLine();
		
		System.out.print("Anna pelipaikka: ");
		String pelipaikka = lukija.nextLine();
		
		return new Pelaaja(luku,nimi,pelipaikka);
	}
}
class Pelaaja{
	
	int pelinumero;
	String nimi;
	String pelipaikka;
	
	public Pelaaja(){
		
	}
	
	public Pelaaja(int pelinumero, String nimi, String pelipaikka) {
		this.pelinumero = pelinumero;
		this.nimi = nimi;
		this.pelipaikka = pelipaikka;
	}

	public int getPelinumero() {
		return this.pelinumero;
	}
	public void setPelinumero(int pelinumero) {
		this.pelinumero = pelinumero;
	}
	public String getNimi() {
		return this.nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getPelipaikka() {
		return this.pelipaikka;
	}
	public void setPelipaikka(String pelipaikka) {
		this.pelipaikka = pelipaikka;
	}

	@Override
	public String toString() {
		return "Pelinumero: " + this.pelinumero + "\nNimi: " + this.nimi
				+ "\nPelipaikka: " + this.pelipaikka;
	}
	
	
}
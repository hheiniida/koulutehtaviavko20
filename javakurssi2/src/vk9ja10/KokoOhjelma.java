package vk9ja10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KokoOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		int paino;
		double pituus;

		DecimalFormat desimaalit = new DecimalFormat("0.00");

		Koko henkilon1koko = new Koko();

		System.out.print("Anna pituus metreinä: ");
		pituus = lukija.nextDouble();
		lukija.nextLine();

		System.out.print("Anna paino kiloina: ");
		paino = lukija.nextInt();
		lukija.nextLine();

		henkilon1koko.setPaino(paino);
		henkilon1koko.setPituus(pituus);

		System.out.println("Pituus: "
				+ desimaalit.format(henkilon1koko.getPituus()));
		System.out.println("Paino: " + henkilon1koko.getPaino());
		System.out.println("Painoindeksi: "
				+ desimaalit.format(henkilon1koko
						.getPainoindeksi(pituus, paino)));
	}

}

class Koko { // luokka

	private DecimalFormat desimaalit = new DecimalFormat("0.00");

	// muuttujat
	private double pituus;
	private int paino;
	private double painoindeksi;

	public Koko() { // parametritön konstruktori
		pituus = 0.0;
		paino = 0;

	}

	public Koko(double pituus, int paino) { // parametrillinen konstruktori
		this.pituus = pituus;
		this.paino = paino;
	}

	public void setPituus(double pituus) { // set-metodi
		this.pituus = pituus;
	}

	public double getPituus() { // get-metodi
		return pituus;
	}

	public void setPaino(int paino) {
		this.paino = paino;
	}

	public int getPaino() {
		return paino;
	}

	public double getPainoindeksi(double pituus, int paino) {
		painoindeksi = paino / (pituus * pituus);
		return painoindeksi;
	}

	public String toString() {
		return "\nPituus: " + desimaalit.format(pituus) + "\nPaino: "
				+ desimaalit.format(paino) + "\n Painoindeksi: "
				+ desimaalit.format(getPainoindeksi(pituus, paino));
	}
}
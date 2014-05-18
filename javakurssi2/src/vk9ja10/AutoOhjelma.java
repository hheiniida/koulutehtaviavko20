package vk9ja10;

import java.util.Scanner;

public class AutoOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lukija = new Scanner(System.in);
		String malli;
		String merkki;
		String rekkari;
		int vuosimalli;

		Auto auto1 = new Auto();

		System.out.print("Anna merkki: ");
		merkki = lukija.nextLine();
		System.out.print("Anna malli: ");
		malli = lukija.nextLine();
		System.out.print("Anna rekisterinumero: ");
		rekkari = lukija.nextLine();
		System.out.print("Anna vuosimalli: ");
		vuosimalli = lukija.nextInt();

		auto1.setMerkki(merkki);
		auto1.setMalli(malli);
		auto1.setRekkari(rekkari);
		auto1.setVuosimalli(vuosimalli);
		
		
		
		System.out.println("Merkki ja malli: " + auto1.getMerkki() + " "
				+ auto1.getMalli());
		System.out.println("Rekisterinumero: " + " " + auto1.getRekkari());
		System.out.print("Vuosimalli: " + " " + auto1.getVuosimalli());
	}

}

class Auto {
	public Auto() {

	}

	private String malli;
	private String merkki;
	private String rekkari;
	private int vuosimalli;

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public String getMalli() {
		return malli;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMerkki() {
		return merkki;
	}

	public void setRekkari(String rekkari) {
		this.rekkari = rekkari;
	}

	public String getRekkari() {
		return rekkari;
	}

	public void setVuosimalli(int vuosimalli) {
		this.vuosimalli = vuosimalli;
	}

	public int getVuosimalli() {
		return vuosimalli;
	}

	public String toString() {
		String paluu = "";
		paluu = paluu + merkki + malli + rekkari + vuosimalli;
		return paluu;
	}
}
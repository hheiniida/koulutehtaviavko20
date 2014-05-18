package vk12;

public class Palkka {
	
	private double kuukausipalkka;
	private double veroprosentti;
	
	public Palkka(){
		
	}

	public Palkka(double kuukausipalkka, double veroprosentti) {
		super();
		this.kuukausipalkka = kuukausipalkka;
		this.veroprosentti = veroprosentti;
	}

	public double getKuukausipalkka() {
		return kuukausipalkka;
	}

	public void setKuukausipalkka(double kuukausipalkka) {
		this.kuukausipalkka = kuukausipalkka;
	}

	public double getVeroprosentti() {
		return veroprosentti;
	}

	public void setVeroprosentti(double veroprosentti) {
		this.veroprosentti = veroprosentti;
	}
	
	
}

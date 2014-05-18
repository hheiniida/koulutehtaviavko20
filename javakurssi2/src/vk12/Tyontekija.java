package vk12;

public class Tyontekija {

	private int numero;
	private String nimi;
	private Osasto osasto;
	private Palkka palkka;
	
	public Tyontekija() {
		
	}
	public Tyontekija(int numero, String nimi, Osasto osasto, Palkka palkka) {
		
		this.numero = numero;
		this.nimi = nimi;
		this.osasto = osasto;
		this.palkka = palkka;
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public Osasto getOsasto() {
		return osasto;
	}
	public void setOsasto(Osasto osasto) {
		this.osasto = osasto;
	}
	
	public Palkka getPalkka() {
		return palkka;
	}
	public void setPalkka(Palkka palkka) {
		this.palkka = palkka;
	}
}

package vk11;


public class Henkilo {
	

	private String nimi;
	private String osoite;
	private Auto auto;


	public Henkilo(String nimi, String osoite, Auto auto) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.auto = auto;

	}

	public String getNimi() {
		return nimi;

	}

	public String getOsoite() {
		return osoite;

	}

	public void setNimi(String nimi) {
		this.nimi = nimi;

	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;

	}

	public String toString() {
		return "\nNimi: " + nimi + "\nOsoite: " + osoite + "\nAuto: " + this.auto.getMerkki() +" "+ this.auto.getMalli();

	}
}

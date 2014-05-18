package vk12;

public class Osasto {

	private String nimi;
	private int numero;
	public Osasto() {
		
	}
	public Osasto(String nimi, int numero) {
		
		this.nimi = nimi;
		this.numero = numero;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}

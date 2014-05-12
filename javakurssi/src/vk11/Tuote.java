package vk11;

public class Tuote {

	private int numero;
	private String nimi;
	private double hinta;
	String toimittaja;
	
	public Tuote(){
		
	}
	
	public Tuote(int numero, String nimi, double hinta){
		this.numero=numero;
		this.nimi=nimi;
		this.hinta=hinta;
		
		
	}
	
	public int getNumero(){
		return numero;
	}
	public String getNimi(){
		return nimi;
	
	}
	public double getHinta(){
		return hinta;
	}
	public void setNumero(int numero){
		this.numero =numero;
	}
	public void setNimi(String nimi){
		this.nimi=nimi;
	}
	public void setHinta(double hinta){
		this.hinta=hinta;
	}
	public String toString(){
		return "";
	}
}

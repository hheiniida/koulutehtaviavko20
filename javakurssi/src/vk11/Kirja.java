package vk11;

public class Kirja {

	String nimi;
	String isbn;
	double hinta;
	Kustantaja kustantaja =null;
	
	public Kirja() {
		
	}

	public Kirja(String nimi, String isbn, double hinta) {
		
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
	}
	public Kirja(String nimi, String isbn, double hinta, Kustantaja kustantaja){
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
		this.kustantaja = kustantaja;
	}
	
	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public Kustantaja getKustantaja(){
		return kustantaja;
	}
	public void setKustantaja(Kustantaja kustantaja){
		this.kustantaja=kustantaja;
	}

	@Override
	public String toString() {
		return "Kirjan "+this.nimi+" kustantaja on "+this.kustantaja.getNimi();
	}
	
	//Kirjan Javaa helposti kustantaja on HH kustannus
}

package vk11;

public class Osasto {

	
	private int numero;
	private String nimi;
	
	public Osasto() {
		
	}

	public Osasto(int numero, String nimi) {
		super();
		this.numero = numero;
		this.nimi = nimi;
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

	@Override
	public String toString() {
		return "Osasto [numero=" + numero + ", nimi=" + nimi + "]";
	}
	
	
	
	
	
	
	
	
	
	
}

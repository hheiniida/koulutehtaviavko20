package vk15;

public class Tili {

	private String tilinumero;
	protected double saldo;
	
	
	public Tili() {
		super();
		
	}


	public Tili(String tilinumero, double saldo) {
		super();
		this.tilinumero = tilinumero;
		this.saldo = saldo;
	}


	public String getTilinumero() {
		return tilinumero;
	}


	public void setTilinumero(String tilinumero) {
		this.tilinumero = tilinumero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	

	@Override
	public String toString() {
		return "Tili [tilinumero=" + tilinumero + ", saldo=" + saldo + "]";
	}

	
}

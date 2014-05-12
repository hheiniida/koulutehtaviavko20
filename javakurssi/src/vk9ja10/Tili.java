package vk9ja10;

public class Tili {

	private String numero;
	private double saldo;
	private static double korkoprosentti = 0.2;

	//Tili tili1 = new Tili();

	public Tili() {
		numero = "0";
		saldo = 0.0;

	}

	public String getNumero() {

		return null;
	}


	public Tili(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double uusiSaldo) {
		saldo = uusiSaldo;

	}

	public void setNumero(String numero) {
		this.numero = numero;

	}

	public void pano(double maara) {
		saldo = saldo + maara;
	}

	public boolean otto(double maara) {
		if (saldo >= maara) {
			saldo = saldo - maara;
			return true;
		} else {
			return false;
		}
	}

	public static double getKorkoprosentti() {
		return korkoprosentti;
	}

	public static void setKorkoprosentti(double korkoprosentti) {

		Tili.korkoprosentti = korkoprosentti;
	}

	public String toString() {

		return "numero=" + numero + ", saldo=" + saldo + ", korkoprosentti="
				+ korkoprosentti;
	}
}

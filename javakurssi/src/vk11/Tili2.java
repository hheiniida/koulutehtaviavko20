package vk11;

import vk11toinentili.Asiakas;
import vk11toinentili.Tili;

public class Tili2 {

	private String numero;
	private double saldo =0;
	private Asiakas omistaja;

	private static double korkoprosentti = 0.2;

	public Tili() {
		numero = "0";
		saldo = 0.0;
		omistaja = null;
	}

	public Tili(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		this.omistaja = null;

	}

	public Tili(String numero, double saldo, Asiakas omistaja) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.omistaja = omistaja;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = this.saldo + saldo;
	}

	public Asiakas getOmistaja() {
		return omistaja;
	}

	public void setOmistaja(Asiakas omistaja) {
		this.omistaja = omistaja;
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

	@Override
	public String toString() {
		return "Tili [numero=" + numero + ", saldo=" + saldo + ", omistaja="
				+ omistaja + "]";
	}

	public void pano(double maara) {
		
	}

}

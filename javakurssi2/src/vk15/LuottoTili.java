package vk15;

public class LuottoTili extends Tili {

	private double luottoraja;
	

	public LuottoTili() {
		super();
		luottoraja = 2000.0;

	}


	public LuottoTili(String tilinumero,double saldo, double luottoraja) {
		super(tilinumero, saldo);
		this.luottoraja = luottoraja;
	}


	public double getLuottoraja() {
		return luottoraja;
	}


	public void setLuottoraja(double luottoraja) {
		this.luottoraja = luottoraja;
	}

	public boolean otto(double maara){
		if((saldo+luottoraja) >= maara){
			saldo=saldo-maara;
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString()+ "LuottoTili [luottoraja=" + luottoraja + "]";
	}


	

		
	
	
}

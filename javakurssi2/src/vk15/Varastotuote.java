package vk15;

public class Varastotuote {

	int varastosaldo;
	boolean varasto=false;
	
	public Varastotuote() {
		super();
	}

	public Varastotuote(String numero, String nimi, double hinta, int varastosaldo) {
		super();
		this.varastosaldo = varastosaldo;
	}
	
	public lisaaVarastoon(int lisattavat, int otettavat){
		if(otettavat>0){
		return varasto=true;
		}
		else{
			return false;
		}
	}
	
	public otaVarastosta(int lisattavat, int otettavat){
		
	}

	public int getVarastosaldo() {
		return varastosaldo;
	}

	public void setVarastosaldo(int varastosaldo) {
		this.varastosaldo = varastosaldo;
	}

	public boolean isVarasto() {
		return varasto;
	}

	public void setVarasto(boolean varasto) {
		this.varasto = varasto;
	}

	@Override
	public String toString() {
		return "Varastotuote [varastosaldo=" + varastosaldo + ", varasto="
				+ varasto + "]";
	}
	
}

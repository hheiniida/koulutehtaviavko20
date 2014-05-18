package vk14;

public class Asiakas {

	
	
	private String asiakastunnus;
	private String nimi;
	private String puhelinNumero;
	
	public Asiakas() {
		
	}
	public Asiakas(String asiakastunnus, String nimi, String puhelinNumero) {
		
		this.asiakastunnus = asiakastunnus;
		this.nimi = nimi;
		this.puhelinNumero = puhelinNumero;
	}
	public String getAsiakastunnus() {
		return asiakastunnus;
	}
	public void setAsiakastunnus(String asiakastunnus) {
		this.asiakastunnus = asiakastunnus;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getPuhelinNumero() {
		return puhelinNumero;
	}
	public void setPuhelinNumero(String puhelinNumero) {
		this.puhelinNumero = puhelinNumero;
	}
	@Override
	public String toString() {
		return "Asiakas [asiakastunnus=" + asiakastunnus + ", nimi=" + nimi
				+ ", puhelinNumero=" + puhelinNumero + "]";
	}
	
	
}

package vk12;

public class Opiskelija {

	private String numero;
	private String suuntaus;
	private String kotikunta;
	private String nimi;
	private Tutkinto tutkinto;
	
	public String getNimi() {
		return nimi;
	}
	public Opiskelija() {
		
	}
	public Opiskelija(String numero, String suuntaus, String kotikunta) {
		
		this.numero = numero;
		this.suuntaus = suuntaus;
		this.kotikunta = kotikunta;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setNimi(String nimi){
		this.nimi=nimi;
	}
	
	public String getSuuntaus() {
		return suuntaus;
	}
	public void setSuuntaus(String suuntaus) {
		this.suuntaus = suuntaus;
	}
	public String getKotikunta() {
		return kotikunta;
	}
	public void setKotikunta(String kotikunta) {
		this.kotikunta = kotikunta;
	}
	public void setTutkinto(Tutkinto tutkinto) {
		this.tutkinto=tutkinto;
		
	}
	
	public Tutkinto getTutkinto() {
		return tutkinto;
	}
	@Override
	public String toString() {
		return "Opiskelija [numero=" + numero + ", suuntaus=" + suuntaus
				+ ", kotikunta=" + kotikunta + "]";
	}
	
	

		
	
}

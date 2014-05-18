package vk11;

/*
 * @author Heini
 * 
 */
public class Henkilo1 {

	private String etunimi;
	private String sukunimi;
	private String tyonantaja;
	private Osoite1 tyoOsoite;
	private Osoite1 kotiOsoite;
	
	public Henkilo1() {
		
	}

	public Henkilo1(String etunimi, String sukunimi, String tyonantaja,
			Osoite1 tyoOsoite, Osoite1 kotiOsoite) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.tyonantaja = tyonantaja;
		this.tyoOsoite = tyoOsoite;
		this.kotiOsoite = kotiOsoite;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public String getTyonantaja() {
		return tyonantaja;
	}

	public void setTyonantaja(String tyonantaja) {
		this.tyonantaja = tyonantaja;
	}

	public Osoite1 getTyoOsoite() {
		return tyoOsoite;
	}

	public void setTyoOsoite(Osoite1 tyoOsoite) {
		this.tyoOsoite = tyoOsoite;
	}

	public Osoite1 getKotiOsoite() {
		return kotiOsoite;
	}

	public void setKotiOsoite(Osoite1 kotiOsoite) {
		this.kotiOsoite = kotiOsoite;
	}

	@Override
	public String toString() {
		return "Henkilo [etunimi=" + etunimi + ", sukunimi=" + sukunimi
				+ ", tyonantaja=" + tyonantaja + ", tyoOsoite=" + tyoOsoite
				+ ", kotiOsoite=" + kotiOsoite + "]";
	}
	
	
}

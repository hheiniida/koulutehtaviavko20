package vk11;

/*
 * 
 * @author Heini
 */
public class Osoite1 {

	private String katuosoite;
	private String postitoimipaikka;
	private String postinro;
	private String maa;
	private String email;
	
	
	
	public Osoite1() {
		super();
	}



	public Osoite1(String katuosoite, String postitoimipaikka, String postinro,
			String maa, String email) {
	
		this.katuosoite = katuosoite;
		this.postitoimipaikka = postitoimipaikka;
		this.postinro = postinro;
		this.maa = maa;
		this.email = email;
	}



	public String getKatuosoite() {
		return katuosoite;
	}



	public void setKatuosoite(String katuosoite) {
		this.katuosoite = katuosoite;
	}



	public String getPostitoimipaikka() {
		return postitoimipaikka;
	}



	public void setPostitoimipaikka(String postitoimipaikka) {
		this.postitoimipaikka = postitoimipaikka;
	}



	public String getPostinro() {
		return postinro;
	}



	public void setPostinro(String postinro) {
		this.postinro = postinro;
	}



	public String getMaa() {
		return maa;
	}



	public void setMaa(String maa) {
		this.maa = maa;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Osoite [katuosoite=" + katuosoite + ", postitoimipaikka="
				+ postitoimipaikka + ", postinro=" + postinro + ", maa=" + maa
				+ ", email=" + email + "]";
	}
	
	
}

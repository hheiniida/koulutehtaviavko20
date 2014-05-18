package vk12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tutkinto {
	
	private String tutkintoNimi;
	private String suuntaus;
	private int tavoiteVuosi;
	
	Date date =new Date();
	SimpleDateFormat ft1=new SimpleDateFormat("yyyy");
	int thisYear= Integer.parseInt(ft1.format(date)); //tämän hetkinen vuosi
	
	public Tutkinto() {
		tutkintoNimi="";
		suuntaus="";
		tavoiteVuosi=thisYear +2;
	}
	public Tutkinto(String tutkintoNimi, String suuntaus, int tavoiteVuosi) {
		
		this.tutkintoNimi = tutkintoNimi;
		this.suuntaus = suuntaus;
		this.tavoiteVuosi = tavoiteVuosi;
	}
	public String getTutkintoNimi() {
		return tutkintoNimi;
	}
	public void setTutkintoNimi(String tutkintoNimi) {
		this.tutkintoNimi = tutkintoNimi;
	}
	public String getSuuntaus() {
		return suuntaus;
	}
	public void setSuuntaus(String suuntaus) {
		this.suuntaus = suuntaus;
	}
	public int getTavoiteVuosi() {
		return tavoiteVuosi;
	}
	public void setTavoiteVuosi(int tavoiteVuosi) {
		this.tavoiteVuosi = tavoiteVuosi;
	}
	@Override
	public String toString() {
		return "Tutkinto [tutkintoNimi=" + tutkintoNimi + ", suuntaus="
				+ suuntaus + ", tavoiteVuosi=" + tavoiteVuosi + "]";
	}
	
	
}

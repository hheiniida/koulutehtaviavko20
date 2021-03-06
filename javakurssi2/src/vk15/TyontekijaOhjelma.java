package vk15;

import java.util.Scanner;
public class TyontekijaOhjelma {



	public static void main(String[] args) {
		boolean onkoHenkiloa = false;
		Scanner lukija = new Scanner(System.in);

		int valinta = 0;
		Tyontekija henkilo = new Tyontekija();

		do {

			System.out.println("1. Anna henkilö ");
			System.out.println("2. Näytä henkilön tiedot");
			System.out.println("3. Muuta henkilön tietoja ");
			System.out.println("0. Lopetus ");
			System.out.println("Anna valintasi (0-3): ");
			valinta = lukija.nextInt();
			lukija.nextLine();

			switch (valinta) {
			case 1:
				System.out.println("Syötä työntekijan tiedot!");
				System.out.print("Anna nimi: ");
				String nimi = lukija.nextLine();
				System.out.print("Anna osoite: ");
				String osoite = lukija.nextLine();
				System.out.println("Anna tuntipalkka: ");
				double tuntipalkka = lukija.nextDouble();
				// tiedot tallennetaan henkilo-olioon
				henkilo = new Tyontekija(nimi, osoite, tuntipalkka);
				onkoHenkiloa = true;
				break;
				
			case 2:
				if(onkoHenkiloa){
					System.out.println("TYÖNTEKIJÄTIEDOT");
					System.out.println("Nimi: " + henkilo.getNimi());
					System.out.println("Osoite: " + henkilo.getOsoite());
					System.out.println("Tuntipalkka: " + henkilo.getTuntipalkka());
				}else {
				System.out.println("Henkilöä ei ole");	
				}
				break;
				
			case 3:
				if(onkoHenkiloa){
				System.out.println("Anna nimi: ");
				nimi = lukija.nextLine();
				System.out.println("Anna osoite: ");
				osoite = lukija.nextLine();
				System.out.println("Anna tuntipalkka: ");
				tuntipalkka = lukija.nextDouble();
				henkilo.setNimi(nimi);
				henkilo.setOsoite(osoite);
				henkilo.setTuntipalkka(tuntipalkka);
				}else{
					System.out.println("Henkilöä ei ole");
				}
				break;

			default:

				break;

			}
		} while (valinta != 0);
	}
}
class Henkilo {
	
		private String nimi;
		private String osoite;

		public Henkilo() {
			nimi = "";
			osoite = "";

		}

		public Henkilo(String nimi, String osoite) {
			this.nimi = nimi;
			this.osoite = osoite;

		}

		public String getNimi() {
			return nimi;

		}

		public String getOsoite() {
			return osoite;

		}

		public void setNimi(String nimi) {
			this.nimi = nimi;

		}

		public void setOsoite(String osoite) {
			this.osoite = osoite;

		}

		public String toString() {
			return "nimi=" + nimi + ", osoite=" + osoite;

		}
	}

class Tyontekija extends Henkilo{
	
	double tuntipalkka;
	
	public Tyontekija(){
		
	}
	

	public Tyontekija(String nimi, String osoite, double tuntipalkka) {
		super(nimi, osoite);
		this.tuntipalkka = tuntipalkka;
	}


	public double getTuntipalkka() {
	return tuntipalkka;
	}

	public void setTuntipalkka(double tuntipalkka) {
	this.tuntipalkka = tuntipalkka;
	}

}


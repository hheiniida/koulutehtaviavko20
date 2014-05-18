package vk7;
import java.util.Scanner;

public class HenkiloSovellus {
	public static void main(String[] args) {
		boolean onkoHenkiloa = false;
		Scanner lukija = new Scanner(System.in);

		int valinta = 0;
		Henkilo henkilo = new Henkilo();

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
				System.out.println("Anna nimi: ");
				String nimi = lukija.nextLine();
				System.out.println("Anna osoite: ");
				String osoite = lukija.nextLine();
				// tiedot tallennetaan henkilo-olioon
				
				henkilo.setNimi(nimi);
				henkilo.setOsoite(osoite);
				onkoHenkiloa = true;
				break;
				
			case 2:
				if(onkoHenkiloa){
				System.out.println("nimi=" + henkilo.getNimi() + ", ");
				System.out.println("osoite=" + henkilo.getOsoite());
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
				henkilo.setNimi(nimi);
				henkilo.setOsoite(osoite);
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



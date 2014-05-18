package vk9ja10;

public class Henkilo {
	

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



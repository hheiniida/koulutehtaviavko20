package vk11;

public class HenkiloSovellus1 {

	public static void main(String[] args) {

		Osoite1 kotiOsoite = new Osoite1();
		kotiOsoite.setEmail("jtjuslin@cs.hut.fi");
		kotiOsoite.setKatuosoite("Peräniityntie 220");
		kotiOsoite.setPostinro("FI-05820");
		kotiOsoite.setMaa("FINLAND");

		Osoite1 tyoOsoite = new Osoite1();
		tyoOsoite.setEmail("jukka.juslin@haaga-helia.fi");
		tyoOsoite.setKatuosoite("Ratapihantie 13");
		tyoOsoite.setPostinro("FI-00520");
		tyoOsoite.setMaa("FINLAND");

		Henkilo1 henkilo = new Henkilo1("Jukka", "Juslin", "HAAGA-HELIA OY AB",
				tyoOsoite, kotiOsoite);
		
		System.out.println(henkilo);
	}

}

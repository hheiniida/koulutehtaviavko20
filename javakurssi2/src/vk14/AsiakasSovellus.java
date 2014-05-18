package vk14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AsiakasSovellus {

	public static void main(String[] args) {

		Map<String,Asiakas> asiakkaat = new HashMap<String,Asiakas>();

		Asiakas asiakas = new Asiakas();

		asiakas.setAsiakastunnus("a12000");
		asiakas.setNimi("Aino Aalto");
		asiakas.setPuhelinNumero("+35840123123");
		asiakkaat.put("a12000", asiakas);

		Asiakas asiakas2=new Asiakas();
		
		asiakas2.setAsiakastunnus("a12000");
		asiakas2.setNimi("Leevi Laine");
		asiakas2.setPuhelinNumero("+35840123124");
		asiakkaat.put("a12000", asiakas2);

		Set <String> asiakasnumerot = asiakkaat.keySet();

		Iterator <String> iteraattori = asiakasnumerot.iterator();
		String asiakasnumero="";
		
		while (iteraattori.hasNext()) {
			asiakasnumero=iteraattori.next(); // ilmoitetaan "muoto"
			if (asiakasnumero.equals("a12000")) {
				Asiakas tamaAsiakas = asiakkaat.get(asiakasnumero);
				System.out.println(tamaAsiakas);
			}

		}
	}

}

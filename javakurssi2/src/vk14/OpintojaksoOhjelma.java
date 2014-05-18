package vk14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OpintojaksoOhjelma {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		
		Map<String, Opintojakso> opintojaksot = new HashMap<String, Opintojakso>();

		System.out.println("Syötä neljän opintojakson tiedot!");

		int laskuri = 0;

		for (int i = 0; i < 4; i++) {
			Opintojakso opintojakso = new Opintojakso();
			System.out.print("\nAnna opintojakson tunnus: ");
			String tunnus = lukija.nextLine();
			opintojakso.setTunnus(tunnus);

			System.out.print("Anna opintojakson nimi: ");
			String nimi = lukija.nextLine();
			opintojakso.setNimi(nimi);

			System.out.print("Anna opintojakson laajuus: ");
			int laajuus = lukija.nextInt();
			opintojakso.setLaajuus(laajuus);
			
			

			lukija.nextLine();
			opintojaksot.put(tunnus, opintojakso);

		}

		Set<String> opintojaksonTunnus = opintojaksot.keySet();

		Iterator<String> iterator = opintojaksonTunnus.iterator();
		System.out.println("Opintojaksot: ");
		
		while (iterator.hasNext()) {
			String tamaOpintojaksonTunnus = iterator.next();
			Opintojakso opintojakso = opintojaksot.get(tamaOpintojaksonTunnus);
			System.out.println(opintojakso);
		}

	}
}

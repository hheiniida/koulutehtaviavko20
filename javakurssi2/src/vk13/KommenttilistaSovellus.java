package vk13;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class KommenttilistaSovellus {

		// Luodaan lista, mihin voidaan laittaa merkkijonoja
		private List<String> kommenttiLista = new ArrayList<String>();

		private void lisaaKommentti() {
			Scanner input = new Scanner(System.in);

			System.out.print("Anna kommentti: ");
			String kommentti = input.nextLine();

			// Lis‰t‰‰n listaan merkkijono
			kommenttiLista.add(kommentti);
		}

		private void listaaKommentit() {
			// K‰yd‰‰n lista l‰pi for-silmukalla
			for (int i = 0; i < kommenttiLista.size(); i++) {
				// Haetaan listasta indeksill‰ i oleva merkkijono
				System.out.println(kommenttiLista.get(i));
			}
		}

		private void poistaKommentti() {
			Scanner input = new Scanner(System.in);

			System.out.print("Monesko kommentti poistetaan: ");
			int i = input.nextInt();
			input.nextLine();

			if (i < kommenttiLista.size()) {
				// Poistetaan listasta indeksill‰ i oleva merkkijono
				kommenttiLista.remove(i);
				System.out.println("Kommentti paikalla " + i
						+ " on poistettu listasta");
			} else {
				System.out.println("Kommenttia paikalla " + i
						+ " ei ollut listassa");
			}
		}

		public static void main(String[] args) {
			KommenttilistaSovellus sovellus = new KommenttilistaSovellus();

			int valinta;

			Scanner input = new Scanner(System.in);

			do {
				System.out.println("\n1 = Lis‰‰ kommentti");
				System.out.println("2 = Listaa kommentit");
				System.out.println("3 = Poista kommentti");
				System.out.println("0 = Lopeta");
				System.out.print("Anna valintasi: ");

				valinta = input.nextInt();

				switch (valinta) {
				case 1:
					sovellus.lisaaKommentti();
					break;

				case 2:
					sovellus.listaaKommentit();
					break;

				case 3:
					sovellus.poistaKommentti();
					break;
				}
			} while (valinta != 0);
		}
}

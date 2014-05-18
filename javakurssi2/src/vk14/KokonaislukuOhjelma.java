package vk14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Exception;

public class KokonaislukuOhjelma {

	public static void main(String[] args) throws Exception {

		Scanner lukija = new Scanner(System.in);
		List <Object> lista = new ArrayList<Object>();

		for (int i = 1; i < 11; i++) {
			System.out.print("Anna " + i + ". luku: ");
			try {
				String luku = lukija.nextLine();
				if (luku.contains("+")) {
					Exception e = null;
					throw e;
				} else {

					int lukuInttina = Integer.parseInt(luku);
					lista.add(luku);
				}

			} catch (NumberFormatException e) {
				System.out.println("Syötä kokonaisluku numeronäppäimillä!");
				i = i - 1;
			} catch (NullPointerException e) {
				System.out.println("Syötä kokonaisluku numeronäppäimillä!");
				i = i - 1;
			}

		}
		System.out.println("LUVUT: ");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");

		}

	}
}

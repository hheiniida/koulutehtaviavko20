package vk9ja10;

import java.util.*;
import java.text.*;

public class Syntymapaiva {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		System.out.println("Anna syntymäpäiväsi (pp.kk.vvvv): ");
		String syntymapaivaString = lukija.nextLine();

		SimpleDateFormat fdate = new SimpleDateFormat("dd.MM.yyyy");

		try {
			Date syntymapaiva = fdate.parse(syntymapaivaString);
			syntymapaivaString = fdate.format(syntymapaiva);

			SimpleDateFormat fvuosi = new SimpleDateFormat("yyyy");
			String vuosiStr = fvuosi.format(syntymapaiva);

			int vuosi = Integer.parseInt(vuosiStr);

			System.out.println("Syntymävuotesi on " + vuosi);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

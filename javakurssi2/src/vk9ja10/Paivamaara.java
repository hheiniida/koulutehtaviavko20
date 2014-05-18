package vk9ja10;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Paivamaara {

	public static void main(String[] args) {
		

		
		Date tanaan =new Date();
		
		SimpleDateFormat fdate=new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat fclock = new SimpleDateFormat("H:m:s");
		
		System.out.println("T‰n‰‰n on " + fdate.format(tanaan));
		System.out.println("Kello on " + fclock.format(tanaan));
	}

}

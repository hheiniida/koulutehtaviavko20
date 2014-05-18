package vk1ja2;

import java.util.Scanner;

public class Valityspalkkio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
		
	double myyntihinta;
	double valityspalkkio;
	double palkkioProsentti = 3.44;
		
	System.out.print("Anna myyntihinta: ");
	myyntihinta= input.nextDouble();
	
	valityspalkkio= (myyntihinta * palkkioProsentti) / 100;
	
	
	System.out.println("Myyntipalkkio on " + valityspalkkio);
	}

}

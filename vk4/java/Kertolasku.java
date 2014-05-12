package vk4.java;

import java.util.Scanner;



public class Kertolasku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner input = new Scanner(System.in);

	int luku1;
	int luku2;
	int tulo;
	int vastaus;

boolean oikein = false;

luku1 = (int) (Math.random()* 9) + 1;
luku2 = (int) (Math.random()* 9) + 1;
tulo = luku1 * luku2;

do{
	System.out.print(luku1 + "*" + luku2 + "=" );
	vastaus = input.nextInt();
	
	if(vastaus ==tulo){
		System.out.println("Oikein");
		oikein = true;
	}
	else {
		System.out.println("V‰‰rin");
	}
}
while (oikein == false);

	}
}



		
		
		
		
		
		
		
		
		
		
		
		
	



package vk3.java;

import java.util.Scanner;

public class Tentti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
	int pisteet;
	
	System.out.println("Anna pistem��r�si: ");
	pisteet = input.nextInt();
	
	if( pisteet >=56 && pisteet <=60){
		System.out.println("Kiitett�v�");
	}
	else if ( pisteet >=44 && pisteet <=55){
		System.out.println("Hyv�");
	}
	else if ( pisteet>=30 && pisteet <=43 ){
		System.out.println("V�ltt�v�");
	}
	else if (pisteet < 30 && pisteet >=0){
		System.out.println("Hyl�tty");
	}
	else{
		System.out.println("Pisteet sy�tetty v��rin");
	}
	}

}

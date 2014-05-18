package vk3.java;

import java.util.Scanner;

public class Tentti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
	int pisteet;
	
	System.out.println("Anna pistemääräsi: ");
	pisteet = input.nextInt();
	
	if( pisteet >=56 && pisteet <=60){
		System.out.println("Kiitettävä");
	}
	else if ( pisteet >=44 && pisteet <=55){
		System.out.println("Hyvä");
	}
	else if ( pisteet>=30 && pisteet <=43 ){
		System.out.println("Välttävä");
	}
	else if (pisteet < 30 && pisteet >=0){
		System.out.println("Hylätty");
	}
	else{
		System.out.println("Pisteet syötetty väärin");
	}
	}

}

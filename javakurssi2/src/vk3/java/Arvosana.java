package vk3.java;

import java.util.Scanner;

public class Arvosana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	
	int arvosana;
	
	System.out.println("Anna arvosanasi (0-5): ");
	arvosana = input.nextInt();
	 
	switch(arvosana){
	 
	case 5:
		System.out.println("Kiitett�v�");
		break;
		
	case 4:
	case 3:
		System.out.println("Hyv�");
		break;
		
	case 2:
		System.out.println("Tyydytt�v�");
		break;
		
	case 1:
		System.out.println("Heikko");
		
	default:
		System.out.println("Ei kelpaa arvosanaksi!");
		
	}

}
}

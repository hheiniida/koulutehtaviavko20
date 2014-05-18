package vk14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoikkeusDemo {

	public static void main(String[] args) {
		
	try {
		Scanner lukija=new Scanner(new File("osoitteet.txt"));
		while(lukija.hasNext()){
			System.out.println(lukija.nextLine());
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Tiedostoa ei voitu avata. ");
	}	
		
		
	}

}

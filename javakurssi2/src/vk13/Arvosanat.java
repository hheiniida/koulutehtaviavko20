package vk13;

import java.util.ArrayList;
import java.util.Scanner;

public class Arvosanat {

	public static void main(String[] args) {
		
		
		ArrayList arvosanat = new ArrayList();

		Scanner lukija = new Scanner(System.in);
		
		int arvosana=0;
		while(arvosana!=-1){
			System.out.print("Anna arvosana (-1 lopettaa): ");
			arvosana =lukija.nextInt();
			arvosanat.add(arvosana);
		}
		
		int summa=0;
		for(int i=0; i<arvosanat.size();i++){
			summa=summa+(int)arvosanat.get(i);
		}
		
		summa=summa+1;
		int arrayListinKoko=arvosanat.size()-1;
		System.out.println("Keskiarvo "+summa/arrayListinKoko);
	}

}

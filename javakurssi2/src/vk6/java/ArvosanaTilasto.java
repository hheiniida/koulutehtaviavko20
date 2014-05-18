package vk6.java;

import java.util.Scanner;
/**
 * 
 * @author Heini
 *
 */
public class ArvosanaTilasto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lukija = new Scanner (System.in);	
		
		
	int [] arvosanat = {0,0,0,0,0,0};
	int arvosana =0;
	int indeksi =0;
	
	
	while(arvosana!= -1){
		System.out.print("Anna arvosana (0-5), -1 lopettaa: ");
		arvosana =lukija.nextInt();
		if(arvosana== -1){
			break;
		}
		else if(arvosana>= 0 && arvosana <=5){
		arvosanat[arvosana]++;
		
			
		}else{
			System.out.println("Virheellinen arvosana");
		}
	}
		
	for(int i=0; i<arvosanat.length; i++){
		System.out.println(i+ ": "+ arvosanat[i]+" kappaletta");
	}
	}

}

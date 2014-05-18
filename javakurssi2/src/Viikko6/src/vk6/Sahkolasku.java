package vk6;

import java.util.Arrays;
import java.util.Scanner;

public class Sahkolasku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double kwh;
		int kuukausi = 1;
		double hinta;
		int lukema;
		int[] kklk= new int[12];
		

		System.out.print("Anna kilowattitunnin hinta euroina: ");
		kwh = input.nextDouble();

        do{       
		
			System.out.print("Anna sähkölukema (0 lopettaa): ");
			lukema = input.nextInt();

			kklk[kuukausi] = lukema;
		
        }while(lukema != 0 && kuukausi <= 12);
          
        for (int i=0; i < lukema; i++){
        	
        
		System.out.print(i+1+ ". kuukauden kulutus: "+ kklk[i]+" ");
		hinta = kwh * kklk[i]*1.01703;
		System.out.println(hinta +"euroa");
		
	
        }
				
		
	}

}

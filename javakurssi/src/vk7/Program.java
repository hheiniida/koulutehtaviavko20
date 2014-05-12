package vk7;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner lukija = new Scanner(System.in);
	
		
	int a;
	int b;
	
	
	
		
	System.out.print("Anna luku: ");	
	
	a = Integer.parseInt( lukija.nextLine());	
		
	
	System.out.print("Anna luku: ");	
	
	b = Integer.parseInt( lukija.nextLine());		
	
	
	
	int result = Sum(a,b);
	
	System.out.println("Summa oli "+ result);
	
	
	
	lukija.close();//sulkee Scannerin, virhe ilmoitus katoaa
	return;	
	
	
	}
	public static int Sum(int num1, int num2){
	
		
		
	int sum = num1 + num2;	
	return sum;	
		
	}
}

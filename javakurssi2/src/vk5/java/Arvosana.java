package vk5.java;

import java.util.Scanner;

public class Arvosana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner lukija= new Scanner(System.in);
		
		
	String arvosana;
	
	System.out.println("Anna arvosana kirjaimena: ");	
	arvosana = lukija.next();
		
		
	if(arvosana.equals("L"))	{
		System.out.println("Arvosana L on Laudatur");
	}
	else if(arvosana.equals("E"))	{
		System.out.println("Arvosana E on Eximia cum laude approbatur");
	}
	else if(arvosana.equals("M"))	{
		System.out.println("Arvosana M on Magna sum laude approbatur");
	}
	else if(arvosana.equals("C"))	{
		System.out.println("Arvosana C on Cum laude approbatur");
	}
	else if(arvosana.equals("B"))	{
		System.out.println("Arvosana B on Lubenter approbatur");
	}
	else if(arvosana.equals("A"))	{
		System.out.println("Arvosana A on Approbatur");
	}
	else if(arvosana.equals("I"))	{
		System.out.println("Arvosana I on Improbatur");
	}
		
	else {
		System.out.println("Ei ole arvosana!");
	}
		
		
		
		
		
		
		
		
	}

}

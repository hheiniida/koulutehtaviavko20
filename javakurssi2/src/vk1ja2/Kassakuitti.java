package vk1ja2;
import java.util.Scanner;
public class Kassakuitti {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double hinta1;
	double hinta2;
	double hinta3;
	
	System.out.println("Anna ekan ostoksen hinta");
	hinta1 = input.nextDouble();
	System.out.println("Anna tokan ostoksen hinta");
	hinta2 = input.nextDouble();
	System.out.println("Anna kolmannen ostoksen hinta");
	hinta3 = input.nextDouble();
	
	double yhteensa = hinta1 +hinta2 + hinta3;
	System.out.println("Yhteis summa on: "+ yhteensa);
	double verotonSumma = yhteensa/1.24;
	System.out.println("Veroton summa on: " + verotonSumma);
	
	}
}

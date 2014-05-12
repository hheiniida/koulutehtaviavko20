package vk14;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PainokerroinOhjelma {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {

        double pituus = 0;
        int paino = 0;
        double painokerroin;

        boolean okPaino = false;
        boolean okPituus = false;

        do {
            try {
                paino = kysyPaino();
                okPaino = true;
            } catch (InputMismatchException e) {
                System.out.println("Paino pitää olla kokonaisluku!");
            } catch (KelvotonPainoPoikkeus e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Odottamaton virhe!");
            }

        } while (!okPaino);

        do {
            try {
                pituus = kysyPituus();
                okPituus = true;
            } catch (InputMismatchException e) {
                System.out.println("Pituus pitää olla desimaaliluku!");
            } catch (KelvotonPituusPoikkeus e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Odottamaton virhe");
            }

        } while (!okPituus);

        painokerroin = laskePainokerroin(paino, pituus);
        DecimalFormat desimaalit = new DecimalFormat("0.00");
        System.out.println("\nPainokerroin on "
                + desimaalit.format(painokerroin) + " (kun paino on " + paino
                        + " kg ja pituus on " + desimaalit.format(pituus)
                        + " metreinä)");
    }

    private static int kysyPaino() throws KelvotonPainoPoikkeus, Exception {
        int paino;

        try {
            System.out.print("Anna paino (kg): ");
            paino = lukija.nextInt();
            if (paino <= 0) {
                throw new KelvotonPainoPoikkeus("Painon pitäisi olla > 0");
            } return paino;
        } catch (Exception e) {
            lukija.nextLine();
            throw e;
        }

    }
    private static double kysyPituus() throws KelvotonPituusPoikkeus, Exception{
        double pituus;
       
        try{
            System.out.print("Anna pituus (m): ");
            pituus=lukija.nextDouble();
            if(pituus<=0 || pituus >=3.0){
                throw new KelvotonPituusPoikkeus("Ihmisen pituus pitää olla > 0 ja alle 3 metriä");
            }return pituus;
        }catch (Exception e){
            lukija.nextLine();
            throw e;
        }
    }
    private static double laskePainokerroin(int paino, double pituus){
        double painokerroin;
        if(pituus!=0){
            return painokerroin=paino/(pituus*pituus);
        }
        else{
            painokerroin=0;
            return painokerroin;
        }
    }
    
    }
class KelvotonPituusPoikkeus extends Exception {

	public KelvotonPituusPoikkeus(String viesti) {
		super(viesti);
	}

}
class KelvotonPainoPoikkeus extends Exception {

	public KelvotonPainoPoikkeus(String viesti) {
		super(viesti);
	}

}
package BattagliaNavale;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int scelta = 0;


        int x = 0;
        int y = 0;
        Random r = new Random();
        Scanner var = new Scanner(System.in);
        do {
            Battaglia_Navale battaglia = new Battaglia_Navale();
            battaglia.toString();
            System.out.println("\nBATTAGLIA NAVALE\n");

            System.out.println("\nHai a disposizione 50 mosse");
            System.out.println("Se colpisci la nave apparirà il simpbolo 'X' altrimenti '#'\n");
            System.out.println("Hai " + battaglia.numeroNavi() + " navi da abbattere, datti da fare!\n");
            int mosse = 0;
            do {
                do {
                    System.out.print("\nInserisci la prima coordinata(y): ");
                    x = var.nextInt(10);
                    if(x<0 || x>9)
                        System.out.println("Numero inesistente, riprova con uno compreso tra 0 e 9\n");
                }while(x<0 || x>9);
                do {
                    System.out.print("Inserisci la seconda coordinata(x): ");
                    y = var.nextInt(10);
                    if(y<0 || y>9)
                        System.out.println("Numero inesistente, riprova con uno compreso tra 0 e 9\n");
                }while(y<0 || y>9);
                battaglia.spara(x, y);

                System.out.println(battaglia.toString());
                System.out.println("Ci sono ancora " + battaglia.numeroNavi() + " navi!");
                mosse++;
            } while (mosse < 5);
            if (battaglia.numeroNavi() == 0)

                System.out.print("\nHai vinto la battaglia, ma non la guerra!\n");
            else
                System.out.println("GAME OVER\n\nDevi aggiustare la mira!\n");

            System.out.print("Vuoi rigiocare [S = 1 /N = 0] = " );
            scelta = var.nextInt();
        }while(scelta != 0);

    }

}


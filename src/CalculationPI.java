/*
Autor: Stefan Neubauer
Erstellt am 12.10.2020

Beschreibung:
Erstes Projekt mit Github und Git Bash
--> Pi berechnen, ziemlich simpel, jedoch muss alles mit Git funktionieren.
 */

import java.util.Scanner;

public class CalculationPI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wie oft soll multipliziert werden für PI?");
        int basis = sc.nextInt();

        System.out.println(piFormelEuler(basis));
        System.out.println(piWallProdukt(basis));
        System.out.println(piLeibnitzReihe(basis));
        System.out.println(piKelallurFormel(basis));
    }

    static String piWallProdukt(int basis){
        int nenner=1;
        int zaehler=0;
        double pi = 1.0;

        for (int i = 0; i <basis ; i++) {
            if (i%2 == 0){ nenner= nenner+2; } else { zaehler = zaehler+2; }

            pi = pi * zaehler/nenner * 2;
        }

        return "Das Ergebnis mit dem Wallprodukt für Pi mit der Basis "+basis+" lautet: "+pi+".";
    }

    static String piLeibnitzReihe(int basis){

        // Algorithmus

        return "Das Ergebnis mit der Leibnitzreihe für Pi mit der Basis "+basis+" lautet:\n";
    }

    static String piKelallurFormel(int basis){

        // Algorithmus

        return "Das Ergebnis mit der Kellalurformel für Pi mit der Basis "+basis+" lautet:\n";
    }

    static String piFormelEuler(int basis){

        // Algorithmus

        return "Das Ergebnis mit der Formel von Euler für Pi mit der Basis "+basis+" lautet:\n";
    }




}

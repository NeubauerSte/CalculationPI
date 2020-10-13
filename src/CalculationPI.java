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
        String ausgabe="Das Ergebnis mit dem Wallprodukt für Pi mit der Basis "+basis+" lautet:\n";




    }

    static String piLeibnitzReihe(int basis){
        String ausgabe="Das Ergebnis mit der Leibnitzreihe für Pi mit der Basis "+basis+" lautet:\n";

    }

    static String piKelallurFormel(int basis){
        String ausgabe="Das Ergebnis mit der Kellalurformel für Pi mit der Basis "+basis+" lautet:\n";

    }

    static String piFormelEuler(int basis){
        String ausgabe="Das Ergebnis mit der Formel von Euler für Pi mit der Basis "+basis+" lautet:\n";


    }




}

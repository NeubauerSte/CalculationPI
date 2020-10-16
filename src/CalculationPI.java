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

        System.out.println(toString(basis));
    }

    public static String toString(int basis){
        return Calculate.piFormelEuler(basis) +
                Calculate.piLeibnitzReihe(basis) +
                Calculate.piKelallurFormel(basis) +
                Calculate.piWallProdukt(basis);
    }


}

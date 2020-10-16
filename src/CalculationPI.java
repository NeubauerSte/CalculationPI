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

        CalculateAll calculateEuler = new CalculateEuler();
        CalculateAll calculateKellalur = new CalculateKellalur();
        CalculateAll calculateLeibnitz = new CalculateLeibnitz();
        CalculateAll calculateWallprodukt = new CalculateWallprodukt();

        System.out.println(calculateEuler.toString(basis));
        System.out.println(calculateKellalur.toString(basis));
        System.out.println(calculateLeibnitz.toString(basis));
        System.out.println(calculateWallprodukt.toString(basis));
    }




}

/*
Autor: Stefan Neubauer
Erstellt am 12.10.2020

Beschreibung:
Erstes Projekt mit Github und Git Bash
--> Pi berechnen, ziemlich simpel, jedoch muss alles mit Git funktionieren.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basis=0;

        try { // Exceptionhandling
            System.out.println("Wie oft soll multipliziert werden für PI?");
            basis = sc.nextInt(); }
        catch (InputMismatchException iem){ System.out.println("Bitte eine ZAHL angeben!"); System.exit(0); }


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

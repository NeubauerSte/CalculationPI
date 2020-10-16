/*
Autor: Stefan Neubauer
Erstellt am 12.10.2020

Beschreibung:
Erstes Projekt mit Github und Git Bash
--> Pi berechnen, ziemlich simpel, jedoch muss alles mit Git funktionieren.
 */

public class Calculate {

    static String piWallProdukt(int basis){
        double pi=1.0;
        double nenner=-1;
        double zaehler=2;

        //Algorithmus für das wallische Produkt
        for (int i = 0; i <basis ; i++) {
            if (i%2 == 0){ nenner= nenner+2; } else { zaehler = zaehler+2; }
            pi = (pi * (zaehler/nenner)); }

        return "Das Ergebnis mit dem Wallprodukt für Pi mit der Basis "+basis+" lautet: "+pi*4+".\n";
    }

    static String piLeibnitzReihe(int basis){
        double pi=0.0;
        double nenner=1;

        // Algorithmus Leibnitzreihe
        for (int i = 0; i < basis ; i++) {
            if (i % 2 == 0){ pi = pi + (1/nenner); } else { pi = pi - (1/nenner); }
            nenner=nenner+2; }

        return "Das Ergebnis mit der Leibnitzreihe für Pi mit der Basis "+basis+" lautet: "+pi*4+".\n";
    }

    static String piKelallurFormel(int basis){
        double pi=1.0;

        // Algorithmus Kellalurformel

        return "Das Ergebnis mit der Kellalurformel für Pi mit der Basis "+basis+" lautet: "+pi+".\n";
    }

    static String piFormelEuler(int basis){
        double pi=1.0;

        // Algorithmus Euler Formel

        return "Das Ergebnis mit der Formel von Euler für Pi mit der Basis "+basis+" lautet: "+pi+".\n";
    }


}

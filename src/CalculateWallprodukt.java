public class CalculateWallprodukt extends CalculateAll {

    @Override
    public String calculate(int basis) {
        double pi=1.0;
        double nenner=-1;
        double zaehler=2;

        //Algorithmus für das wallische Produkt
        for (int i = 0; i <basis ; i++) {
            if (i%2 == 0){ nenner= nenner+2; } else { zaehler = zaehler+2; }
            pi = (pi * (zaehler/nenner)); }

        return "Das Ergebnis mit dem Wallprodukt für Pi mit der Basis "+basis+" lautet: "+pi*4+".\n";
    }
}

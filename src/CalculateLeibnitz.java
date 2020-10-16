public class CalculateLeibnitz extends CalculateAll {
    @Override
    public String calculate(int basis){
        double pi=0.0;
        double nenner=1;

        // Algorithmus Leibnitzreihe
        for (int i = 0; i < basis ; i++) {
            if (i % 2 == 0){ pi = pi + (1/nenner); } else { pi = pi - (1/nenner); }
            nenner=nenner+2; }

        return "Das Ergebnis mit der Leibnitzreihe für Pi mit der Basis "+basis+" lautet: "+pi*4+".\n";
    }

}

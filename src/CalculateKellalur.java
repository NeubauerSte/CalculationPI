public class CalculateKellalur extends CalculateAll {
    @Override
    public String calculate(int basis) {
        double pi = 3.0;
        double nenner = 3.0;

        // Algorithmus Kellalurformel
        for (int i = 0; i < basis; i++) {
            if (i % 2 == 0) {
                pi = pi + 4 / ((Math.pow(nenner, 3)) - nenner);
            } else {
                pi = pi - 4 / ((nenner * nenner * nenner) - nenner);
            }

            nenner = nenner + 2;
        }
        return "Das Ergebnis mit der Kellalurformel für Pi mit der Basis "+basis+" lautet: "+pi+".\n";
    }
}

public class CalculateEuler extends CalculateAll {

    @Override
    public String calculate(int basis){
        double pi=0.0;
        double nenner=1;

        // Algorithmus Euler Formel
        for (int i = 0; i <basis ; i++) { pi = pi + 1/(nenner*nenner); nenner=nenner+2; }
        pi = Math.sqrt(pi*8);

        return "Das Ergebnis mit der Formel von Euler für Pi mit der Basis "+basis+" lautet: "+pi+".\n";
    }

}

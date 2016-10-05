package de.interhyp.cleancode;

/**
 * Created by rshachor on 05.10.2016.
 */
public class Tannenbaum {


    public String zeichnenTannenbaum (int n, boolean spitz)
    {
        StringBuilder sb = new StringBuilder();

        int breite = calculireMaxBreite(n);

        if (spitz)
            sb.append(zeichneBaumReihe('*', 1, breite));

        sb.append(zeichnenTannenbaumAeste (breite));

        sb.append(zeichneBaumReihe('I', 1, breite));

        return sb.toString();
    }


    private String zeichnenTannenbaumAeste (int breite)
    {
        StringBuilder sb = new StringBuilder();

        for (int printed = 1; printed <= breite; printed = printed + 2)
            sb.append(zeichneBaumReihe('X', printed, breite));

        return sb.toString();
    }


    public String zeichneBaumReihe (char c, int printedNumber, int breite)
    {
        int blanksNumber = calculiereLeereSymbolen(breite, printedNumber);

        String links = symboleKetten(blanksNumber, ' ');
        String mitte = symboleKetten(printedNumber, c);
        String rechts = symboleKetten(blanksNumber, ' ');

        return links + mitte + rechts + "\n";
    }


    public int calculiereLeereSymbolen (int breite, int printed)
    {
        return (breite - printed) /2;
    }


    public String symboleKetten(int n, char symbol)
    {
        String kette = "";
        for (int i = 0; i < n; i++)
        {
            kette += symbol;
        }
        return kette;
    }


    public int calculireMaxBreite(int n)
    {
        return (2*n -1);
    }

}

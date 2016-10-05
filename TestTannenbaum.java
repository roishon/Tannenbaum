import de.interhyp.cleancode.Tannenbaum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by rshachor on 05.10.2016.
 */
public class TestTannenbaum {

    private Tannenbaum underTest;


    @Test
    public void testGetTree ()
    {
        underTest = new Tannenbaum();
        int levels = 6;
        String starLine =  "     *     \n";
        String trunkLine = "     I     \n";
        String expectedNoStar = prepare6LevelsTreeCore() + trunkLine;
        String expectedWithStar = starLine + expectedNoStar;

        String resultNoStar = underTest.zeichnenTannenbaum (levels, false);
        String resultWithStar = underTest.zeichnenTannenbaum (levels, true);

        assertEquals (resultNoStar, expectedNoStar);
        assertEquals (resultWithStar, expectedWithStar);
    }



    @Test
    public void testGetTreeLine  ()
    {
        underTest = new Tannenbaum();
        int printed = 3;
        int width = 7;
        char c = 'T';
        String expected = "  TTT  \n";
        String result = underTest.zeichneBaumReihe(c, printed, width);
        assertEquals (result, expected);
    }


    @Test
    public void testCalculateBlanksNumber ()
    {
        underTest = new Tannenbaum();
        int width = 21;
        int printed = 3;
        int expected = 9;
        int result = underTest.calculiereLeereSymbolen(width, printed);
        assertEquals (result, expected);
    }


    @Test
    public void testChainChars ()
    {
        underTest = new Tannenbaum();
        char c = 'H';
        int n = 6;
        String expected = "HHHHHH";
        String result = underTest.symboleKetten(n, c);
        assertEquals (result, expected);
    }


    @Test
    public void testCalculateMaxWidth ()
    {
        underTest = new Tannenbaum();
        int input = 8;
        int expected = 15;
        int result = underTest.calculireMaxBreite(input);
        assertEquals (result, expected);
    }


    private String prepare6LevelsTreeCore ()
    {
        return  "     X     \n" +
                "    XXX    \n" +
                "   XXXXX   \n" +
                "  XXXXXXX  \n" +
                " XXXXXXXXX \n" +
                "XXXXXXXXXXX\n";
    }





}

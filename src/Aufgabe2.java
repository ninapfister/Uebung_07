import javax.swing.*;
import java.text.ParseException;

public class Aufgabe2
{
    public static void main (String[]args)
    {
        try
        {
            int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine ganze Zahl ein!"));
            int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine weitere ganze Zahl ein!"));

            int dividieren = zahl1/zahl2;

            System.out.println(dividieren);

        }
        catch (ArithmeticException aex)
        {
            System.err.println("Fehler!");
        }

        // Aufgabe 3


        catch (NumberFormatException nfex)
        {
            nfex.printStackTrace();
        }

        catch (NullPointerException npex)
        {
            npex.printStackTrace();
        }

        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}

import javax.swing.*;

public class Aufgabe4
{
    public static void main (String[]args)
    {
        try
        {
            double var1 = 5.5;
            int var3 = (int) var1;
            int wert1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine positive Zahl ohne Kommastelle ein!"));

            if (wert1 < 0 || ! ((var1-var3)==0.0)) // negieren ais false true machen und aus true false machen - ist nicht
            {
                throw new Exception();
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

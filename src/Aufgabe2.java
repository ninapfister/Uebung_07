import javax.swing.*;

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
        catch (Exception ex)
        {
            System.err.println("Fehler!");
        }
    }
}

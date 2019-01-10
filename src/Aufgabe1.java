import javax.swing.*;

public class Aufgabe1
{
    public static void main (String[]args)
    {
        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine ganze Zahl ein!"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine weitere ganze Zahl ein!"));

        if (zahl2 == 0)
        {
            System.err.println("Fehler!");
        }
        else
        {
            int dividieren = zahl1/zahl2;

            System.out.println(dividieren);
        }
    }
}

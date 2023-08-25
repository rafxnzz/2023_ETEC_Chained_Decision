package main.java.com.mycompany.ede12_08;

import javax.swing.JOptionPane;

public class Exercicio5 
{
    public static void main(String[] args) 
    {
        double b1, b2, b3, b4, ntf;

        b1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 1ª nota"));
        b2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 2ª nota"));
        b3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 3ª nota"));
        b4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 4ª nota"));

        ntf = (b1+b2+b3+b4)/4;

        if (ntf >= 9)
        {
            JOptionPane.showMessageDialog(null,"APROVADO: A");
        }
        else if (ntf >= 7 && ntf <= 9)
        {
            JOptionPane.showMessageDialog(null,"APROVADO: B");
        }
        else if (ntf >= 5 && ntf <= 7)
        {
            JOptionPane.showMessageDialog(null,"APROVADO: C");
        }
        else if (ntf >= 2.5 && ntf <= 5)
        {
            JOptionPane.showMessageDialog(null,"REPROVADO: D");
        }
        else if (ntf < 2.5)
        {
            JOptionPane.showMessageDialog(null,"REPROVADO: E");
        }
    }     
}

package main.java.com.mycompany.ede12_08;

import javax.swing.JOptionPane;

public class Exercicio6 
{
    public static void main(String[] args) 
    {
        int id;

        id = Integer.parseInt(JOptionPane.showInputDialog("CLASSIFICAÇÃO DOS NARRADORES:"+"\n"+"Insira a sua idade" ));

        if (id >= 5 && id <= 7)
        {
            JOptionPane.showMessageDialog(null,"Infantil A");
        }
        else if (id >= 8 && id <= 10)
        {
            JOptionPane.showMessageDialog(null,"Infantil B");
        }
        else if (id >= 11 && id <= 13)
        {
            JOptionPane.showMessageDialog(null,"Juvenil A");
        }
        else if (id >= 14 && id <= 17)
        {
            JOptionPane.showMessageDialog(null,"Juvenil B");
        }
        else if (id >= 18)
        {
            JOptionPane.showMessageDialog(null,"Senior");
        }
    }
}

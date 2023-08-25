package main.java.com.mycompany.ede12_08;

import javax.swing.JOptionPane;

public class Exercicio2 
{
    public static void main(String[] args) 
    {
        double ps, alt, imc;

        ps =  Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso"));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura"));

        imc = ps/(alt*alt) ;

        if (imc < 18)
        {
            JOptionPane.showMessageDialog(null, "IMC: " +imc+ "\n" + "Magreza" );
        }
        else if ( imc >= 18 && imc <= 24.9)
        {
            JOptionPane.showMessageDialog(null, "IMC: " +imc+ "\n" + "Saudável" );
        }
        else if ( imc >= 25 && imc <= 29.9)
        {
            JOptionPane.showMessageDialog(null, "IMC: " +imc+ "\n" + "Sobrepeso" );
        }
        else if (imc >= 30)
        {
            JOptionPane.showMessageDialog(null, "IMC: " +imc+ "\n" + "Obesidade" );
        }
    }
}

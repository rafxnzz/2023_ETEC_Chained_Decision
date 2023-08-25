package main.java.com.mycompany.ede12_08;

import javax.swing.JOptionPane;

public class Exercicio8 
{
    public static void main(String[] args) 
    {
        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro lado do triângulo"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo lado do triângulo"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro lado do triângulo"));
        
            
            if ( ( a + b > c) && ( b + c > a ) && ( c + a > b )){

                if (a==b && b==c )
                {
                    JOptionPane.showMessageDialog(null, "O triângulo é equilatero");
                }
                    else if ( a==b && b!=c )
                    {
                        JOptionPane.showMessageDialog(null, "O triângulo é isósceles");
                    }
                    else if ( b==c && c!=a )
                    {
                        JOptionPane.showMessageDialog(null, "O triângulo é isósceles");
                    }
                    else if ( c==a && a!=b )
                    {
                        JOptionPane.showMessageDialog(null, "O triângulo é isósceles");
                    }
                    else if ( a!=b && b!=c )
                    {
                        JOptionPane.showMessageDialog(null, "O triângulo é escaleno");
                    }
                    else if ( b!=c && c!=a )
                    {
                        JOptionPane.showMessageDialog(null, "O triângulo é escaleno");
                    }
                    else if ( c!=a && a!=b )
                    {
                        JOptionPane.showMessageDialog(null, "O triângulo é escaleno");
                    }
                } 
            else  
            {
                JOptionPane.showMessageDialog(null, "Estes dados não formam um triângulo");
            }
    }
}

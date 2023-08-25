package main.java.com.mycompany.ede12_08;

import javax.swing.JOptionPane;

public class Exercicio3
{
    public static void main(String[] args) 
    {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insire o número do pedido:"+"\n"+
        "1. BigMac"+"\n"+
                "2. Quarteirão"+"\n"+
                        "3. MacChicken"+"\n"+
                                "4. Cheddar MacMelt"+"\n"+
                                        "5. MacMax"));
        
        switch (numero)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"BigMac");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Quarteirão");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"MacChicken");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Cheddar MacMelt");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"MacMax");
                break;
            default:
                JOptionPane.showMessageDialog(null,"erro: INSIRA UM NUMERO DE 1 A 5");
                break;
                
        }
    }
}

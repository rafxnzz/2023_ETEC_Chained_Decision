package main.java.com.mycompany.ede12_08;

import javax.swing.JOptionPane;

public class Exercicio4 
{
    public static void main(String[] args) 
    {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero de 1 a 12 para saber o mês do ano"));
        
        switch (numero)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"JANEIRO");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"FEVEREIRO");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"MARÇO");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"ABRIL");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"MAIO");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"JUNHO");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"JULHO");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"AGOSTO");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"SETEMBRO");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"OUTUBRO");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"NOVEMBRO");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"DEZEMBRO");
                break;
            default:
                JOptionPane.showMessageDialog(null,"erro: INSIRA UM NÚMERO DE 1 A 12");
                break;
                
        }
    }    
}

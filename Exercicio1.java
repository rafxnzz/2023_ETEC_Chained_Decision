import javax.swing.JOptionPane;

public class Exercicio1 
{
    public static void main(String[] args) 
    {
        double hor;
        
        hor = Double.parseDouble(JOptionPane.showInputDialog("Insira o inicio do turno"));
        
        if (hor >= 5 && hor <= 12.59)
        {
            JOptionPane.showMessageDialog(null,"O seu turno é de manhã");
        }
        else if (hor >= 13 && hor <= 20.59)
        {
            JOptionPane.showMessageDialog(null,"o seu turno é de tarde");
        }
        else if (hor >= 21 && hor <= 4.59)
        {
            JOptionPane.showMessageDialog(null,"O seu turno é de noite");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"erro: INSIRA UM NUMERO DE 00.00 A 23.59");
        }
    }
}

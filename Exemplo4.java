import javax.swing.JOptionPane;

public class Exemplo4 
{
    public static void main(String[] args) 
    {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insire um valor de 1 a 3"));
        
        switch (numero)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"UM");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"DOIS");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"TRÊS");
                break;
            default:
                JOptionPane.showMessageDialog(null,"erro: INSIRA UM VALOR DE 1 A 3");
                break;
                
        }
    }
}

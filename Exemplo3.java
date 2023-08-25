import javax.swing.JOptionPane;

public class Exemplo3 
{
    public static void main(String[] args) 
    {
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade"));
        
        if(idade<=12)
        {
            JOptionPane.showMessageDialog(null, "Criança");
        }
        else if (idade<=19)
        {
            JOptionPane.showMessageDialog(null, "Adolecente");
        }
        else if (idade<=60)
        {
            JOptionPane.showMessageDialog(null, "Adulto"); 
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Idoso"); 
        }
    }
}

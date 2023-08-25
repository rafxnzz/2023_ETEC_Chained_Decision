import javax.swing.JOptionPane;

public class Exemplo5 
{
    public static void main(String[] args) 
    {
        int a, b, c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
        
        if ((a<b) && (a<c))
        {
            if(b<c)
                {
                    JOptionPane.showMessageDialog(null,"A sequencia é "+a+" - "+b+" - "+c);
                }
            else
                {
                    JOptionPane.showMessageDialog(null,"A sequencia é "+a+" - "+c+" - "+b);
                }
        }
        else if((b<a) && (b<c))
        {
            if(a<c)
                {
                    JOptionPane.showMessageDialog(null,"A sequencia é "+b+" - "+a+" - "+c);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"A sequencia é "+b+" - "+c+" - "+a);
                }
        }
        else
        {
            if(a<b)
                {
                    JOptionPane.showMessageDialog(null,"A sequencia é "+c+" - "+a+" - "+b);
                }
            else
                {
                    JOptionPane.showMessageDialog(null,"A sequencia é "+c+" - "+b+" - "+a);
                }
        }
    }
}

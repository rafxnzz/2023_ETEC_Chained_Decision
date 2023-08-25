import javax.swing.JOptionPane;

public class Exemplo2 
{
    public static void main(String[] args) 
    {
        String pais="", estado="", cidade="", bairro="";
        
        pais = JOptionPane.showInputDialog("Informe o pais");
        estado = JOptionPane.showInputDialog("Informe o estado");
        cidade = JOptionPane.showInputDialog("Informe o cidade");
        bairro = JOptionPane.showInputDialog("Informe o bairro");
        
        if(!pais.equals("Brasil"))
            {
                JOptionPane.showMessageDialog(null, "País errado !!!");
            }
        else
            {
                if(!estado.equals("Bahia"))
                    {
                       JOptionPane.showMessageDialog(null, "Estado errado !!!");            
                    }
                else
                    {
                        if(!cidade.equals("Salvador"))
                            {
                            JOptionPane.showMessageDialog(null, "Cidade errada !!!");
                            }
                        else
                            {
                                if(bairro.equals("Nhocuné"))
                                    {
                                        JOptionPane.showMessageDialog(null, "Este bairro possui 5.500 habitantes");
                                    }
                            }
                       
                    }
            }
    }
}    
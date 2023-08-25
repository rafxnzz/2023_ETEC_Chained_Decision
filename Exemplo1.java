import javax.swing.JOptionPane;

public class Exemplo1 
{
    public static void main(String[] args) 
    {
        String pais="", estado="", cidade="", bairro="";
        
        pais = JOptionPane.showInputDialog("Informe o pais");
        estado = JOptionPane.showInputDialog("Informe o estado");
        cidade = JOptionPane.showInputDialog("Informe o cidade");
        bairro = JOptionPane.showInputDialog("Informe o bairro");
        
        if(pais.equals("Brasil"))
            {
                if(estado.equals("Bahia"))
                    {
                        if(cidade.equals("Salvador"))
                            {
                                if(bairro.equals("Nhocuné"))
                                    {
                                        JOptionPane.showMessageDialog(null, "Esse bairro possui 5.500 habitantes");
                                    }
                            }
                    }
            }
        
    }
}

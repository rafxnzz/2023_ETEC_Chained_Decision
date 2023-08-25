package main.java.com.mycompany.ede12_08;

import javax.swing.JOptionPane;

public class Exercicio7 
{
    public static void main(String[] args) 
    {
        int dia1, mes1, ano1, data1, dia2, mes2, ano2, data2;
        dia1 = Integer.parseInt(JOptionPane.showInputDialog("PRIMEIRA DATA: "+"\n"+"Dia"));
        mes1 = Integer.parseInt(JOptionPane.showInputDialog("PRIMEIRA DATA: "+"\n"+"Dia"));
        ano1 = Integer.parseInt(JOptionPane.showInputDialog("PRIMEIRA DATA: "+"\n"+"Dia"));
        JOptionPane.showMessageDialog(null,"PRIMEIRA DATA: "+"\n" +dia1+"/"+mes1+"/"+ano1);

        data1 = dia1+mes1+ano1;

        dia2 = Integer.parseInt(JOptionPane.showInputDialog("SEGUNDA DATA: "+"\n"+"Dia"));
        mes2 = Integer.parseInt(JOptionPane.showInputDialog("SEGUNDA DATA: "+"\n"+"Mês"));
        ano2 = Integer.parseInt(JOptionPane.showInputDialog("SEGUNDA DATA: "+"\n"+"Ano"));
        JOptionPane.showMessageDialog(null,"SEGUNDA DATA: "+"\n" +dia2+"/"+mes2+"/"+ano2);

        data2 = dia2+mes2+ano2;

        if ( data1 < data2)
        {
            JOptionPane.showMessageDialog(null,"EM ORDEM CRESCENTE: "+"\n" +dia1+"/"+mes1+"/"+ano1+ " e "+dia2+"/"+mes2+"/"+ano2);
        }
        else if ( data1 > data2)
        {
            JOptionPane.showMessageDialog(null,"EM ORDEM CRESCENTE: "+"\n" +dia2+"/"+mes2+"/"+ano2+ " e "+dia1+"/"+mes1+"/"+ano1);
        }
        else if ( data1 == data2 )
        {
            JOptionPane.showMessageDialog(null,"DATAS IGUAIS");
        }

    }
}  
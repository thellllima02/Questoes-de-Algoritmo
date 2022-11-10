package Modularização;
import javax.swing.JOptionPane;
public class atividade_03 {
   
    public static double IMC ( double A, double P){
        double resP;
        resP = P/(A*A);
        return resP;
    }

    public static void main(String[] args) {
        double peso,altura,res;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual o seu peso ?"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual a sua altura ? "));
        
        res = IMC(peso,altura);
        
        JOptionPane.showMessageDialog(null, " Seu IMC é "+res);
    }
}

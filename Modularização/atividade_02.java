package Modularização;
import javax.swing.JOptionPane;
public class atividade_02 {
    public static double KM ( double velo, double temp){
        double resP;
        resP = velo/60*temp;
        return resP;
        
    }

    public static void main(String[] args) {
        double velocidade,tempo,res;
        
        velocidade = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual a sua velociade "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog(null, " Por quantos minutos permaneceu nessa velocidade ?"));
        
        res = KM(velocidade,tempo);
        
        JOptionPane.showMessageDialog(null, "Foi pecorrido "+res+" quilometros");
    
    }
   
    
}

package Lacos;
import javax.swing.JOptionPane;

public class JurosComposto {

    
    public static void main(String[] args) {
        double capital=5000,tempo=2,taxa=0.8;
        
//        montante = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual é o valor Inicial"));
//        capital = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor que sera Calculado?"));
//        taxa = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual sera a taxa ao ano"));
//        tempo = Double.parseDouble(JOptionPane.showInputDialog(null, " Por quanto tempo ?"));
        
        
        for (int e=0;e<tempo;e++){
            capital = ((capital*taxa)/100)+capital;
        }
        
        JOptionPane.showMessageDialog(null, capital);
    }
    
}
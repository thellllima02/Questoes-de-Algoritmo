package Lacos;
import javax.swing.JOptionPane;
public class questao_28 {
    public static void main(String[] args) {
    
        double y2, y3, y4, y5 = 0, y6;
        
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        
        for(int y = 2; y < y2; y++)
        {
            y = y * (y - 1);
            
            y3 = y;
            
            y4 = 1 / y3;
            
            y5 = y5 + y4;
        }
        y6 = y5 + 2;
        JOptionPane.showMessageDialog(null, "O valor da costante é = " + y6);
    }
    
    
}

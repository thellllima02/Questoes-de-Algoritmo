package Recursão;
import javax.swing.JOptionPane;
public class atividade_03{
    
    public static int fatori(int m, int n ){
        if(m>1){
            return m + atividade_03.fatori(m, n-1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int m1,n1;
        
        m1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com um numero "));
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com um numero "));
        
        
        
        JOptionPane.showMessageDialog(null, " numero fatorial é "+atividade_03.fatori(m1,n1));
        
    }
    
}
    


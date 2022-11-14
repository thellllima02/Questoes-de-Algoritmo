package Recursão;
import javax.swing.JOptionPane;
public class atividade_03{
    
    public static int fatori(int m, int n ){
        if(m==0){
            return 1;
        }
        else 
        return x*fatori(x-1);
    }

    public static void main(String[] args) {
        int m1;
        
        m1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com um numero "));
        
        JOptionPane.showMessageDialog(null, " numero fatorial é = "+atividade_03.fatori(m1));
        
    }
    
}
    
//Como saber o numero fatorial.

package Recursão;
import javax.swing.JOptionPane;
public class fatorial{
    
    public static int fatori(int n ){
        if(n==0){
            return 1;
        }
        else 
        return n*fatori(n-1);
    }

    public static void main(String[] args) {
        int m1;
        
        m1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com um numero "));
        
        JOptionPane.showMessageDialog(null, " numero fatorial é = "+atividade_03.fatori(m1));
        
    }
    
}
    
//Como saber o numero fatorial.

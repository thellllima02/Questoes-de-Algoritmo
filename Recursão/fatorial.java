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
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com um numero "));
        
        JOptionPane.showMessageDialog(null, " Numero fatorial de "+numero+" é "+fatorial.fatori(numero));
        
    }
    
}
    
//Como saber o numero fatorial.

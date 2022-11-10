package Recursão;
import javax.swing.JOptionPane;
public class questao_01 {
    public static int fatorial(int x){
        if(x==0)
            return 1;
        else 
            return x*fatorial(x-1);
        
    }
        public static void main(String[] args) {
            
            int fat;
            
            fat = Integer.parseInt(JOptionPane.showInputDialog(null, " Numero "));
            
            JOptionPane.showMessageDialog(null, "Fatorial = "+questao_01.fatorial(fat));
        }
        
    }
    


package Recursão;
import javax.swing.JOptionPane;
public class atividade_01 {
    
    
        
        public static int chama (int x, int n){
            if(n==0)
                return 1;
            else 
                return  x * chama (x,n-1);
        }
    
        public static void main(String[] args) {
            int x,n;
            
            x = Integer.parseInt(JOptionPane.showInputDialog(null, " Numero "));
            n = Integer.parseInt(JOptionPane.showInputDialog(null, " Expoente"));
            
            JOptionPane.showMessageDialog(null, " Resultado "+atividade_01.chama(x,n));
            
         
        }
        
    }
     //Atividade do dia 09/11/2022 
    //01 - Emplemente uma função recursiva que da dois numeros x e n inteiros. Calcula o valor de x elevado a n;


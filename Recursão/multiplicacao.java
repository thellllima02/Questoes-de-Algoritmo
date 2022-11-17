package Recursão;
import javax.swing.JOptionPane;
public class multiplicacao {

   
    
    
        public static int multR(int m, int n){
               if (n > 0) {
                 return m + multiplicacao.multR(m,n-1);
             }
             return 0;
          }
        public static void main(String[] args) {
              int m1,n1;
            m1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de m1 "));
            n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de m2 "));
            JOptionPane.showMessageDialog(null,"A multiplicação de " + m1 +" x "+n1 + " é " + multiplicacao.multR(m1,n1));
        }
        
    }
    


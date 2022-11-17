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
              int numero1,numero2;
            numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro numero "));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo numero "));
            JOptionPane.showMessageDialog(null,"A multiplicação de "+numero1+" x "+numero2+" é "+multiplicacao.multR(numero1,numero2));
        }
        
    }
    
    //Multiplicação de dois numeros 


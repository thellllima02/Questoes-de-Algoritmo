package Recursão;
import javax.swing.JOptionPane;
public class atividade_05 {
    public static int chama(int x){
        if(x==1){
            return 2;
            }
        else if (x>1){
          return(2*x)+chama(x-1);
        }
        return 0;
     }

  public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, " Numero "));
        
        JOptionPane.showMessageDialog(null, " Soma dos primeiro numeros pares de 1 ate "+numero+" são "+atividade_05.chama(numero));
    }
}
//05 - Criar um algoritmo que retorna a soma dos N primeiros numeros inteiros pares usando recursão.
    


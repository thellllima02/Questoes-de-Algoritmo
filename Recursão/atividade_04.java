package Recursão;
import javax.swing.JOptionPane;
public class atividade_04 {
    public static int chama(int x){
    
    if(x==1){
        return 1;
        }
    else if (x>1){
      return(2*x)-1+chama(x-1);
    }
    return 0;
 }
public static void main(String[] args) {
    int numero;
    
    numero = Integer.parseInt(JOptionPane.showInputDialog(null, " Numero "));
    
    JOptionPane.showMessageDialog(null, " Soma dos primeiro numeros impares "+numero+" são "+atividade_04.chama(numero));
     
}

}
//04 - Criar um algoritmo que retorna a soma dos N primeiros numeros inteiros impares usando recursão.


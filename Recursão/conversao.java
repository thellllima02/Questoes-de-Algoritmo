package Recursão;
import javax.swing.JOptionPane;
public class conversao {

    public static int binario(int n ){
        if(n==1){
            return 1;
        }
        else{
        return n%2+binario(n/2)*10;    
        } 
     }

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com um numero "));
        
        JOptionPane.showMessageDialog(null, " Conversão de "+numero+" base decimal para binario é "+conversao.binario(numero));
       }
    
    
}

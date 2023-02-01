package Recursão;
import javax.swing.JOptionPane;
public class Mult {

    public static double mult(double n){
        if(n==1){
            return 1;
        }
        else {
            return 1/n+mult(n-1);
        }
    }
    public static void main(String[] args) {
        double numero;
        
        numero = Double.parseDouble(JOptionPane.showInputDialog(null, " Entre com um numero"));
        
        JOptionPane.showMessageDialog(null, " Resposta é "+Mult.mult(numero));
        
    }
    
}

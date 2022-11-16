package Lacos;
import javax.swing.JOptionPane;
public class questao_25 {

    public static void main(String[] args) {
    
        int numero1, numero2, resto;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        
        while (numero2 != 0)
        {
        resto = numero1 % numero2;
        
        numero1 = numero2;
        
        numero2 = resto;
         
        JOptionPane.showMessageDialog(null, "MDC = " + numero1);
        }
    }

    
}

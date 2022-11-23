package Recursão;
import javax.swing.JOptionPane;
public class prova_01 {
    public static double soma(double x ){
        if(x==1){
            return 1;
        }
        else {
           return 1/x+soma(x-1);
        }
    }

    public static void main(String[] args) {
        double numero;
        
        numero = Double.parseDouble(JOptionPane.showInputDialog(null, " Entre com um numero "));
        
        JOptionPane.showMessageDialog(null, " Resposta é "+ prova_01.soma(numero));
        

    }
    
}
// 01 - Implemente um metodo recursivo que receba como entrada um numeroa inteiro positivo N 
// e retorne o seguinte calculo 
// 1/1 + 1/2 + 1/3 + ...+ 1/n. 
//Caso base: n=1, soma = 1 
//recursao: 1/n + soma(n-1)
// Dica: Para ver o retirno como decimal apenas inclua (double) depois do return do metodo.

    

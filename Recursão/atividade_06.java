package Recursão;
import javax.swing.JOptionPane;
public class atividade_06 {

    public static int fibonacci (int x){
        if(x==0){
            return 0;
        }
        else if(x==1){
            return 1;
        }
        else{
            return fibonacci(x-1)+fibonacci(x-2);
        } 
        
    } 

    public static void main (String[] args){
        int numero;
        String mostrar = " ";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, " entre com numero "));
        
        for(int w=0; w<=numero; w++){
            mostrar += fibonacci(w)+" ";
        }

        JOptionPane.showMessageDialog(null, "Sequência de numeros Fibonacci ate "+numero+" são "+ mostrar);


    }
    
}
//06 - Pesquisar caso base e recursão e implementar um algoritmo para gerar a sequencia de fibonacci
package Recursão;
import javax.swing.JOptionPane;
public class atividade_03 {

    public static int vetor(int v[], int x){
        if (x==0)
            return 0;
        return v[x-1]+vetor(v,x-1);
     }

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual o numero que deseja somar "));
        int numero []= new int[num];
        for (int q=0; q<numero.length; q++){
        numero[q] = Integer.parseInt(JOptionPane.showInputDialog(null, " Numeros "));    
        }
        JOptionPane.showMessageDialog(null, " resultado da soma dos numeros "+atividade_03.vetor(numero,num));
         
   }

    public static String fatori(int m1) {
        return null;
    }
    
}

    //03 - Usando recursividade calcule a soma de todos os valores de um array de numeros inteiros;
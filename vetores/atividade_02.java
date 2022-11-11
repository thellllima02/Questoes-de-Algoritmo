package vetores;
import javax.swing.JOptionPane;
public class atividade_02 {

    public static void main (String [] args){

        double soma=0,mediaA,saber;
        double numeros[] = new double[10];
        
        saber = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual a quantidade de numeros de entrada"));
        
        for (int w=0; w<saber; w++){
            numeros[w] = Double.parseDouble(JOptionPane.showInputDialog(null, " Entrada dos numeros "));
            soma+=numeros[w];
        }
        
        mediaA = soma/saber;
        
        JOptionPane.showMessageDialog(null, " A media aritimetica é "+mediaA);
        
        
        
        //Questão = Cronstrua um algoritmo que mostre a media aritmetic de qualquer quantidade de valores entrada pelo usuario 



    }
    
}

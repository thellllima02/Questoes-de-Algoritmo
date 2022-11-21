package Matriz;
import javax.swing.JOptionPane;
public class questao_04 {
    
    public static void main(String[] args) {
        double matriz [][] = new double[3][3];
        double soma=0;
        for(int w=0; w<3; w++){
            for (int e=0; e<3; e++){
                matriz[w][e] = Double.parseDouble(JOptionPane.showInputDialog(null, "Linha "+(w+1)+"Coluna "+(e+1)));
            }
         }
        soma = matriz[0][0]+matriz[1][1]+matriz[2][2];
        JOptionPane.showMessageDialog(null, "Soma dos elementos da diagonal "+soma);
    
    }
    
}
   

//04 - Faça um algoritmo para ler uma matriz 3x3 real e imprimir a soma dos elementos da diagonal principal. Generalize para uma matriz NxN.

package Matriz;
import javax.swing.JOptionPane;
public class questão_02 {
    
    public static void main(String[] args) {
        double matriz [][] = new double[5][5];
        double matriz2 [][] = new double[5][5];
        
        
        for(int w=0; w<5; w++){
            for (int e=0; e<5; e++){
                matriz[w][e] = Double.parseDouble(JOptionPane.showInputDialog(null, "Linha "+(w+1)+"Coluna "+(e+1)));
                matriz2[w][e] = matriz[w][e]*matriz[w][e]*matriz[w][e];
            }
         }
        
        JOptionPane.showMessageDialog(null, "Elemento do meio "+matriz[2][2]+"\nElemento do meio ao cubo "+matriz2[2][2]);
        
    
    }
    
}

//02 - Ler uma matriz 5x5 e gerar outra em que cada elemento é o cubo do elemento respectivo na matriz original.
//Imprima depois o elemento do meio desta nova matriz.

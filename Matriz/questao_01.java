package Matriz;
import javax.swing.JOptionPane;
public class questao_01 {

    public static void main(String[] args) {
        double matriz [][] = new double[3][4];
        
        for(int w=0; w<3; w++){
            for (int e=0; e<4; e++){
                matriz[w][e] = Double.parseDouble(JOptionPane.showInputDialog(null, "Linha "+(w+1)+"Coluna "+(e+1)));
             }
         }
        JOptionPane.showMessageDialog(null, "Superior esquerdo"+matriz[0][0]+"\n Inferior direito "+matriz[2][3]);
    }
}
//01 - Faça um algoritmo para ler uma matriz 3x4 de numeros reais, e depois exibir o elemento do canto superior 
//esquerdo e o do canto inferior direito 
    


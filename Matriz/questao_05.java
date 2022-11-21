package Matriz;
import javax.swing.JOptionPane;
public class questao_05 {
    
    public static void main(String[] args) {
        double matriz [][] = new double[4][3];
        double soma=0;
        int pergunta;
        for(int w=0; w<4; w++){
            for (int e=0; e<3; e++){
                matriz[w][e] = Double.parseDouble(JOptionPane.showInputDialog(null, "Linha "+(w+1)+"\nColuna "+(e+1)));
            }
         }
        pergunta = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual linha deseja somar \n 1 a 4"));
        
        if((pergunta>0)&&(pergunta<5)){
            for(int x=0; x<3; x++)
            soma += matriz[x][pergunta];
        }
        else {
            JOptionPane.showMessageDialog(null, "Linha não existe ");
        }
        
        JOptionPane.showMessageDialog(null, "Soma da linha "+pergunta+" é "+soma);
    
    }
    
}
//05 - Ler uma matriz 4x3 real e imprimir a soma dos elementos de uma linha L fornecida pelo usuario.

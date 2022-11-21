package Matriz;
import javax.swing.JOptionPane;
public class questao_06 {
public static void main(String[] args) {
        double matriz [][] = new double[4][3];
        double mostra=0;
        int L,C;
        for(int w=0; w<4; w++){
            for (int e=0; e<3; e++){
                matriz[w][e] = Double.parseDouble(JOptionPane.showInputDialog(null, "Linha "+(w+1)+"\nColuna "+(e+1)));
            }
         }
        L = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual linha deseja somar \n 1 a 4"));
        C = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual coluna deseja somar \n 1 a 3"));
        if((L>0)&&(L<5)||(C>0)&&(C<4)) {
            mostra = matriz[L][C];
            JOptionPane.showMessageDialog(null, "O elementos da linha "+L+" e coluna "+C+" é "+mostra);
        }
        else {
            JOptionPane.showMessageDialog(null, "Linha e coluna não existe ");
        }
    }
}
//06 - Ler uma matriz 4x3 real. Depois, mostre qual é o elemento armazenado em um linha L e coluna C fornecidas pelo usuário. 

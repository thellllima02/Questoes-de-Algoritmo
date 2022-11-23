package Matriz;
import javax.swing.JOptionPane;
public class atividade_01 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        String l1=" ",l2=" ",l3=" ",l11=" ",l22=" ",l33=" ";

        for (int w = 0; w < 3; w++) {
            for (int x = 0; x < 3; x++) {
                matriz[w][x] = Integer.parseInt(JOptionPane.showInputDialog(null, " Linha " + (w + 1) + " Coluna " + (x + 1)));
                matriz2[x][w] = matriz[w][x];
                }
          }
        for (int w = 0; w < 3; w++) {
            for (int x = 0; x < 3; x++) {
                matriz2[x][w]=matriz[w][x];
            }}
        for(int x=0; x<3; x++){
                l1 +=matriz[0][x]+" ";
                l2 +=matriz[1][x]+" ";
                l3 +=matriz[2][x]+" ";
                l11 +=matriz2[0][x]+" ";
                l22 +=matriz2[1][x]+" ";
                l33 +=matriz2[2][x]+" ";
            
        }
        JOptionPane.showMessageDialog(null, "Primeira Matriz \n" + l1+"\n"+l2+"\n"+l3 + " \n Segunda Matriz \n" + l11+"\n"+l22+"\n"+l33);
       
    }

    //Mudar a ordem de saida. 
}

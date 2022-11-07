package vetores;
import javax.swing.JOptionPane;
public class questao_08 {
    public static void main(String[] args) {
        int vetor [][] = new int[3][5];
        String mostrar = " ";
        for(int w=0; w<2; w++){
            for(int e=0; e<5; e++){
                vetor[w][e] = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com numeros"));
            }
        }
         for(int r=0; r<5; r++){
             if (vetor[0][r]==vetor[1][r]){
                 vetor[2][r]=1;
             }
             else if (vetor[0][r]!=vetor[1][r]){
                 vetor[2][r]=0;
             }
            mostrar+=vetor[2][r]+ " ";
        }
         JOptionPane.showMessageDialog(null, mostrar);
                
                
    }
    
}

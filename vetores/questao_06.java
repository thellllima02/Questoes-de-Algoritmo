package vetores;
import javax.swing.JOptionPane;
public class questao_06 {
    public static void main(String[] args) {
        int inverso [] = new int [20];
        int cont=10;
        String mostrar = " ";
        for(int w=0 ; w<10 ; w++){
            inverso[w] = Integer.parseInt(JOptionPane.showInputDialog(null,"entre com numeros "));
        }
        for(int e=10 ; e<20 ; e++){
            cont--;
            inverso[e]=inverso[cont];
        }
        for (int q =0 ; q<20 ; q++){
            mostrar +=inverso[q] + " ";
        }
        
        JOptionPane.showMessageDialog(null, mostrar);
        
    }
    
}

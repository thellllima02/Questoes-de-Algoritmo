package vetores;
import javax.swing.JOptionPane;
public class questao_02 {
    public static void main(String[] args) {
        int numero[] = new int [20];
        String mostrar = " ";
        for ( int q=0 ; q<20 ; q++ ){
            numero[q] = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com numeros "));
        }
        for (int w=19 ; w>=0 ; w--){
            mostrar += numero[w] + " ";
        }
        JOptionPane.showMessageDialog(null, mostrar );
    }
     
}
//02 - Ler 20 numeros inteiros e depois imprimi-los em ordem inversa 
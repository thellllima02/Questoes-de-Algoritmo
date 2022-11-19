package vetores;
import javax.swing.JOptionPane;
public class questao_04 {
    public static void main(String[] args) {
        int numero[] = new int[30];
        String impar = " ";
        for(int w=0 ; w<30 ; w++){
            numero[w] = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com numeros "));
        }
        for( int e=1 ; e<30 ; e+=2){
            impar+=numero[e]+" ";
        }
        JOptionPane.showMessageDialog(null,"Números presentes nos indices impares = \n"+ impar );
    }
    
}
//04 - Ler 30 numeros reais em um vetor e depois exibir os numeros lacalizados nas posições impares. 
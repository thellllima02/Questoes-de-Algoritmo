package vetores;
import javax.swing.JOptionPane;
public class questao_01 {

    public static void main(String[] args) {
        int quadrado [] = new int [31];
        int cont=1,resul;
        String mostrar = " ";
        quadrado[0]=0;
        quadrado[1]=1;
        for(int w=2; w<31; w++){
            cont++;
            resul = cont*cont;
            quadrado[w]=resul;
            mostrar +=quadrado[w] + " ";
        }
        JOptionPane.showMessageDialog(null, quadrado[0] +" "+ quadrado[1] + mostrar);
    }
    
}

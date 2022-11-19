package vetores;
import javax.swing.JOptionPane;
public class questao_07 {
    public static void main(String[] args) {
        int vetor [][] = new int [3][5];
        //int cont=0, cont1=0;
        String mostrar3 = " ",mostrar2 = " ",mostrar1 = " ";
        for(int w=0; w<2; w++){
            for(int e=0; e<5; e++){
                vetor[w][e] = Integer.parseInt(JOptionPane.showInputDialog(null," Entre com numeros "));
             }
             }
            for(int t=0; t<5; t++){
                vetor[2][t]+=vetor[0][t]+vetor[1][t];
                mostrar1 += vetor[0][t] + " ";
                mostrar2 += vetor[1][t] + " ";
                mostrar3 += vetor[2][t] + " ";
            }
            
        
           JOptionPane.showMessageDialog(null," Primeira linha = "+ mostrar1+"\nSegunda linha = "+mostrar2+"\nSoma das 2ª     = "+mostrar3);
        }
        
    
}

//07 - Ler dois vetores de numeros inteiros, cada um com 30 posições. Crie um terceiro vetor onde cada valor é a soma dos valores contidos
//nas posições respectivas dos vetores originais. Imprima depois os tres vetores.
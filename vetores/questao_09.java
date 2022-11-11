package vetores;
import javax.swing.JOptionPane;
public class questao_09 {

    public static void main(String [] args){
        int saber = 0,cont = 0;
    String mes [] = new String[]{ 
        "Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        String mostrar = " ";
        saber = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos meses voçê deseja ver ?"));

        for(int w=0; w<saber; w++){
            cont++;
            mostrar+=cont+" = "+mes[w]+"\n";
        }

        JOptionPane.showMessageDialog(null, mostrar);



        //Questão = Construa um algoritmo que mostre os meses do ano na quantidade entrada pelo usuario.
    


    }
    
}

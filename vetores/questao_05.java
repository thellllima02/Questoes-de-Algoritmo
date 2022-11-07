package vetores;
import javax.swing.JOptionPane;
public class questao_05 {
    
    public static void main(String[] args) {
        double porcento[] = new double[16];
        double cinco1=0,dois1=0;
        String cinco =" ",dois=" ";
        for(int q=0; q<16; q++){
            porcento[q] = Double.parseDouble(JOptionPane.showInputDialog(null, " Entre com numeros "));
        }
        for (int w=1 ; w<16 ; w+=2){
            cinco1 =(porcento[w]/100)*5 ;
            cinco +=porcento[w]+cinco1 +" ";
        }
        for(int e=0 ; e<16 ; e+=2){
            dois1 =(porcento[e]/100)*2;
            dois += porcento[e]+dois1 + " ";
        }
        JOptionPane.showMessageDialog(null, " Indices na posições impares com aumento de 5% \n"+cinco + 
                "\n Indices na posições pares com aumento de 2% \n "+dois);
    }
   
}

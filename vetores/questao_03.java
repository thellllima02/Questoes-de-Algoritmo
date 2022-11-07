package vetores;
import javax.swing.JOptionPane;
public class questao_03 {
    public static void main(String[] args) {
        int numero[] = new int [20];
        String mostrar = " ",mostrar2 = " ",mostra3 = " ";
        for ( int q=0 ; q<20 ; q++ ){
            numero[q] = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com numeros "));
            mostrar2+=numero[q] + " ";
        }
        for (int w=19 ; w>=0 ; w--){
            mostrar += numero[w] + " ";
        } 
        for(int r=0; r<20; r++){
            mostra3 ="Ordem de entrada = \n"+ mostrar2 +"\n Ordem aocontraria = \n" + mostrar ;
        }
        JOptionPane.showMessageDialog(null, mostra3);
      }
   
}

package Lacos;
import javax.swing.JOptionPane;
public class questao_29 {

    public static void main(String[] args) {
        int cont=1,cont1=0;
        double resul [] = new double[70];
        do {
            cont++;
            cont1++;
            resul[1]=1;
            resul[cont] = resul[cont1]*2 ;
        }while(cont!=66);
        
        JOptionPane.showMessageDialog(null, "O valor é \n"+resul[65]);
        
        
        
        
    }
    
    
}

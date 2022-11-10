package Recursão;
import javax.swing.JOptionPane;
public class atividade_02 {



    
    public static int chama (int x){
        if(x==0){
            return 0;
        }
        else{
            return x + chama(x-1);
        }
            
    }

    public static void main(String[] args) {
        int x;
        
        x = Integer.parseInt(JOptionPane.showInputDialog(null, " Numero final "));
        
        JOptionPane.showMessageDialog(null, " Resultado "+atividade_02.chama(x));
        

    }
    
}
    


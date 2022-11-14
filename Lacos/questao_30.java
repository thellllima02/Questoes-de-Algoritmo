package Lacos;
import javax.swing.JOptionPane;
public class questao_30 {
    public static void main(String[] args) {
        int cont =6;
        for(int w=13; w<1001; w++){
         if((w%2>=1)&&(w%3>=1)&&(w%5>=1)&&(w%7>=1)&&(w%11>=1)&&(w%13>=1)&&(w%17>=1)&&(w%19>=1)&&(w%23>=1)){
             cont++;
         }
         
        }
        JOptionPane.showMessageDialog(null, "De 1 a 1000 existem "+cont+" numeros primos");
        
        
        
    }
}
    


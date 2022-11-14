package Lacos;
import javax.swing.JOptionPane;


public class questao_26 {
    public static void main(String[] args) {
        int numero;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com numeros \n -1 Finaliza a repetição"));
            if(numero<=5){
            if((numero==2)||(numero==3)||(numero==5)){
             JOptionPane.showMessageDialog(null, "Então é primo ");
            }  
            else {
                JOptionPane.showMessageDialog(null, "Não é primo ");
            }   
            }
            else if(numero>5){
            if((numero%2>=1)&&(numero%3>=1)&&(numero%5>=1)){
                JOptionPane.showMessageDialog(null, "Então é primo");
            }
            else {
                JOptionPane.showMessageDialog(null, "Não é primo");
            }    
            }
            
         }while(numero!=-1);
    }


}
   
   
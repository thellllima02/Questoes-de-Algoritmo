package javaapplication40;
import javax.swing.JOptionPane;
public class JavaApplication40 {
    
    public static double single (int x){
        double resP;
        resP = 80*x;
        return resP;
    }
    public static double duplos(int x){
        double resP;
        resP = 100*x;
        return resP;
    }
    public static double desconto (double diaria){
        double resP;
        resP = diaria-(diaria/100)*10;
        return resP;
    }

   
    public static void main(String[] args) {
        int quarto,dias,single,duplos;
        
        quarto = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o quarto que voce si hospedou ? \n\nSingle = 1  \nDuplos = 2   "));
        dias = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos dias ficou "));
        
        if((quarto==1)&&(dias<=3)&&(dias>=0)){
            single(dias);
            JOptionPane.showMessageDialog(null, "Valor a pagar é R$"+single(dias));
        }
        else if ((quarto==1)&&(dias>3)){
            desconto(single(dias));
            JOptionPane.showMessageDialog(null, "Desconto de 10% R$"+desconto(single(dias)));
                    }
        else if((quarto==2)&&(dias<=3)&&(dias>=0)){
            duplos(dias);
            JOptionPane.showMessageDialog(null, " Valor a pagar é R$"+duplos(dias));
        }
        else if ((quarto==2)&&(dias>3)){
            desconto(duplos(dias));
            JOptionPane.showMessageDialog(null, "Desconto de 10% R$"+desconto(duplos(dias)));
                    }
        else {
            JOptionPane.showMessageDialog(null, " Valores incorretos ");
        }
       
    }
    
}

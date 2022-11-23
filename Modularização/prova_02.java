package Modularização;
import javax.swing.JOptionPane;
public class prova_02 {

    public static double single(double x){
        double resP;
        resP = 80*x;
        return resP;
    }
    public static double duplos (double x){
        double resP;
        resP = 100*x;
        return resP;
    }
    public static double triplos(double x){
        double resP;
        resP = 120*x;
        return resP;
    }



    public static void main(String[] args) {
        int quarto,dias;
        
        quarto = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual o quarto que voce si hospedou ? "
                + "\n Single = 1 \n Duplos = 2 \n Tripos = 3"));
        dias = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos dias vc ficou ?"));
        
        if(quarto==1){
            single(dias);
            JOptionPane.showMessageDialog(null, " Valor a pagar é R$"+single(dias));
        }
        else if(quarto==2){
            duplos(dias);
            JOptionPane.showMessageDialog(null, " Valor a pagar é R$"+duplos(dias));
        }
        else if(quarto==3){
            triplos(dias);
            JOptionPane.showMessageDialog(null, " Valor a pagar é R$"+triplos(dias));
        }
        else {
            JOptionPane.showMessageDialog(null, " Valores nao encontrado");
        }

    }
    
}
//02 - Crie um algoritmo para calcular as contas de hospedes de uma pousada sabendo-se que quartos single tem diaria de 80,00
// quartos dublos 100,00 e tripos 120,00. O algoritmo deve determinar o valor a ser pago de acordo com a quantidade de dias e 
// o valor da diaria do quarto ( utilize modularização na implementação).
    


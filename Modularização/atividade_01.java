package Modularização;
import javax.swing.JOptionPane;
public class atividade_01 {
    
public static double primeiro( double a){
    double resP;
    resP = a;
    return resP;
}
public static double segundo( double b){
    double resP;
    resP = b-(b/100 *7.5);
    return resP;
}
public static double terceiro( double c){
    double resP;
    resP = c-(c/100 *11);
    return resP;
}
public static double quarto( double d){
    double resP;
    resP = d-(d/100 *15);
    return resP;
}
public static double quinto( double e){
    double resP;
    resP = e-(e/100 *27.5);
    return resP;
}


public static void main(String[] args) {
   double salario;
   int soma=0;
    
    do {
        soma++;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual o seu salario ??"));
    
    if((salario>=0)&&(salario<=1900)){
        primeiro(salario);
        JOptionPane.showMessageDialog(null, " Seu salario ficara = R$"+primeiro(salario)+" \n Insento");
    }
    else if((salario>1900)&&(salario<=3800)){
        segundo(salario);
        JOptionPane.showMessageDialog(null, " Seu salario ficara = R$"+segundo(salario)+"\n taxa de 7.5%");
    }
    else if((salario>3800)&&(salario<=5600)){
        terceiro(salario);
        JOptionPane.showMessageDialog(null, " Seu salario ficara = R$"+terceiro(salario)+"\n taxa de 11%");
    }
    else if((salario>5600)&&(salario<=7400)){
        quarto(salario);
        JOptionPane.showMessageDialog(null, " Seu salario ficara = R$"+quarto(salario)+"\n taxa de 15%");
    }
    else if((salario>7400)&&(salario<14000)){
        quinto(salario);
        JOptionPane.showMessageDialog(null, " Seu salario ficara = R$"+quinto(salario)+"\n taxa de 27.5%");
    }
    else {
        JOptionPane.showMessageDialog(null, " Salario nao existe ");
    }
    
    }while(soma!=4);

}

    
}

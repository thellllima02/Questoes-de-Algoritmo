package Modularização;

import javax.swing.JOptionPane;

public class atividade_04 {

    public static double mediaA( double a, double b, double c){
        double resM;
        resM = (a+b+c)/3;
        return resM;
       }
       public static double mediaP(int ap, int bp, int cp){
        double resP;
        resP = ((ap*2)+(bp*2)+(cp*3)/7);
        return resP;
       }

       public static void main(String[] args){
        int a1=3,b1=4,c1=5;
        JOptionPane.showMessageDialog(null, " Media aritmetica "+mediaA(a1,b1,c1)+ "\n Media ponderada "+mediaP(a1,b1,c1));
       }
    
}

//Questão :Usando a modularização de algortimo crie um aplicação que calcule a media ponderada e a media aritmetica de tres valores
//Para a ponderada considere os pesos 2, 2 e 3.

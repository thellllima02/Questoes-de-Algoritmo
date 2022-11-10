package Modularização;
import javax.swing.JOptionPane; 
public class atividade_05 {
    public static String nome (String n){
        String n1;
        n1 = n;
        return n1;  
    }

    public static String end (String e){
        String e1;
        e1 = e;
        return e1;
    }

    public static String tel(String t){
        String t1;
        t1 =t;
        return t1;
    }

    public static void main (String[] args){
        String n1,e1,t1;
        n1 = " Bob";
        e1 = " Rua a, 10";
        t1 = " 99999";
        JOptionPane.showMessageDialog(null, "Nome = "+nome(n1)+"\n Endereço = "+end(e1)+"\n Telefone = "+tel(t1));
    }
    
}

package Modularização;
import javax.swing.JOptionPane;
public class atividade_06 {

    public static int quadrado( int lado){
        int areaQ;
        areaQ = lado*lado;
        return areaQ;
    }

    //public static int trianquloRet( int base, int altura){
      //  double areaTri;
        //areaTri = (base*altura)/2;
        //return areaTri;
    //}

    public static void main (String[] args){
        int lado,area;
        

        lado = Integer.parseInt(JOptionPane.showInputDialog(null, " Lado "));

        area = quadrado(lado);

        JOptionPane.showMessageDialog(null, area);
    }
    
}

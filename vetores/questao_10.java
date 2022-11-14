package vetores;

import javax.swing.JOptionPane;

public class questao_10 {

    public static void main(String [] args){

        String letra[] = new String[10];
        String filtro=" ",mostrar = " ";

        for(int w=0; w<letra.length; w++){
            filtro = JOptionPane.showInputDialog(null, "Entre com letras");
            if(filtro.equals("p")||filtro.equals("i")){
                letra[w] = filtro;
                mostrar+=letra[w]+" ";
            }
            
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
}



package Lacos;

import javax.swing.JOptionPane;

public class questao_27 {

    public static void main (String[] args){
        double celsius,fahrenheit,kelvin;

        String mostrar = " ";

        for(celsius=0; celsius<100; celsius++){
            fahrenheit = celsius*1.8+32;
            kelvin = celsius+273.15;
            mostrar+=celsius+"C"+" = "+fahrenheit+" F "+" = "+kelvin+" K "+"\n";
        }

        JOptionPane.showMessageDialog(null, mostrar);


    }
    
}

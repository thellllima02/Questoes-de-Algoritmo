package Modularização;
import javax.swing.JOptionPane;
public class atividade_07 {
    
    //modularização de algoritmos
    public static double circulo(double area){
        double areaCirc;
        areaCirc = 3.14*area*area;
        return areaCirc;
    }
    
    public static void main(String[] args) {
        double area,r;
        
        //variavel 
        area = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o raio do circulo ?"));
       
        //variavel e Metodo 
        r = circulo(area);
         
        JOptionPane.showMessageDialog(null, "Circunferencia do raio é "+ r);
    
    }
    
}
    


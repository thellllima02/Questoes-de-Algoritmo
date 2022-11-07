package quest_22;
import javax.swing.JOptionPane;
public class Quest_22 {

    public static void main(String[] args) {
       int salario=0,filho=0,maior=0,cont=0;
        int sal[] = new int[10];
        int fil[] = new int [10];
        String repeti= " ";
        repeti = JOptionPane.showInputDialog(null, " Deseja começar o relatorio ? (s/n)");
        while (repeti.equals("s")||repeti.equals("sim")){
            //somar salario 
            for(int x=0;x<1;x++){
            sal[x] = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual o salario ?"));
            salario += sal[x];
            // achar o maior valor 
            if(sal[x]>maior){
            maior = sal[x];
            }
            // Guarda o valor dos filhos 
            fil[x] = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos filhos possui ?"));
            filho += fil[x]; }
            //numero de familias ouvidas 
            cont ++;
            repeti = JOptionPane.showInputDialog(null, " Deseja continuar \n? (Sim(s) ou Não(n)");
         }
           JOptionPane.showMessageDialog(null, " A media de salario é \n R$ "+(salario/cont)+" por familia ");
           JOptionPane.showMessageDialog(null, "A media de filhos por familia é \n" +(filho/cont));
           JOptionPane.showMessageDialog(null, "O maior salario é \n R$" +maior); 
    }
    
}

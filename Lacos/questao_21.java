package quest_21;
import javax.swing.JOptionPane;
public class Quest_21 {

    public static void main(String[] args) {
        String letras [] = new String[100];
        int contAB=0,consa=0,excla=0,cont=0,consa2=0;
        String parar = " ";
        do {
            cont++;
            letras[cont] = JOptionPane.showInputDialog(null, " Entre com letras \n!! Uma de cada vez !! ");
            //Contagem das letras A e Z
            if(letras[cont].equals("a")||letras[cont].equals("z")){
                contAB++;
            //Contegem de exclamação
            }
            if(letras[cont].equals("!")){
                excla++;
            }
            //Consoantes
            if(letras[cont].equals("a")||letras[cont].equals("e")||letras[cont].equals("i")||letras[cont].equals("o")||letras[cont].equals("u")){
                consa2++;
            }
            parar = JOptionPane.showInputDialog(null, " Deseja parar ? \n Sim (s) ou Não(nao)");
        }while(parar.equals("n")||parar.equals("nao"));
        consa = cont-consa2;
        JOptionPane.showMessageDialog(null, letras[4]);
        JOptionPane.showMessageDialog(null, "As letras A ou Z apareceram = "+ contAB 
                                           +"\n Foram apresentadas "+cont+" caracteres"
                                           +"\n Entraram "+consa+" consoantes"
                                           +"\n Quantidades de exclamação "+excla);
        
    }
    
}

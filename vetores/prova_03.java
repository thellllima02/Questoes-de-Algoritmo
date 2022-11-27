package vetores;
import javax.swing.JOptionPane;
public class prova_03 {
    public static void main(String[] args) {
        int candidato,filtro=0,contBranco=0,contNulo=0,cont=0,resulBranco,resulNulo;
        String continua = " ",mostrar = " ";
        candidato = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos candidatos coconrrerão a disputa"));
        int vetor[] = new int [candidato];
        do {
            cont++;
            for(int w=0; w<vetor.length; w++){
            filtro = Integer.parseInt(JOptionPane.showInputDialog(null, (w+1)+ "º Candidato "));
            if(filtro==1){
            vetor[w]=filtro;
            break;
            }
            else if(filtro==0){
                    contBranco++;
                    }
            else {
                    contNulo++;
                    }
            }
        continua = JOptionPane.showInputDialog(null, " Deseja continuar ? \n Sim/s ou Não/n");
        }while(continua.equals("s")||continua.equals("sim"));
            for(int e=0; e<vetor.length; e++){
            mostrar+= vetor[e]+ "\n";
            }
        resulBranco = contBranco/candidato;
        resulNulo = contNulo/candidato;
            
        
        JOptionPane.showMessageDialog(null, "Votaram = "+cont+"\n\nQuantidades de votos em branco "+resulBranco+"\nQuantidade de votos nulos "+resulNulo+
                "\nDemais candidatos em ordem\n"+mostrar);
        //area de dados, prova de mesa. Saber os parametros. Apagar depois 
        JOptionPane.showMessageDialog(null, "contador branco "+contBranco +"numeros de candidato"+candidato+" resultado querido "+resulBranco);
        JOptionPane.showMessageDialog(null, "contador nulo "+contNulo+"numeros de candidato"+candidato+" resultado querido "+resulNulo);
        

    }
    
}
//03 - Uma associação de comerciantes deseja construir uma aplicativo para informatizar seu processo
// eleitoral para presidente. Sabe-se que associaçao permite qualquer quantidade de candidato a presindete
//Construa um algoritmo para informatizar  o processo de seguinte forma 
//a) contabilizar votos em cada candidato
//b) contabilizar votos brancos e nulos 
//c) apresentar o vencedor atraves de quantidade de votos

//Obs: A associação possui 100 menbros.
    


package Lacos;
import javax.swing.JOptionPane;
public class questao_24 {

    public static void main(String[] args) {
        int aluno,curso,ingresso,semestre,ano,repeti=0,contAlun=0,cont=0,contVest=0,contTran=0,contEne=0,contSup=0;
        double maior=0,menor=0,soma=0,resul,contLetra=0,contMate=0,contBiol=0;
        //double resulLe,resulMa,resulBi,cont2=0;

        double cr[] = new double [20];
        do{
            //quantidade de alunos matriculados ao todo
            cont++;
            //cont2++;
            //entrada de informações
            aluno = Integer.parseInt(JOptionPane.showInputDialog(null, " Numero do aluno "));
            curso = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual o curso ?? \n 1 - Letras \n 2 - Matemática \n 3 - Biologia "));
            ingresso = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual foi a forma de vc entrou ? \n 1 - Vestibular \n 2 - Transferência \n 3 - ENEM "));
            semestre = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual o semestre que o aluno ingressou ? \n 1 - 1º Semestre \n 2 - 2º Semestre "));
            ano = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual o ano do ingresso ? \n Ex: Ano 2010 = 10 "));
            cr[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual a nota do CR ? "));
            //CR do ano atual
            if(ano==22){
                
                //contCr++;
            //o maior valor que entrou
            if(cr[cont]>maior){
                maior = cr[cont];
            }
            //o menor valor que entrou
            if(cr[cont]<cr[0]){
                menor = cr[cont];
            }
            //Media superior a 7.5
            if(cr[cont]>=7.5){
                    contSup++;
            }
            //A soma das medias do ano atual
            soma +=cr[cont];
            }
            //Forma de ingresso do aluno
            switch(ingresso){
                case 1:
                    ingresso = 1;
                    contVest++;
                    break;
                case 2:
                    ingresso = 2;
                    contTran++;
                    break;
                case 3:
                    ingresso = 3;
                    contEne++;
                    break;
            }
           //Frilto para saber a quantidade de alunos em cada curso
               switch(curso){
                   case 1:
                       curso = 1;
                       contLetra++;
                       break;
                   case 2:
                       curso = 2;
                       contMate++;
                       break;
                   case 3:
                       curso = 3;
                       contBiol++;
               }
               //ano atual e CR igual ou superio a 7.5
               if((ano==22)&&(cr[cont]>=7.5)){
                  contAlun++; 
               }
            repeti = Integer.parseInt(JOptionPane.showInputDialog(null, " Deseja continuar ??\n Sim(4)/Não(-1)"));
        }while(repeti!=-1);
        resul = soma / cont;
        //Parece que esta errado, arrumar 
        //resulLe = (cont2/100)*(contLetra*100);
        //resulMa = (cont2/100)*(contMate*100);
        //resulBi = (cont2/100)*(contBiol*100);
        //JOptionPane.showMessageDialog(null, contLetra+" "+contMate+" "+contBiol);
        JOptionPane.showMessageDialog(null,
         "Foram matriculados "+cont+" ao todo"+
         "\n\nEm letras foram matriculados "+contLetra+
        "\nEm Matemática foram "+contMate+ 
        "\n Em Biologia foram matriculados "+contBiol+
        "\n\nAlunos que entraram no ano atual de 2022 com o CR superior a 7.5% = "+contAlun+
        "\n \n A maior CR foi "+maior+
        " \n A menor CR foi "+menor+
        "\n \n O CR medio do ano atual foi "+resul+
        "\n \nForam "+contVest+" que ingressou pelo vestibular"+
         "\nForam "+contTran+" que ingressou pela transferência"+
         "\nForam "+contEne+" que ingressou pelo ENEM" +
         "\n \n Foram "+contSup+" alunos com CR superior ou igual a 7.5" );
      }

    
}

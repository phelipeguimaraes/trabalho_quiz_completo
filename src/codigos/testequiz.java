package codigos;

import java.util.Scanner;

public class testequiz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        cabecalho cabecalho0 = new cabecalho();
        System.out.println("----------------------------------------------------------------------------------------");

        cabecalho0.faculdade = "Faculdade: UNIFAN";
        cabecalho0.nome = "Nome: Phelipe Vieira Guimarães";
        cabecalho0.materia = "Matéria: Algoritmo e Programação II";
        cabecalho0.professor = "Professor: Brenno Pimenta";
        cabecalho0.escrevaCabecalho();
        System.out.println("-----------------------------------------------------------------------------------------");


        int acertos = 0;

        questoes questoes1 = new questoes();

        questoes1.pergunta = "1) Qual a capital do Tocantins?";
        questoes1.opcaoA = "A) Salvador";
        questoes1.opcaoB = "B) Palmas";
        questoes1.opcaoC = "C) Goiânia";
        questoes1.opcaoD = "D) São Paulo";
        questoes1.opcaoE = "E) Brasília";
        questoes1.escrevaQuestoes();
        questoes1.correta = "b";
        System.out.println("Digite a resposta correta");
        String resposta = leia.nextLine();
        if (resposta.equals(questoes1.iscorreta(resposta))) {
        } else {
        }
        if (resposta.equals(questoes1.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes2 = new questoes();

        questoes2.pergunta = "2) Qual a capital de Goiás?";
        questoes2.opcaoA = "A) Salvador";
        questoes2.opcaoB = "B) Palmas";
        questoes2.opcaoC = "C) Goiânia";
        questoes2.opcaoD = "D) São Paulo";
        questoes2.opcaoE = "E) Brasília";
        questoes2.escrevaQuestoes();
        questoes2.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta2 = leia.nextLine();
        if (resposta.equals(questoes2.iscorreta(resposta2))) {
        } else {
        }
        if (resposta.equals(questoes2.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");


        questoes questoes3 = new questoes();

        questoes3.pergunta = "3) Qual a capital de Distrito Federal?";
        questoes3.opcaoA = "A) Salvador";
        questoes3.opcaoB = "B) Palmas";
        questoes3.opcaoC = "C) Goiânia";
        questoes3.opcaoD = "D) São Paulo";
        questoes3.opcaoE = "E) Brasília";
        questoes3.escrevaQuestoes();
        questoes3.correta = "e";
        System.out.println("Digite a resposta correta");
        String resposta3 = leia.nextLine();
        if (resposta.equals(questoes3.iscorreta(resposta3))) {
        } else {
        }
        if (resposta.equals(questoes3.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes4 = new questoes();

        questoes4.pergunta = "4) Qual a capital da Bahia?";
        questoes4.opcaoA = "A) Salvador";
        questoes4.opcaoB = "B) Palmas";
        questoes4.opcaoC = "C) Goiânia";
        questoes4.opcaoD = "D) São Paulo";
        questoes4.opcaoE = "E) Brasília";
        questoes4.escrevaQuestoes();
        questoes4.correta = "a";
        System.out.println("Digite a resposta correta");
        String resposta4 = leia.nextLine();
        if (resposta.equals(questoes4.iscorreta(resposta4))) {
        } else {
        }
        if (resposta.equals(questoes4.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes5 = new questoes();

        questoes5.pergunta = "5) Qual a capital de São Paulo";
        questoes5.opcaoA = "A) Salvador";
        questoes5.opcaoB = "B) Palmas";
        questoes5.opcaoC = "C) Goiânia";
        questoes5.opcaoD = "D) São Paulo";
        questoes5.opcaoE = "E) Brasília";
        questoes5.escrevaQuestoes();
        questoes5.correta = "d";
        System.out.println("Digite a resposta correta");
        String resposta5 = leia.nextLine();
        if (resposta.equals(questoes5.iscorreta(resposta5))) {
        } else {
        }
        if (resposta.equals(questoes5.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes6 = new questoes();

        questoes6.pergunta = "6) Qual a capital de Alagoas?";
        questoes6.opcaoA = "A) Rio de Janeiro";
        questoes6.opcaoB = "B) Maceió";
        questoes6.opcaoC = "C) Rio Branco";
        questoes6.opcaoD = "D) Macapá";
        questoes6.opcaoE = "E) Manaus";
        questoes6.escrevaQuestoes();
        questoes6.correta = "b";
        System.out.println("Digite a resposta correta");
        String resposta6 = leia.nextLine();
        if (resposta.equals(questoes6.iscorreta(resposta6))) {
        } else {
        }
        if (resposta.equals(questoes6.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes7 = new questoes();

        questoes7.pergunta = "7) Qual a capital de Amazonas?";
        questoes7.opcaoA = "A) Rio de Janeiro";
        questoes7.opcaoB = "B) Maceió";
        questoes7.opcaoC = "C) Rio Branco";
        questoes7.opcaoD = "D) Macapá";
        questoes7.opcaoE = "E) Manaus";
        questoes7.escrevaQuestoes();
        questoes7.correta = "e";
        System.out.println("Digite a resposta correta");
        String resposta7 = leia.nextLine();
        if (resposta.equals(questoes7.iscorreta(resposta7))) {
        } else {
        }
        if (resposta.equals(questoes7.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes8 = new questoes();

        questoes8.pergunta = "8) Qual a capital de Amapá?";
        questoes8.opcaoA = "A) Rio de Janeiro";
        questoes8.opcaoB = "B) Maceió";
        questoes8.opcaoC = "C) Rio Branco";
        questoes8.opcaoD = "D) Macapá";
        questoes8.opcaoE = "E) Manaus";
        questoes8.escrevaQuestoes();
        questoes8.correta = "d";
        System.out.println("Digite a resposta correta");
        String resposta8 = leia.nextLine();
        if (resposta.equals(questoes8.iscorreta(resposta8))) {
        } else {
        }
        if (resposta.equals(questoes8.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes9 = new questoes();

        questoes9.pergunta = "9) Qual a capital do Acre?";
        questoes9.opcaoA = "A) Rio de Janeiro";
        questoes9.opcaoB = "B) Maceió";
        questoes9.opcaoC = "C) Rio Branco";
        questoes9.opcaoD = "D) Macapá";
        questoes9.opcaoE = "E) Manaus";
        questoes9.escrevaQuestoes();
        questoes9.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta9 = leia.nextLine();
        if (resposta.equals(questoes9.iscorreta(resposta9))) {
        } else {
        }
        if (resposta.equals(questoes9.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes10 = new questoes();

        questoes10.pergunta = "10) Qual a capital do Rio de Janeiro?";
        questoes10.opcaoA = "A) Rio de Janeiro";
        questoes10.opcaoB = "B) Maceió";
        questoes10.opcaoC = "C) Rio Branco";
        questoes10.opcaoD = "D) Macapá";
        questoes10.opcaoE = "E) Manaus";
        questoes10.escrevaQuestoes();
        questoes10.correta = "a";
        System.out.println("Digite a resposta correta");
        String resposta10 = leia.nextLine();
        if (resposta.equals(questoes10.iscorreta(resposta10))) {
        } else {
        }
        if (resposta.equals(questoes10.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes11 = new questoes();

        questoes11.pergunta = "11) Qual a capital de Minas Gerais?";
        questoes11.opcaoA = "A) Porto Alegre";
        questoes11.opcaoB = "B) João Pessoa";
        questoes11.opcaoC = "C) Curitiba";
        questoes11.opcaoD = "D) Belém";
        questoes11.opcaoE = "E) Belo Horizonte";
        questoes11.escrevaQuestoes();
        questoes11.correta = "e";
        System.out.println("Digite a resposta correta");
        String resposta11 = leia.nextLine();
        if (resposta.equals(questoes11.iscorreta(resposta11))) {
        } else {
        }
        if (resposta.equals(questoes11.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes12 = new questoes();

        questoes12.pergunta = "12) Qual a capital de Paraíba?";
        questoes12.opcaoA = "A) Rio de Janeiro";
        questoes12.opcaoB = "B) João Pessoa";
        questoes12.opcaoC = "C) Rio Branco";
        questoes12.opcaoD = "D) Macapá";
        questoes12.opcaoE = "E) Manaus";
        questoes12.escrevaQuestoes();
        questoes12.correta = "b";
        System.out.println("Digite a resposta correta");
        String resposta12 = leia.nextLine();
        if (resposta.equals(questoes12.iscorreta(resposta12))) {
        } else {
        }
        if (resposta.equals(questoes12.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes13 = new questoes();

        questoes13.pergunta = "13) Qual a capital do Rio Grande do Sul?";
        questoes13.opcaoA = "A) Porto Alegre";
        questoes13.opcaoB = "B) João Pessoa";
        questoes13.opcaoC = "C) Curitiba";
        questoes13.opcaoD = "D) Belém";
        questoes13.opcaoE = "E) Belo Horizonte";
        questoes13.escrevaQuestoes();
        questoes13.correta = "a";
        System.out.println("Digite a resposta correta");
        String resposta13 = leia.nextLine();
        if (resposta.equals(questoes13.iscorreta(resposta13))) {
        } else {
        }
        if (resposta.equals(questoes13.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes14 = new questoes();

        questoes14.pergunta = "11) Qual a capital de Paraná?";
        questoes14.opcaoA = "A) Porto Alegre";
        questoes14.opcaoB = "B) João Pessoa";
        questoes14.opcaoC = "C) Curitiba";
        questoes14.opcaoD = "D) Belém";
        questoes14.opcaoE = "E) Belo Horizonte";
        questoes14.escrevaQuestoes();
        questoes14.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta14 = leia.nextLine();
        if (resposta.equals(questoes14.iscorreta(resposta14))) {
        } else {
        }
        if (resposta.equals(questoes14.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes15 = new questoes();

        questoes15.pergunta = "15) Qual a capital do Pará?";
        questoes15.opcaoA = "A) Porto Alegre";
        questoes15.opcaoB = "B) João Pessoa";
        questoes15.opcaoC = "C) Curitiba";
        questoes15.opcaoD = "D) Belém";
        questoes15.opcaoE = "E) Belo Horizonte";
        questoes15.escrevaQuestoes();
        questoes15.correta = "d";
        System.out.println("Digite a resposta correta");
        String resposta15 = leia.nextLine();
        if (resposta.equals(questoes15.iscorreta(resposta15))) {
        } else {
        }
        if (resposta.equals(questoes15.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}

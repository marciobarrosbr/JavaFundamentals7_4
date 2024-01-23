package cads;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import cads.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String resp = "y";
        String resp_ = "y";
        int tempId;
        String tempDisciplina;
        String tempGraduacao;
        int tempIngresso;
        double[] tempNotas;
        tempNotas = new double[2];
        Scanner in = new Scanner(System.in);

        Aluno aluno1 = new Aluno("fulano","de","tal");
        do {
            System.out.println("Digite as informaçoes do aluno");
            System.out.print("id do aluno: ");
            tempId = in.nextInt();
            aluno1.setIdAluno(tempId);
            System.out.print("Disciplina: ");
            tempDisciplina = in.next();
            aluno1.setDisciplina(tempDisciplina);
            System.out.print("Graduação: ");
            tempGraduacao = in.next();
            aluno1.setGraduacao(tempGraduacao);
            System.out.print("Ano ingresso: ");
            tempIngresso = in.nextInt();
            aluno1.setAnoIngresso(tempIngresso);

            for(int i=0; i<tempNotas.length; i++){
                System.out.print("digite a "+"o"+i+" nota:");
                tempNotas[i] = in.nextDouble();
            }
            aluno1.setNotas(tempNotas);
            System.out.print("id do aluno: ");
            System.out.println("Digite 'y' para continuar ou 'n' para sair");
            resp = in.next();
        }while (resp.equals(resp_));
        System.out.println(aluno1);
    }
}
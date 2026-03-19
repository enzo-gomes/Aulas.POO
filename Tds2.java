package br.edu.ifma;

import java.util.Scanner;

public class Tds2 {
public static void main(String[] args){
    Scanner entradaDados = new Scanner(System.in);
    System.out.println("Digite a nota do aluno: ");
    int notaAluno = entradaDados.nextInt();
    notaAluno++;

    String nomeAluno = "Joaozinho";
    System.out.println("Nota " + notaAluno +", Nome aluno: " + nomeAluno);

}

}


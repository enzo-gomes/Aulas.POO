package br.edu.ifma;
import java.util.Scanner;
public class Atividade {
    public static void main(String[] args){
        int idade;
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = entradaDados.nextInt();
        System.out.println("Voce tem "+ idade +" anos de idade!");
        if (idade >= 18){
        System.out.println("E é maior de idade.");
    }else
            System.out.println("E é menor de idade!");
        }
}

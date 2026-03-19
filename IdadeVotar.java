package br.edu.ifma;
import java.util.Scanner;
    public class IdadeVotar {
        public static void main(String[] args) {
            Scanner entradaDados = new Scanner(System.in);

            System.out.println("Digite o ano atual: ");
            int anoAtual = entradaDados.nextInt();

            System.out.print("Digite o ano de nascimento: ");
            int anoNascimento = entradaDados.nextInt();

            int idade = anoAtual - anoNascimento;

            if (idade >= 16) {
                System.out.println("Idade: " + idade);
                System.out.println("Você tem idade para votar.");
            } else {
                System.out.println("Você não tem idade para votar.");
            }

        }
    }


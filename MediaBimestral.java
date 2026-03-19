package br.edu.ifma;
import java.util.Scanner;
public class MediaBimestral {
    public static void main(String[] args){
        float n1, n2, n3, n4, media;
        int opcao;
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Olá, deseja saber sua media? (1 - SIM 2 - NÃO)");
        opcao = entradaDados.nextInt();
        if (opcao == 1){
            System.out.println("Digite a primeira nota: ");
            n1 = entradaDados.nextFloat();
            System.out.println("Digite a segunda nota: ");
            n2 = entradaDados.nextFloat();
            System.out.println("Digite a terceira nota: ");
            n3 = entradaDados.nextFloat();
            System.out.println("Digite a quarta nota: ");
            n4 = entradaDados.nextFloat();

            media = (n1 + n2 + n3 + n4) / 4;
            System.out.println("Sua media final é: "+ media);
            System.out.println("----------------------------");
            if (media >= 7){
                System.out.println("Parabéns, você foi aprovado!");
            }else if(media < 7){
                System.out.println("Você foi reprovado.");
            }

        }else{
            System.out.println("Opção Inválida.");
        }
    }
}

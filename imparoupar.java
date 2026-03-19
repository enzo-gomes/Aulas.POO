package br.edu.ifma;
import java.util.Scanner;
public class imparoupar {
    public static void main(String[] args){
        int numero;
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = entradaDados.nextInt();

        if(numero % 2 == 0){
            System.out.println("O numero é PAR.");
        }else{
            System.out.println("O numero é ÍMPAR.");
        }

    }
}

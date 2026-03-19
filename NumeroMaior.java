package br.edu.ifma;
import java.util.Scanner;
public class NumeroMaior {
    public static void main (String[] args){
        Scanner entradaDados = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite um número: ");
        n1 = entradaDados.nextInt();
        System.out.println("Digite outro número: ");
        n2 = entradaDados.nextInt();
        if( n1 > n2){
            System.out.println("O numero maior é o:"+ n1);
        } else if (n2 > n1) {
            System.out.println("O numero maior é o: " + n2);

        } else{
            System.out.println("Os numeros sao iguais.");
        }
    }
}

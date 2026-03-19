package br.edu.ifma;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);
        int valorSaldo;
        int TAXA_REAJUSTE = 10;
        System.out.println("Digite o saldo: ");
        valorSaldo = entradaDados.nextInt();
        int reajuste = valorSaldo * TAXA_REAJUSTE / 100;

        valorSaldo  += reajuste;
        System.out.println("Saldo após reajuste: " + valorSaldo);

    }
}

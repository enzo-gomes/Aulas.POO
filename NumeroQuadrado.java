package br.edu.ifma;
import java.util.Scanner;

public class NumeroQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            double quadrado = numero * numero;
            System.out.println("O quadrado do número é: " + quadrado);
        } else {
            System.out.println("O número não é positivo.");
        }

    }
}
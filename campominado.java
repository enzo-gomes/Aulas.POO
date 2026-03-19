import java.util.Scanner;

public class campominado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char jogador = 'X';
        boolean jogo = true;

        while (jogo) {

            // Mostrar tabuleiro
            System.out.println("\nTabuleiro:");
            for (int i = 0; i < 3; i++) {
                System.out.println(tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
                if (i < 2) System.out.println("---------");
            }

            // Jogada
            System.out.println("Jogador " + jogador);
            System.out.print("Linha (0-2): ");
            int linha = sc.nextInt();

            System.out.print("Coluna (0-2): ");
            int coluna = sc.nextInt();

            if (tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogador;
            } else {
                System.out.println("Posição ocupada! Tente novamente.");
                continue;
            }

            // Verificar vitória
            if (
                    (tabuleiro[0][0] == jogador && tabuleiro[0][1] == jogador && tabuleiro[0][2] == jogador) ||
                            (tabuleiro[1][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[1][2] == jogador) ||
                            (tabuleiro[2][0] == jogador && tabuleiro[2][1] == jogador && tabuleiro[2][2] == jogador) ||
                            (tabuleiro[0][0] == jogador && tabuleiro[1][0] == jogador && tabuleiro[2][0] == jogador) ||
                            (tabuleiro[0][1] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][1] == jogador) ||
                            (tabuleiro[0][2] == jogador && tabuleiro[1][2] == jogador && tabuleiro[2][2] == jogador) ||
                            (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)
            ) {
                System.out.println("🎉 Jogador " + jogador + " venceu!");
                jogo = false;
            }

            // Trocar jogador
            if (jogador == 'X') {
                jogador = 'O';
            } else {
                jogador = 'X';
            }
        }

        sc.close();
    }
}
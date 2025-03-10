
    import java.util.Random;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Escolha: 1 - Pedra, 2 - Papel, 3 - Tesoura, 0 - Sair");
            int jogador = scanner.nextInt();

            if (jogador == 0) {
                break; // Sai do loop se o jogador escolher sair
            }

            if (jogador < 1 || jogador > 3) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue; // Volta ao início do loop para uma nova escolha
            }

            int computador = random.nextInt(3) + 1; // Cria uma escolha aleatória para o computador

            System.out.println("Jogador: " + Texto(jogador));
            System.out.println("Computador: " + Texto(computador));

            int resultado = vencedor(jogador, computador);
            resultado(resultado);
        }

        System.out.println("Fim de jogo.");
        scanner.close();
    }

    public static String Texto(int escolha) {
        switch (escolha) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Inválido";
        }
    }

    public static int vencedor(int jogador, int computador) {
        if (jogador == computador) {
            return 0; // Empate
        } else if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
            return 1; // Jogador vence
        } else {
            return 2; // Computador vence
        }
    }

    public static void resultado(int resultado) {
        switch (resultado) {
            case 0:
                System.out.println("Empate!");
                break;
            case 1:
                System.out.println("Jogador vence!");
                break;
            case 2:
                System.out.println("Computador vence!");
                break;
        }
    }
}

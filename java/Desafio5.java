import java.util.Random;
import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(10) + 1; // Gera um número aleatório entre 1 e 10
        int tentativas = 0;
        int palpite;
        int maxTentativas = 4;

        System.out.println("Adivinhe o número que estou pensando (entre 1 e 10).");
        System.out.println("Você tem " + maxTentativas + " tentativas.");

        while (tentativas < maxTentativas) {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numero) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                break; // Sai do loop quando o jogador acerta
            } else if (palpite < numero) {
                System.out.println("Muito baixo. Tente novamente.");
            } else {
                System.out.println("Muito alto. Tente novamente.");
            }

            if (tentativas == maxTentativas) {
                System.out.println("Você não conseguiu adivinhar o número. O número correto era: " + numero);
            }
        }

        scanner.close();
    }
}

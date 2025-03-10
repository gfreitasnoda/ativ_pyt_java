import java.util.Random;
import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(5) + 1; // Gera um número aleatório entre 1 e 5
        int tentativas = 0;
        int palpite;

        System.out.println("Adivinhe o número que estou pensando (entre 1 e 5):");

        while (true) {
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
        }

        scanner.close();
    }
}


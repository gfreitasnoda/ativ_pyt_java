import java.util.Scanner;

public class Desafio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da PA: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        int soma = 0;

        System.out.println("Os 10 primeiros elementos da PA são:");
        for (int i = 0; i < 10; i++) {
            int termo = primeiro+ i * razao;
            System.out.print(termo + " ");
            soma += termo;
        }

        System.out.println("\nA soma dos elementos da PA é: " + soma);

        scanner.close();
    }
}
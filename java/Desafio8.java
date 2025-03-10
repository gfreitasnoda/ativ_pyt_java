import java.util.Arrays;
import java.util.Random;

public class Desafio8 {

    public static void main(String[] args) {
        int[] vetor = new int[20];
        Random random = new Random();

        // Preenche o vetor com números aleatórios entre 0 e 99
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        // Exibe os números gerados
        System.out.println("Números gerados:");
        System.out.println(Arrays.toString(vetor));

        // Ordena o vetor em ordem crescente
        Arrays.sort(vetor);

        // Exibe os números ordenados
        System.out.println("\nNúmeros ordenados:");
        System.out.println(Arrays.toString(vetor));
    }
}
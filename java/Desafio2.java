import java.util.Scanner;

public class Desafio2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Identificação do tipo de triângulo ---");
        System.out.print("Lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.print("Lado 2: ");
        int lado2 = scanner.nextInt();

        System.out.print("Lado 3: ");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo EQUILÁTERO");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo ISÓSCELES");
        } else {
            System.out.println("Triângulo ESCALENO");
        }

        scanner.close();
    }
}


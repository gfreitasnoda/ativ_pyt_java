import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro segmento: ");
        double segmento1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo segmento: ");
        double segmento2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro segmento: ");
        double segmento3 = scanner.nextDouble();

        if (verificaTriangulo(segmento1, segmento2, segmento3)) {
            System.out.println("Os segmentos podem formar um triângulo.");
        } else {
            System.out.println("Os segmentos não podem formar um triângulo.");
        }

        scanner.close();
    }

    public static boolean verificaTriangulo(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }
}
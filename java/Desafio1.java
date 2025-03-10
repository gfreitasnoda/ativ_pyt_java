import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de cigarros fumados por dia: ");
        int dia = scanner.nextInt();

        System.out.print("Anos fumando: ");
        int anos = scanner.nextInt();

        int cigarros = dia * 365 * anos; // Calcula o total de cigarros fumados
        int minutos = cigarros * 10; // Calcula o total de minutos perdidos
        int dias = minutos / (24 * 60); // Calcula o total de dias perdidos

        System.out.println("Total de dias de vida perdidos: " + dias);

        scanner.close();
    }
}
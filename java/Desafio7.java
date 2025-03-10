public class Desafio7 {

    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;

        System.out.println("Os 10 primeiros elementos da Sequência de Fibonacci são:");

        for (int i = 0; i < 10; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
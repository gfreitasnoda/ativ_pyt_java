public class Desafio9 {

    public static void main(String[] args) {
        Fibonacci(5);
        Fibonacci(9);
    }

    public static void Fibonacci(int quantidadeTermos) {
        int primeiro = 0;
        int segundo = 1;

        System.out.print("1 >> "); // Imprime o primeiro termo (1)

        for (int i = 1; i < quantidadeTermos; i++) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " >> ");
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println("FIM");
    }
}
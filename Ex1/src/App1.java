import java.util.Scanner;

public class App1 {
    public static void main(String[] args) { // Corrigido: "Main" -> "main"
        Scanner entrada = new Scanner(System.in);
        int qntprod = 10;
        int produtos[] = new int[qntprod];

        System.out.println("Digite os preços dos produtos: ");
        for (int i = 0; i < qntprod; i++) {
            System.out.printf("Preço do Produto %d: R$ ", i + 1);
            produtos[i] = entrada.nextInt(); 
        }

        System.out.println("Digite o Desconto: ");
        double desconto = entrada.nextDouble();

        System.out.println("Novo preço:");
        for (int i = 0; i < qntprod; i++) {
            double novoPreco = produtos[i] - (produtos[i] * desconto / 100);
            System.out.printf("Produto %d: R$ %.2f%n", i + 1, novoPreco);
        }
        
        entrada.close(); 
    }
}
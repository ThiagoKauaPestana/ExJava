import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);  

        System.out.print("Custo de producao: ");
        double custo = entrada.nextDouble();

        System.out.print("Preco do ingresso: ");
        double preco_ingresso = entrada.nextDouble();
        // cobrir gastos
        double total1 = (custo / preco_ingresso);
        System.out.printf("Quantidade necessaria para pagar os custos: %.2f\n", total1);
        // Obter lucro
        double total2 = (custo * 1.23) / preco_ingresso;
        System.out.printf("Quantidade necessaria para obter lucro de 23%%: %.2f", total2);

        entrada.close();
    }
}

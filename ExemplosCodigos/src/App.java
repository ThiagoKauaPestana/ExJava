// EX 4 e 5 LISTA 1

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        String quebra_linha = "e";

        System.out.print("Digite o dia da semana: ");
        String dia_semana = entrada.nextLine();

        System.out.print("Digite os minutos: ");
        int valor1 = entrada.nextInt();

        System.out.print("Digite quantos porcento voce ja aprendeu de java: ");
        double valor2 = entrada.nextDouble();
        
        
        
       

        System.out.printf("Hoje e %s. Faz %e minutos que comecei a aprender java %s\nJa entendi quase %.1f%% de tudo que foi discutido ate aqui",
         dia_semana, (double) valor1, quebra_linha, valor2 );
        entrada.close();

    }
}

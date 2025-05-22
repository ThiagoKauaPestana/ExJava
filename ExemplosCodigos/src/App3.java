// EX 7 b) LISTA 1

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = entrada.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int c = entrada.nextInt();

        int soma = (a + b + c);
        int total = soma * soma;
        System.out.print(total);
        entrada.close();
    }
}

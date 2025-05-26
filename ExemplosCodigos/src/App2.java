// EX 7 a) LISTA 1

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = entrada.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int c = entrada.nextInt();
        int total = (a * a) + (b * b) + (c * c);

        System.out.printf("A Soma dos Quadrados dos tres numeros e: %d", total);
        entrada.close();

    }
}

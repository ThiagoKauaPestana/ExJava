import java.util.Scanner;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria Conta = new ContaBancaria(10420686,  "Thiago", 1000);
        Scanner entrada = new Scanner(System.in);

        int op;
        double valor;

        do{

            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Exibir Saldo");
            System.out.println("4- Sair");
            System.out.print("\nDigite a Opcao que quer realizar: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Digite o valor: ");
                    valor = entrada.nextDouble();
                    Conta.depositar(valor);
                    System.out.printf("Seu Saldo: %d\n", Conta.saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor: ");
                    valor = entrada.nextDouble();
                    Conta.sacar(valor);
                    System.out.printf("Seu Saldo: %d\n", Conta.saldo);
                    break;
                case 3:
                    Conta.exibirSaldo();
                    System.out.printf("Seu saldo: %.2f\n", Conta.saldo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcao Inexistente");
            }
        } while(op != 4);

        entrada.close();
    }

    
    
}

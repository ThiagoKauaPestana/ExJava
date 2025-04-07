public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("10420686", "Thiago", 1000);

        conta.depositar(600.00);
        conta.sacar(200.00);
        conta.exibirSaldo();
        
        System.out.printf("%s  %s  %.2f\n", conta.numeroConta, conta.titular, conta.saldo);
    }
}

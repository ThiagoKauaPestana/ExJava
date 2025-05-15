public class TestaConta{
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Thiago", 100);
        System.out.printf("Saldo CB: %.2f\n", cb.getSaldo());
        cb.sacar(200);
        System.out.printf("Saldo CB: %.2f\n", cb.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("Kaua", 2000, 0.05);
        System.out.printf("Saldo CP: %.2f\n", cp.getSaldo());
        cp.sacar(200);
        cp.aplicarRendimento();
        System.out.printf("Saldo CP: %.2f\n", cp.getSaldo());

        ContaCorrente cc = new ContaCorrente("Pestana", 1000, 500);
        System.out.printf("Saldo CC: %.2f\n", cc.getSaldo());
        cc.sacar(1200);
        System.out.printf("Saldo CC: %.2f\n", cc.getSaldo());
    }
}
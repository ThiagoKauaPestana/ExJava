public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;
    
    public ContaPoupanca(String titular, double saldoInicial, double taxa){
        super(titular, saldoInicial);
        this.taxaRendimento = taxa;
    }

    public void aplicarRendimento() {
        saldo = saldo + (saldo * taxaRendimento);
    }
}
public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);

        this.limiteChequeEspecial = limite;
    }

    public boolean sacar(double valor){
        if (valor <= saldo + limiteChequeEspecial){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
}

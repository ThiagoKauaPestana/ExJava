public class ContaBancaria {
    
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;

    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;

        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}

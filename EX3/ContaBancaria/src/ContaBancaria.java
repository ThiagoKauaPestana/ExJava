public class ContaBancaria {
   double numeroConta;
   String titular;
   double saldo;

   public ContaBancaria(double numeroConta, String titular, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

   }

   public double depositar(double valor){
    if (valor > 0 && saldo >= valor) {
        return saldo -= valor;
        

    } else{
        System.out.println("Nao foi possivel, Saldo insuficiente");
    }
    
   }

   public double sacar(double valor){
        return saldo - valor;

   }

   public double exibirSaldo(){
    return saldo;
   }
}

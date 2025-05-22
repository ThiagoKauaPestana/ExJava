public class PessoaFisica extends Contribuinte{
    
    public PessoaFisica(String nome, double renda){
        super(nome, renda);

    }

    @Override
    public double calculaImposto() {
        double renda = getRenda();
        if (renda <= 1500.00) {
            return 0.0;
        }
        else if (renda <= 3000.00) {
            return (renda * 0.075) - 100.00;
        }
        else {
            return (renda * 0.15) - 225.00;

        }
    }
}
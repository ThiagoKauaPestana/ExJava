public class PessoaJuridica extends Contribuinte{

    public PessoaJuridica(String nome, double renda){
        super(nome, renda);

    }

    @Override
    public double calculaImposto() {
        return getRenda() * 0.10;
    }
}
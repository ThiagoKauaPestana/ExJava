public class Contribuinte {
    private String nome;
    private double renda;

    public Contribuinte(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public double calculaImposto(){
        return 0.0;
    }

    public String getNome(){
        return nome;
    }

    public double getRenda(){
        return renda;
    }
}

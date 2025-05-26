public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }


    public double calculaProventos(){
        return salario;
    }

    public String getNome(){
        return nome;
    }

}

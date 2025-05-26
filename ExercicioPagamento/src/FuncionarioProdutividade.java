public class FuncionarioProdutividade extends Funcionario {
    private double valor;
    private double producao;

    public FuncionarioProdutividade(String nome, double salario, double valor, double producao) {
        super(nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    @Override
    public double calculaProventos() {
        return salario + (valor * producao);
    }
}

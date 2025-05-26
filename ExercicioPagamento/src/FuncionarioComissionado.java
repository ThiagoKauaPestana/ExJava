public class FuncionarioComissionado extends Funcionario {
    private double percentual;
    private double totalVenda;

    public FuncionarioComissionado(String nome, double salario, double percentual, double totalVenda) {
        super(nome, salario);
        this.percentual = percentual;
        this.totalVenda = totalVenda;
    }

    @Override
    public double calculaProventos() {
        return salario + (percentual / 100) * totalVenda;
    }
}


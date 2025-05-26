public class TestaFolhaPagamento {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();

        Funcionario f1 = new Funcionario("Carlos", 3000);

        FuncionarioComissionado f2 = new FuncionarioComissionado("Thiago", 2500, 10, 30000);
        FuncionarioProdutividade f3 = new FuncionarioProdutividade("Moises", 2200, 15, 30);

        folha.adicionaFuncionario(f1);
        folha.adicionaFuncionario(f2);
        folha.adicionaFuncionario(f3);

        folha.listaFuncionarios();
    }
}

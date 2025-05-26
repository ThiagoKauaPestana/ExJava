import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Funcionario> funcionarios;

    public FolhaPagamento() {
        funcionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listaFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Proventos: R$ " + f.calculaProventos());
            System.out.println("-----------------------------");
        }
    }
}

import java.util.ArrayList;

public class Contribuintes {
    private ArrayList<Contribuinte> contribuintes;

    public Contribuintes() {
        contribuintes = new ArrayList<>();
    }

    public void adicionaContribuinte(Contribuinte c) {
        contribuintes.add(c);
    }

    public void apresentaContribuintes() {
        String nome;
        double imposto;
        for (Contribuinte c : contribuintes) {
            nome = c.getNome();
            imposto = c.calculaImposto();
            System.out.printf("%-10s | R$ %8.2f%n", nome, imposto);
        }
    }
}
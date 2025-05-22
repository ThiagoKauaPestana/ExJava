public class TestaContribuintes {

    public static void main(String[] args) {
        Contribuintes contribuintes = new Contribuintes();

        PessoaFisica pf = new PessoaFisica("Thiago", 2000);
        Contribuinte pj = new PessoaJuridica("Moises", 10);
        contribuintes.adicionaContribuinte(pf);
        contribuintes.adicionaContribuinte(pj);
        contribuintes.adicionaContribuinte(new PessoaFisica("Kaua", 5000));
        contribuintes.adicionaContribuinte(new PessoaJuridica("Gabriel", 2000));

        contribuintes.apresentaContribuintes();
    }
}
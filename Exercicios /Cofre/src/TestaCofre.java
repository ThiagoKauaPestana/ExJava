public class TestaCofre {
    public static void main(String[] args) {
        Cofre cofre = new Cofre();

        Moeda m1 = new Moeda(1.00, "Dolar");
        Moeda m2 = new Moeda(1.00, "Real");
        Moeda m3= new Moeda(1.00, "Euro");
        Moeda m4 = new Moeda(1.00, "Real");
        Moeda m5 = new Moeda(1.00, "Dolar");

        cofre.adicionar(m1);
        cofre.adicionar(m2);
        cofre.adicionar(m3);
        cofre.adicionar(m4);
        cofre.adicionar(m5);

        System.out.println("Total: " + cofre.calcularTotal());
        System.out.println("Quantidade de moedas de 1 Dolar: " + cofre.contarMoedas(m1) );
        System.out.println("Quantidade de moedas de 1 Real: "+ cofre.contarMoedas(m2) );
        System.out.println("Quantidade de moedas de 1 Euro: "+  cofre.contarMoedas(m3) );
    }
}

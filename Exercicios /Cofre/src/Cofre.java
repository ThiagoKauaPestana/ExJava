import java.util.ArrayList;

public class Cofre {
    private ArrayList<Moeda> moedas;

    public Cofre(){
        moedas = new ArrayList<>();
    }

    public void adicionar(Moeda m){
        moedas.add(m);
        
    }

    public double calcularTotal(){
        double total = 0;
        for (Moeda moeda : moedas){
            total += moeda.getValor();
        }
        return total;
    }

    public int contarMoedas(Moeda m){
        int cont = 0;
        for (Moeda moeda : moedas){
            if (moeda.getValor() == m.getValor() && moeda.getNome().equals(m.getNome())){
                cont++;
            }
        }      
        return cont;
    }
}

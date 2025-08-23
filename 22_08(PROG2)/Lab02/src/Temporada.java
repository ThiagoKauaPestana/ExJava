import java.util.List;
import java.util.ArrayList;

public class Temporada extends Midia {
    private List<Episodio> episodios;

    public Temporada(int numero){
        
        super("Número " + numero);
        episodios = new ArrayList<>();
    }

    public void adicionar(Episodio ep) {
        episodios.add(ep);
    }

    @Override
    public long getDuracao(){
        long duracao = 0;
        for (Episodio ep : episodios) {
            duracao += ep.getDuracao();
        }
        return duracao;
    }

    @Override
    public String info(){
        return "Temporada " + super.info() + "; Duração total: " + getDuracao() + " minutos";
    }
}
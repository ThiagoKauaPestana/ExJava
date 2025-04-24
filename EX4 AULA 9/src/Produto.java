public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

        public double calcularValorTotal(){
        return preco * quantidade;
            
        }
    
        public void aplicarDesconto(double percentual){
            double desconto = preco * percentual / 100;
            setPreco(preco - desconto);
        }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if (nome.lenght() > 0) {
            this.nome = nome;
        }
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if (preco.lenght() > 0){
            this.preco = preco;
        }
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        if (quantidade.lenght() > 0){
            this.quantidade = quantidade;
        }
    }

    
    
}
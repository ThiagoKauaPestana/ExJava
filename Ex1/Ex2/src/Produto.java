public class Produto {
    
        public String nome;
        public double preco;
        public int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public int calcularValorTotal(){
            return quantidade;
        }

        public double aplicarDesconto(double percentual){
            return preco -  (preco * percentual / 100); 
        }
}

import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto produto = new Produto("Thiago", 10, 10);
        

        System.out.printf("Nome: %s\nPreco: %.2f\nQuantidade: %d\n", produto.nome, produto.preco, produto.quantidade);
        System.out.print("Digite o percentual de Desconto: ");
        double percentual = entrada.nextDouble();
        
        produto.preco = produto.aplicarDesconto( percentual);

        System.out.printf("Novo preco: %.2f\n", produto.preco);
        entrada.close();
    }
}
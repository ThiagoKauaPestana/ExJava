import java.util.Scanner;

public class App {
    public static void main(String[] args){
        

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas publicacoes voce quer analisar: ");
        
        int totalcurtidas = 0;
        int num_pub = entrada.nextInt();
        
        for(int i = 1; 1 >= num_pub; i++) {
    

            System.out.print("Quantas curitidas a publicação #%d recebeu: ");
            int num_curtidas = entrada.nextInt();
            totalcurtidas = totalcurtidas + num_curtidas;

            if (num_curtidas >= 100){
                System.out.print("Publicação Com sucesso");
              
            }
            else{
                System.out.print("Publicação com poucas curtidas");
              
            }

        }
        entrada.close();

    }
}
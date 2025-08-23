import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppStreaming {

    public static void main(String[] args) {
    


        List<Midia> midias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;


        while (executando) {

            System.out.println("\n--- Menu de Opções ---");
            System.out.println("(1) Adicionar novo Filme.");
            System.out.println("(2) Adicionar nova Série.");
            System.out.println("(3) Listar todas as mídias.");
            System.out.println("(4) Sair.");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcao) {
                    case 1:
                        

                        System.out.print("Digite o título do filme: ");
                        String tituloFilme = scanner.nextLine();
                        System.out.print("Digite a duração do filme (em minutos): ");
                        long duracaoFilme = scanner.nextLong();
                        scanner.nextLine(); 
                        


                        Filme novoFilme = new Filme(tituloFilme, duracaoFilme);
                        midias.add(novoFilme);
                        System.out.println("Filme '" + novoFilme.info() + "' adicionado com sucesso!");
                        break;

                    case 2:
                        


                        System.out.print("Digite o título da série: ");
                        String tituloSerie = scanner.nextLine();
                        
                        Serie novaSerie = new Serie(tituloSerie);

                        
                        for (int i = 1; i <= 2; i++) {
                            Temporada novaTemporada = new Temporada(i);
                            
                        
                            for (int j = 1; j <= 2; j++) {
                                System.out.print("Temporada " + i + ", Episódio " + j + " - Digite o título: ");
                                String tituloEpisodio = scanner.nextLine();
                                System.out.print("Temporada " + i + ", Episódio " + j + " - Digite a duração (em minutos): ");
                                long duracaoEpisodio = scanner.nextLong();
                                scanner.nextLine(); 
                                

                                Episodio novoEpisodio = new Episodio(tituloEpisodio, duracaoEpisodio);
                                novaTemporada.adicionar(novoEpisodio);
                            }

                            novaSerie.adicionar(novaTemporada);
                        }
                        
                        midias.add(novaSerie);
                        System.out.println("Série '" + novaSerie.info() + "' adicionada com sucesso!");
                        break;

                    case 3:
                    
                        if (midias.isEmpty()) {
                            System.out.println("Nenhuma mídia cadastrada.");
                        } else {
                            System.out.println("--- Mídias Cadastradas ---");
                            for (Midia midia : midias) {
                                System.out.println(midia.info());
                            }
                        }
                        break;

                    case 4:
                    
                        System.out.println("Saindo do programa. Até mais!");
                        executando = false;
                        break;

                    default:
                        System.out.println("Opção inválida! Por favor, escolha uma opção entre 1 e 4.");
                }
            } catch (InputMismatchException e) {

                
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); 
            }
        }
        scanner.close();
    }
}
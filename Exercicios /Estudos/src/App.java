import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] edificioMack = new int[10][8];
        Random gerador = new Random(); 

        for(int i = 0; i < edificioMack.length; i++){
            for(int j = 0; j < 8; j++){

                edificioMack[i][j] = gerador.nextInt(7); 
            }
        }

        System.out.println("Moradores Mack Vista");
        for (int l = 0; l < edificioMack.length; l++) {
            for (int h = 0; h < edificioMack[l].length; h++) {
            System.out.print(edificioMack[l][h] + "  ");
  
        }
        
        System.out.println();
        }

        System.out.println("----------------------------------------------");
        int totalMoradores = 0;
        int totalVazios = 0;
        int totalMoradoresAndar = -1;
        int andarMaiorMoradores =-1;
        for (int i = 0; i < edificioMack.length; i++) {

            int somaAndarAtual = 0;

            for (int j = 0; j < edificioMack[i].length; j++) {
                somaAndarAtual += edificioMack[i][j];
                totalMoradores += edificioMack[i][j];
                if(edificioMack[i][j] == 0){
                    totalVazios++;
                }
            }
             if (somaAndarAtual > totalMoradoresAndar){
                andarMaiorMoradores = i;
                totalMoradoresAndar = somaAndarAtual;



             }
        }
        System.out.printf("Total de Moradores: %d\n", totalMoradores);
        System.out.printf("Total de apartamentos vazios: %d\n", totalVazios);
        System.out.printf("O andar com mais moradores: %d\n", andarMaiorMoradores);

    }
}



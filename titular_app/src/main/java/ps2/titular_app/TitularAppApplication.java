package ps2.titular_app;

import static ps2.titular_app.ES.*;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TitularAppApplication implements CommandLineRunner {

    @Autowired
    private TitularRepo titularRepo;

    public static void main(String[] args) {
        SpringApplication.run(TitularAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        print("# GERENCIADOR DE TITULARES!");
        boolean sair = false;
        
        String menu = "\n(1) Listar todos os titulares";
        menu += "\n(2) Buscar titular por número";
        menu += "\n(3) Criar novo titular";
        menu += "\n(4) Alterar dados do titular";
        menu += "\n(5) Apagar titular";
        menu += "\n(0) Sair \n";
        menu += "Escolha uma opção: ";

        while (!sair) {
            String op = input(menu);
            switch (op) {
                case "1":
                    listar();
                    break;
                case "2":
                    buscar();
                    break;
                case "3":
                    criar();
                    break;
                case "4":
                    alterar();
                    break;
                case "5":
                    apagar();
                    break;
                case "0":
                    sair = true;
                    break;
                default:
                    print("Opção inválida!");
            }
        }
        print("\nPrograma finalizado.");
    }

    private void listar() {
        print("\n# LISTA DE TITULARES");
        Iterable<Titular> titulares = titularRepo.findAll();
        if (!titulares.iterator().hasNext()) {
            print("Nenhum titular cadastrado.");
            return;
        }
        for (Titular t : titulares) {
            print(t.toString());
        }
    }

    private void buscar() {
        print("\n# BUSCA DE TITULAR");
        try {
            long id = Long.parseLong(input("Digite o número do titular: "));
            Optional<Titular> titularOpt = titularRepo.findById(id);
            if (titularOpt.isPresent()) {
                print("Titular encontrado:");
                print(titularOpt.get().toString());
            } else {
                print("Titular com o número " + id + " não encontrado.");
            }
        } catch (NumberFormatException e) {
            print("ERRO: O número do titular deve ser um valor numérico.");
        }
    }

    private void criar() {
        print("\n# NOVO TITULAR");
        String nome = input("Digite o nome: ");
        String cpf = input("Digite o CPF: ");

        Titular novoTitular = new Titular();
        novoTitular.setNome(nome);
        novoTitular.setCpf(cpf);
        
        titularRepo.save(novoTitular);
        print("Titular criado com sucesso! Número: " + novoTitular.getId());
    }

    private void alterar() {
        print("\n# ALTERAR TITULAR");
        try {
            long id = Long.parseLong(input("Digite o número do titular que deseja alterar: "));
            Optional<Titular> titularOpt = titularRepo.findById(id);

            if (titularOpt.isPresent()) {
                Titular titular = titularOpt.get();
                print("Titular encontrado: " + titular);
                
                String novoNome = input("Digite o novo nome (ou deixe em branco para não alterar): ");
                String novoCpf = input("Digite o novo CPF (ou deixe em branco para não alterar): ");

                if (!novoNome.isEmpty()) {
                    titular.setNome(novoNome);
                }
                if (!novoCpf.isEmpty()) {
                    titular.setCpf(novoCpf);
                }
                
                titularRepo.save(titular);
                print("Titular alterado com sucesso!");
            } else {
                print("Titular com o número " + id + " não encontrado.");
            }
        } catch (NumberFormatException e) {
            print("ERRO: O número do titular deve ser um valor numérico.");
        }
    }

    private void apagar() {
        print("\n# APAGAR TITULAR");
        try {
            long id = Long.parseLong(input("Digite o número do titular que deseja apagar: "));
            
            if (titularRepo.findById(id).isPresent()) {
                titularRepo.deleteById(id);
                print("Titular número " + id + " apagado com sucesso!");
            } else {
                print("Titular com o número " + id + " não encontrado.");
            }
        } catch (NumberFormatException e) {
            print("ERRO: O número do titular deve ser um valor numérico.");
        }
    }
}
package RecuperacaoProva1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        SistemaFilmes sistema = new SistemaFilmes();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar um filme");
            System.out.println("2. Verificar filmes cadastrados");
            System.out.println("3. Verificar filmes de um diretor");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();  // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    adicionarFilme(sc, sistema);
                    break;
                case 2:
                    sistema.verificarFilmesCadastrados();
                    break;
                case 3:
                    verificarFilmesDiretor(sc, sistema);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }

    private static void adicionarFilme(Scanner sc, SistemaFilmes sistema) {
        System.out.println("\nInsira os dados do filme:");

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Diretor: ");
        String diretor = sc.nextLine();

        String dataLancamento;
        do {
            System.out.print("Data de lançamento (DD/MM/AAAA): ");
            dataLancamento = sc.nextLine();
            if (!Filme.validarData(dataLancamento)) {
                System.out.println("Formato de data inválido. Tente novamente.");
            }
        } while (!Filme.validarData(dataLancamento));

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        try {
            Filme novoFilme = new Filme(titulo, diretor, dataLancamento, descricao);
            sistema.adicionarFilme(novoFilme);

            Usuario usuarioDiretor = null;
            for (Usuario usuario : sistema.getUsuarios()) {
                if (usuario.getNomeDiretor().equalsIgnoreCase(diretor)) {
                    usuarioDiretor = usuario;
                    break;
                }
            }
            if (usuarioDiretor == null) {
                usuarioDiretor = new Usuario(diretor);
                sistema.adicionarUsuario(usuarioDiretor);
            }

            usuarioDiretor.adicionarFilme(novoFilme);

            System.out.println("Filme adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar filme: " + e.getMessage());
        }
    }

    private static void verificarFilmesDiretor(Scanner sc, SistemaFilmes sistema) {
        sistema.verificarFilmesDiretor(sc);
    }
}

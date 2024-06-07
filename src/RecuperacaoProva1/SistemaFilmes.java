package RecuperacaoProva1;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFilmes {
    private ArrayList<Filme> filmes;
    private ArrayList<Usuario> usuarios;

    public SistemaFilmes() {
        this.filmes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void verificarFilmesCadastrados() {
        System.out.println("\nFilmes cadastrados:");
        for (Filme filme : filmes) {
            System.out.println("- " + filme.getTitulo());
        }
    }

    public void verificarFilmesDiretor(Scanner sc) {
        System.out.print("\nDigite o nome do diretor: ");
        String diretor = sc.nextLine();
        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getNomeDiretor().equalsIgnoreCase(diretor)) {
                System.out.println("Filmes do diretor " + diretor + ":");
                for (Filme filme : usuario.getFilmesFeitos()) {
                    System.out.println("- " + filme.getTitulo());
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum filme encontrado para o diretor " + diretor);
        }
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}

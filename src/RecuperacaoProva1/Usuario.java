package RecuperacaoProva1;

import java.util.ArrayList;

public class Usuario {
    private String nomeDiretor;
    private ArrayList<Filme> filmesFeitos;

    public Usuario(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
        this.filmesFeitos = new ArrayList<>();
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void adicionarFilme(Filme filme) {
        filmesFeitos.add(filme);
    }

    public ArrayList<Filme> getFilmesFeitos() {
        return filmesFeitos;
    }
}

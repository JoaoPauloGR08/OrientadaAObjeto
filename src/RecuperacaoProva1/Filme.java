package RecuperacaoProva1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Filme {
    private String titulo;
    private String diretor;
    private Date dataLancamento;
    private String descricao;

    public Filme(String titulo, String diretor, String dataLancamento, String descricao) throws ParseException {
        this.titulo = titulo;
        this.diretor = diretor;
        this.descricao = descricao;
        this.setDataLancamento(dataLancamento);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getDataLancamento() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(this.dataLancamento);
    }

    public String getDescricao() {
        return descricao;
    }

    private void setDataLancamento(String dataLancamento) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.dataLancamento = formatter.parse(dataLancamento);
    }
    
    public static boolean validarData(String data) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(data);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}

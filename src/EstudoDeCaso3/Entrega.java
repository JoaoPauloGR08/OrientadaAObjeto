package EstudoDeCaso3;

public class Entrega {

    private ArrayList<Integer> idEntrega = new ArrayList<Integer>();
    private Date previsao;
    private Date dataEnvio;

    public boolean setId(int idEntrega){
        this.idEntrega = idEntrega;
    }

    public int getId(){
        return this.idEntrega;
    }

    public boolean setPrevisao(Date previsao){
        
    }

    public Date getPrevisao(){
        return this.previsao;
    }

}

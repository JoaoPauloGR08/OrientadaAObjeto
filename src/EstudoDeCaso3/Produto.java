package EstudoDeCaso3;

public class Produto {
    
    private int idProduto;
    private float preco;
    private int tempoProducao;
    
    
    public void setIdProduto(int idProduto) {
        
        this.idProduto = idProduto;
    }
    
    public int getIdProtudo() {
        
        return this.idProduto;
    }
    
    public void setPreco(float preco) {
        
        this.preco = preco;
    }
    
    public float getPreco() {
        
        return this.preco;
    }
    
    public void setTempoProducao(int tempoProducao) {
        
        this.tempoProducao = tempoProducao;
    }
    
    public int getTempoProducao() {
        
        return this.tempoProducao;
    }

}
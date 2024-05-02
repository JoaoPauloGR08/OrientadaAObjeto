/**
 * Esta classe representa um serviço de manutenção associado a um produto da Weg.
 * 
 * @author João Paulo
 * @version 1.0
 * 
 */

package Atividade5;

public class ServicoManutencao {

    private int codigo;
    private String descricao;
    private double custo;
    private ProdutoWeg prod = new ProdutoWeg();

    /**
     * Construtor padrão.
     */
    public ServicoManutencao() {

    }

    /**
     * Construtor que recebe apenas o código.
     * 
     * @param codigo O código do serviço de manutenção.
     */
    public ServicoManutencao(int codigo) {
        setCodigo(codigo);
    }

    /**
     * Construtor que recebe código e descrição.
     * 
     * @param codigo    O código do serviço de manutenção.
     * @param descricao A descrição do serviço de manutenção.
     */
    public ServicoManutencao(int codigo, String descricao) {
        setCodigo(codigo);
        setDescricao(descricao);
    }

    /**
     * Construtor que recebe código, descrição e custo.
     * 
     * @param codigo    O código do serviço de manutenção.
     * @param descricao A descrição do serviço de manutenção.
     * @param custo     O custo do serviço de manutenção.
     */
    public ServicoManutencao(int codigo, String descricao, double custo) {
        setCodigo(codigo);
        setDescricao(descricao);
        setCusto(custo);
    }

    /**
     * Construtor que recebe código, descrição, custo e produto associado.
     * 
     * @param codigo    O código do serviço de manutenção.
     * @param descricao A descrição do serviço de manutenção.
     * @param custo     O custo do serviço de manutenção.
     * @param prod      O produto associado ao serviço de manutenção.
     */
    public ServicoManutencao(int codigo, String descricao, double custo, ProdutoWeg prod) {
        setCodigo(codigo);
        setDescricao(descricao);
        setCusto(custo);
        setProd(prod);
    }

    /**
     * Obtém a descrição do serviço de manutenção.
     * 
     * @return A descrição do serviço de manutenção.
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Define a descrição do serviço de manutenção.
     * 
     * @param descricao A descrição do serviço de manutenção.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o custo do serviço de manutenção.
     * 
     * @return O custo do serviço de manutenção.
     */
    public double getCusto() {
        return this.custo;
    }

    /**
     * Define o custo do serviço de manutenção.
     * 
     * @param custo O custo do serviço de manutenção.
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * Obtém o código do produto associado ao serviço de manutenção.
     * 
     * @return O código do produto associado ao serviço de manutenção.
     */
    public int getProdCod() {
        return this.prod.getCodigo();
    }

    /**
     * Define o produto associado ao serviço de manutenção.
     * 
     * @param prod O produto associado ao serviço de manutenção.
     */
    public void setProd(ProdutoWeg prod) {
        this.prod = prod;
    }

    /**
     * Obtém o código do serviço de manutenção.
     * 
     * @return O código do serviço de manutenção.
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * Define o código do serviço de manutenção.
     * 
     * @param codigo O código do serviço de manutenção.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}

/**
 * Esta classe representa um produto da Weg.
 * 
 * @author João Paulo
 * @version 1.0
 * 
 */

package Atividade5;

public class ProdutoWeg {

    private int codigo;
    private String tipo;
    private double potencia;
    private double tensao;
    private int capacidade;
    private double preco;

    /**
     * Construtor padrão.
     */
    public ProdutoWeg() {

    }

    /**
     * Construtor que recebe apenas o código.
     * 
     * @param codigo O código do produto da Weg.
     */
    public ProdutoWeg(int codigo) {
        setCodigo(codigo);
    }

    /**
     * Construtor que recebe código e tipo.
     * 
     * @param codigo O código do produto da Weg.
     * @param tipo   O tipo do produto da Weg.
     */
    public ProdutoWeg(int codigo, String tipo) {
        setCodigo(codigo);
        setTipo(tipo);
    }

    /**
     * Construtor que recebe código, tipo e potência.
     * 
     * @param codigo   O código do produto da Weg.
     * @param tipo     O tipo do produto da Weg.
     * @param potencia A potência do produto da Weg.
     */
    public ProdutoWeg(int codigo, String tipo, double potencia) {
        setCodigo(codigo);
        setTipo(tipo);
        setPotencia(potencia);
    }

    /**
     * Construtor que recebe código, tipo, potência e tensão.
     * 
     * @param codigo   O código do produto da Weg.
     * @param tipo     O tipo do produto da Weg.
     * @param potencia A potência do produto da Weg.
     * @param tensao   A tensão do produto da Weg.
     */
    public ProdutoWeg(int codigo, String tipo, double potencia, double tensao) {
        setCodigo(codigo);
        setTipo(tipo);
        setPotencia(potencia);
        setTensao(tensao);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão e capacidade.
     * 
     * @param codigo     O código do produto da Weg.
     * @param tipo       O tipo do produto da Weg.
     * @param potencia   A potência do produto da Weg.
     * @param tensao     A tensão do produto da Weg.
     * @param capacidade A capacidade do produto da Weg.
     */
    public ProdutoWeg(int codigo, String tipo, double potencia, double tensao, int capacidade) {
        setCodigo(codigo);
        setTipo(tipo);
        setPotencia(potencia);
        setTensao(tensao);
        setCapacidade(capacidade);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade e preço.
     * 
     * @param codigo     O código do produto da Weg.
     * @param tipo       O tipo do produto da Weg.
     * @param potencia   A potência do produto da Weg.
     * @param tensao     A tensão do produto da Weg.
     * @param capacidade A capacidade do produto da Weg.
     * @param preco      O preço do produto da Weg.
     */
    public ProdutoWeg(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco) {
        setCodigo(codigo);
        setTipo(tipo);
        setPotencia(potencia);
        setTensao(tensao);
        setCapacidade(capacidade);
        setPreco(preco);
    }

    /**
     * Obtém o código do produto da Weg.
     * 
     * @return O código do produto da Weg.
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * Define o código do produto da Weg.
     * 
     * @param codigo O código do produto da Weg.
     * @return true se o código foi definido com sucesso, false caso contrário.
     */
    public boolean setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
            return true;
        }
        return false;
    }

    /**
     * Obtém o tipo do produto da Weg.
     * 
     * @return O tipo do produto da Weg.
     */
    public String getTipo() {
        return this.tipo;
    }

    /**
     * Define o tipo do produto da Weg.
     * 
     * @param tipo O tipo do produto da Weg.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém a potência do produto da Weg.
     * 
     * @return A potência do produto da Weg.
     */
    public double getPotencia() {
        return this.potencia;
    }

    /**
     * Define a potência do produto da Weg.
     * 
     * @param potencia A potência do produto da Weg.
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtém a tensão do produto da Weg.
     * 
     * @return A tensão do produto da Weg.
     */
    public double getTensao() {
        return this.tensao;
    }

    /**
     * Define a tensão do produto da Weg.
     * 
     * @param tensao A tensão do produto da Weg.
     */
    public void setTensao(double tensao) {
        this.tensao = tensao;
    }

    /**
     * Obtém a capacidade do produto da Weg.
     * 
     * @return A capacidade do produto da Weg.
     */
    public int getCapacidade() {
        return this.capacidade;
    }

    /**
     * Define a capacidade do produto da Weg.
     * 
     * @param capacidade A capacidade do produto da Weg.
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Obtém o preço do produto da Weg.
     * 
     * @return O preço do produto da Weg.
     */
    public double getPreco() {
        return this.preco;
    }

    /**
     * Define o preço do produto da Weg.
     * 
     * @param preco O preço do produto da Weg.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

}

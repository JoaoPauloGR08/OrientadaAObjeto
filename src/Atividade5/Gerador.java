/**
 * Esta classe representa um gerador produzido pela Weg.
 * 
 * Extends ProdutoWeg, pois um Gerador é um tipo específico de produto da Weg.
 * 
 * @author João Paulo
 * @version 1.0
 * 
 */

package Atividade5;

public class Gerador extends ProdutoWeg {

    private String combustivel;
    private double autonomia;

    /**
     * Construtor padrão.
     */
    public Gerador() {

    }

    /**
     * Construtor que recebe apenas o código.
     * 
     * @param codigo O código do gerador.
     */
    public Gerador(int codigo) {
        super(codigo);
    }

    /**
     * Construtor que recebe código e tipo.
     * 
     * @param codigo O código do gerador.
     * @param tipo   O tipo do gerador.
     */
    public Gerador(int codigo, String tipo) {
        super(codigo, tipo);
    }

    /**
     * Construtor que recebe código, tipo e potência.
     * 
     * @param codigo   O código do gerador.
     * @param tipo     O tipo do gerador.
     * @param potencia A potência do gerador.
     */
    public Gerador(int codigo, String tipo, double potencia) {
        super(codigo, tipo, potencia);
    }

    /**
     * Construtor que recebe código, tipo, potência e tensão.
     * 
     * @param codigo   O código do gerador.
     * @param tipo     O tipo do gerador.
     * @param potencia A potência do gerador.
     * @param tensao   A tensão do gerador.
     */
    public Gerador(int codigo, String tipo, double potencia, double tensao) {
        super(codigo, tipo, potencia, tensao);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão e capacidade.
     * 
     * @param codigo     O código do gerador.
     * @param tipo       O tipo do gerador.
     * @param potencia   A potência do gerador.
     * @param tensao     A tensão do gerador.
     * @param capacidade A capacidade do gerador.
     */
    public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade) {
        super(codigo, tipo, potencia, tensao, capacidade);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade e preço.
     * 
     * @param codigo     O código do gerador.
     * @param tipo       O tipo do gerador.
     * @param potencia   A potência do gerador.
     * @param tensao     A tensão do gerador.
     * @param capacidade A capacidade do gerador.
     * @param preco      O preço do gerador.
     */
    public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco) {
        super(codigo, tipo, potencia, tensao, capacidade, preco);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade, preço e combustível.
     * 
     * @param codigo      O código do gerador.
     * @param tipo        O tipo do gerador.
     * @param potencia    A potência do gerador.
     * @param tensao      A tensão do gerador.
     * @param capacidade  A capacidade do gerador.
     * @param preco       O preço do gerador.
     * @param combustivel O combustível do gerador.
     */
    public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
            String combustivel) {
        super(codigo, tipo, potencia, tensao, capacidade, preco);
        setCombustivel(combustivel);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade, preço, combustível e autonomia.
     * 
     * @param codigo      O código do gerador.
     * @param tipo        O tipo do gerador.
     * @param potencia    A potência do gerador.
     * @param tensao      A tensão do gerador.
     * @param capacidade  A capacidade do gerador.
     * @param preco       O preço do gerador.
     * @param combustivel O combustível do gerador.
     * @param autonomia   A autonomia do gerador.
     */
    public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
            String combustivel, double autonomia) {
        super(codigo, tipo, potencia, tensao, capacidade, preco);
        setCombustivel(combustivel);
        setAutonomia(autonomia);
    }

    /**
     * Obtém o tipo de combustível do gerador.
     * 
     * @return O tipo de combustível do gerador.
     */
    public String getCombustivel() {
        return this.combustivel;
    }

    /**
     * Define o tipo de combustível do gerador.
     * 
     * @param combustivel O tipo de combustível do gerador.
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * Obtém a autonomia do gerador.
     * 
     * @return A autonomia do gerador.
     */
    public double getAutonomia() {
        return this.autonomia;
    }

    /**
     * Define a autonomia do gerador.
     * 
     * @param autonomia A autonomia do gerador.
     */
    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
    
    /**
     * Método para obter informações completas sobre o inversor de frequência.
     */
    public void getInfo() {
        System.out.println(getCodigo());
        System.out.println(getTipo());
        System.out.println(getPotencia());
        System.out.println(getTensao());
        System.out.println(getCapacidade());
        System.out.println(getPreco());
        System.out.println(getCombustivel());
        System.out.println(getAutonomia());
    }

}

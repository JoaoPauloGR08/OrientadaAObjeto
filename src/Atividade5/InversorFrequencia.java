/**
 * Esta classe representa um inversor de frequência produzido pela Weg.
 * 
 * Extends ProdutoWeg, pois um Inversor de Frequência é um tipo específico de produto da Weg.
 * 
 * @author João Paulo
 * @version 1.0
 * 
 */

package Atividade5;

public class InversorFrequencia extends ProdutoWeg {

    private double capFreq;
    private int numeroFases;

    /**
     * Construtor padrão.
     */
    public InversorFrequencia() {

    }

    /**
     * Construtor que recebe apenas o código.
     * 
     * @param codigo O código do inversor de frequência.
     */
    public InversorFrequencia(int codigo) {
        super(codigo);
    }

    /**
     * Construtor que recebe código e tipo.
     * 
     * @param codigo O código do inversor de frequência.
     * @param tipo   O tipo do inversor de frequência.
     */
    public InversorFrequencia(int codigo, String tipo) {
        super(codigo, tipo);
    }

    /**
     * Construtor que recebe código, tipo e potência.
     * 
     * @param codigo   O código do inversor de frequência.
     * @param tipo     O tipo do inversor de frequência.
     * @param potencia A potência do inversor de frequência.
     */
    public InversorFrequencia(int codigo, String tipo, double potencia) {
        super(codigo, tipo, potencia);
    }

    /**
     * Construtor que recebe código, tipo, potência e tensão.
     * 
     * @param codigo   O código do inversor de frequência.
     * @param tipo     O tipo do inversor de frequência.
     * @param potencia A potência do inversor de frequência.
     * @param tensao   A tensão do inversor de frequência.
     */
    public InversorFrequencia(int codigo, String tipo, double potencia, double tensao) {
        super(codigo, tipo, potencia, tensao);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão e capacidade.
     * 
     * @param codigo     O código do inversor de frequência.
     * @param tipo       O tipo do inversor de frequência.
     * @param potencia   A potência do inversor de frequência.
     * @param tensao     A tensão do inversor de frequência.
     * @param capacidade A capacidade do inversor de frequência.
     */
    public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade) {
        super(codigo, tipo, potencia, tensao, capacidade);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade e preço.
     * 
     * @param codigo     O código do inversor de frequência.
     * @param tipo       O tipo do inversor de frequência.
     * @param potencia   A potência do inversor de frequência.
     * @param tensao     A tensão do inversor de frequência.
     * @param capacidade A capacidade do inversor de frequência.
     * @param preco      O preço do inversor de frequência.
     */
    public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco) {
        super(codigo, tipo, potencia, tensao, capacidade, preco);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade, preço e capacidade de frequência.
     * 
     * @param codigo     O código do inversor de frequência.
     * @param tipo       O tipo do inversor de frequência.
     * @param potencia   A potência do inversor de frequência.
     * @param tensao     A tensão do inversor de frequência.
     * @param capacidade A capacidade do inversor de frequência.
     * @param preco      O preço do inversor de frequência.
     * @param capFreq    A capacidade de frequência do inversor de frequência.
     */
    public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
            double capFreq) {
        super(codigo, tipo, potencia, tensao, capacidade, preco);
        setCapFreq(capFreq);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade, preço, capacidade de frequência e número de fases.
     * 
     * @param codigo      O código do inversor de frequência.
     * @param tipo        O tipo do inversor de frequência.
     * @param potencia    A potência do inversor de frequência.
     * @param tensao      A tensão do inversor de frequência.
     * @param capacidade  A capacidade do inversor de frequência.
     * @param preco       O preço do inversor de frequência.
     * @param capFreq     A capacidade de frequência do inversor de frequência.
     * @param numeroFases O número de fases do inversor de frequência.
     */
    public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
            double capFreq, int numeroFases) {
        super(codigo, tipo, potencia, tensao, capacidade, preco);
        setCapFreq(capFreq);
        setNumeroFases(numeroFases);
    }

    /**
     * Obtém a capacidade de frequência do inversor de frequência.
     * 
     * @return A capacidade de frequência do inversor de frequência.
     */
    public double getCapFreq() {
        return this.capFreq;
    }

    /**
     * Define a capacidade de frequência do inversor de frequência.
     * 
     * @param capFreq A capacidade de frequência do inversor de frequência.
     */
    public void setCapFreq(double capFreq) {
        this.capFreq = capFreq;
    }

    /**
     * Obtém o número de fases do inversor de frequência.
     * 
     * @return O número de fases do inversor de frequência.
     */
    public int getNumeroFases() {
        return this.numeroFases;
    }

    /**
     * Define o número de fases do inversor de frequência.
     * 
     * @param numeroFases O número de fases do inversor de frequência.
     */
    public void setNumeroFases(int numeroFases) {
        this.numeroFases = numeroFases;
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
        System.out.println(getCapFreq());
        System.out.println(getNumeroFases());
    }
    
}

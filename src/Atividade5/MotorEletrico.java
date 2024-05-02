/**
 * Esta classe representa um motor elétrico produzido pela Weg.
 * 
 * Extends ProdutoWeg, pois um Motor Elétrico é um tipo específico de produto da Weg.
 * 
 * @author João Paulo
 * @version 1.0
 * 
 */

package Atividade5;

public class MotorEletrico extends ProdutoWeg {

    private String tipoRolamento;
    private double eficiencia;

    /**
     * Construtor padrão.
     */
    public MotorEletrico() {

    }

    /**
     * Construtor que recebe apenas o código.
     * 
     * @param codigo O código do motor elétrico.
     */
    public MotorEletrico(int codigo) {
        super(codigo);
    }

    /**
     * Construtor que recebe código e tipo.
     * 
     * @param codigo O código do motor elétrico.
     * @param tipo   O tipo do motor elétrico.
     */
    public MotorEletrico(int codigo, String tipo) {
        super(codigo, tipo);
    }

    /**
     * Construtor que recebe código, tipo e potência.
     * 
     * @param codigo   O código do motor elétrico.
     * @param tipo     O tipo do motor elétrico.
     * @param potencia A potência do motor elétrico.
     */
    public MotorEletrico(int codigo, String tipo, double potencia) {
        super(codigo, tipo, potencia);
    }

    /**
     * Construtor que recebe código, tipo, potência e tensão.
     * 
     * @param codigo   O código do motor elétrico.
     * @param tipo     O tipo do motor elétrico.
     * @param potencia A potência do motor elétrico.
     * @param tensao   A tensão do motor elétrico.
     */
    public MotorEletrico(int codigo, String tipo, double potencia, double tensao) {
        super(codigo, tipo, potencia, tensao);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão e capacidade.
     * 
     * @param codigo     O código do motor elétrico.
     * @param tipo       O tipo do motor elétrico.
     * @param potencia   A potência do motor elétrico.
     * @param tensao     A tensão do motor elétrico.
     * @param capacidade A capacidade do motor elétrico.
     */
    public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade) {
        super(codigo, tipo, potencia, tensao, capacidade);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade e preço.
     * 
     * @param codigo     O código do motor elétrico.
     * @param tipo       O tipo do motor elétrico.
     * @param potencia   A potência do motor elétrico.
     * @param tensao     A tensão do motor elétrico.
     * @param capacidade A capacidade do motor elétrico.
     * @param preco      O preço do motor elétrico.
     */
    public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco) {
        super(codigo, tipo, potencia, tensao, capacidade, preco);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade, preço e tipo de rolamento.
     * 
     * @param codigo         O código do motor elétrico.
     * @param tipo           O tipo do motor elétrico.
     * @param potencia       A potência do motor elétrico.
     * @param tensao         A tensão do motor elétrico.
     * @param capacidade     A capacidade do motor elétrico.
     * @param preco          O preço do motor elétrico.
     * @param tipoRolamento  O tipo de rolamento do motor elétrico.
     */
    public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
            String tipoRolamento) {
        super(codigo, tipo, potencia, tensao, capacidade, preco);
        setTipoRolamento(tipoRolamento);
    }

    /**
     * Construtor que recebe código, tipo, potência, tensão, capacidade, preço, tipo de rolamento e eficiência.
     * 
     * @param codigo         O código do motor elétrico.
     * @param tipo           O tipo do motor elétrico.
     * @param potencia       A potência do motor elétrico.
     * @param tensao         A tensão do motor elétrico.
     * @param capacidade     A capacidade do motor elétrico.
     * @param preco          O preço do motor elétrico.
     * @param tipoRolamento  O tipo de rolamento do motor elétrico.
     * @param eficiencia     A eficiência do motor elétrico.
     */
    public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
            String tipoRolamento, double eficiencia) {
        super(codigo, tipo, potencia, tensao, capacidade, preco);
        setTipoRolamento(tipoRolamento);
        setEficiencia(eficiencia);
    }

    /**
     * Obtém o tipo de rolamento do motor elétrico.
     * 
     * @return O tipo de rolamento do motor elétrico.
     */
    public String getTipoRolamento() {
        return this.tipoRolamento;
    }

    /**
     * Define o tipo de rolamento do motor elétrico.
     * 
     * @param tipoRolamento O tipo de rolamento do motor elétrico.
     */
    public void setTipoRolamento(String tipoRolamento) {
        this.tipoRolamento = tipoRolamento;
    }

    /**
     * Obtém a eficiência do motor elétrico.
     * 
     * @return A eficiência do motor elétrico.
     */
    public double getEficiencia() {
        return this.eficiencia;
    }

    /**
     * Define a eficiência do motor elétrico.
     * 
     * @param eficiencia A eficiência do motor elétrico.
     * 
     * @return caso eficiência seja maior que 0 return true, senão return false
     */
    public boolean setEficiencia(double eficiencia) {
    	if(eficiencia > 0) {
    		this.eficiencia = eficiencia;
    		return true;
    	}
    	return false;
   	}

    /**
     * Método para obter informações completas sobre o motor elétrico.
     */
    public void getInfo() {
        System.out.println(getCodigo());
        System.out.println(getTipo());
        System.out.println(getPotencia());
        System.out.println(getTensao());
        System.out.println(getCapacidade());
        System.out.println(getPreco());
        System.out.println(getTipoRolamento());
        System.out.println(getEficiencia());
    }

}

/*
 * @author João Paulo
 * @version 1.0
 * A classe WeatherData representa os dados meteorológicos, incluindo temperatura, umidade, pressão e data.
 */
package EstudoDeCaso6;

class WeatherData {
    private float temperatura;
    private float umidade;
    private float pressao;
    private String data;

    /**
     * Construtor da classe WeatherData.
     * @param temperatura a temperatura inicial
     * @param umidade a umidade inicial
     * @param pressao a pressão inicial
     * @param data a data inicial
     */
    public WeatherData(float temperatura, float umidade, float pressao, String data) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        this.data = data;
    }

    /**
     * Obtém a temperatura atual.
     * @return a temperatura atual
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * Define a temperatura atual.
     * @param temperatura a nova temperatura
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Obtém a umidade atual.
     * @return a umidade atual
     */
    public float getUmidade() {
        return umidade;
    }

    /**
     * Define a umidade atual.
     * @param umidade a nova umidade
     */
    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

    /**
     * Obtém a pressão atual.
     * @return a pressão atual
     */
    public float getPressao() {
        return pressao;
    }

    /**
     * Define a pressão atual.
     * @param pressao a nova pressão
     */
    public void setPressao(float pressao) {
        this.pressao = pressao;
    }

    /**
     * Obtém a data atual.
     * @return a data atual
     */
    public String getData() {
        return data;
    }

    /**
     * Define a data atual.
     * @param data a nova data
     */
    public void setData(String data) {
        this.data = data;
    }
}

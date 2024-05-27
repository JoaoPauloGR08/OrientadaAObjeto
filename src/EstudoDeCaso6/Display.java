/*
 * @author João Paulo
 * @version 1.0
 * A interface Display define o contrato para os objetos que exibem dados meteorológicos.
 */
package EstudoDeCaso6;

interface Display {
    
    /**
     * Atualiza os dados exibidos com base nos novos dados meteorológicos recebidos.
     * @param data os novos dados meteorológicos a serem exibidos
     */
    void update(WeatherData data);
}

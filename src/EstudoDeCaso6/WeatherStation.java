/**
 * @author João Paulo
 * @version 1.0
 * A classe WeatherStation representa a estação meteorológica que coleta e processa dados meteorológicos.
 * Ela permite registrar displays para atualização dos dados e controla a simulação de mudança de dia.
 */
package EstudoDeCaso6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

class WeatherStation {
    private List<Display> displays = new ArrayList<>();
    private WeatherData weatherData = new WeatherData(20, 80, 1000, "01/01/2024");

    /**
     * Registra um display para receber atualizações dos dados meteorológicos.
     * @param display o display a ser registrado
     */
    public void registrarDisplay(Display display) {
        displays.add(display);
    }

    /**
     * Define as medições meteorológicas atuais e notifica os displays registrados sobre a mudança.
     * @param temperatura a temperatura atual
     * @param umidade a umidade atual
     * @param pressao a pressão atmosférica atual
     * @param data a data das medições no formato "dd/MM/yyyy"
     */
    public void setMedicoes(float temperatura, float umidade, float pressao, String data) {
        weatherData.setTemperatura(temperatura);
        weatherData.setUmidade(umidade);
        weatherData.setPressao(pressao);
        weatherData.setData(data);
        notifyDisplays();
    }

    /**
     * Simula a mudança para o próximo dia, gerando novas medições meteorológicas e atualizando os displays.
     * @throws ParseException se houver erro na formatação da data
     */
    public void proximoDia() throws ParseException {
        Random rand = new Random();
        float variacaoTemperatura = rand.nextFloat() * 2 - 1;
        float variacaoUmidade = rand.nextFloat() * 4 - 2;
        float variacaoPressao = rand.nextFloat() * 2 - 1;
        float temperatura = weatherData.getTemperatura() + variacaoTemperatura;
        float umidade = weatherData.getUmidade() + variacaoUmidade;
        float pressao = weatherData.getPressao() + variacaoPressao;
        setMedicoes(temperatura, umidade, pressao, obterDataProximoDia());
    }

    /**
     * Obtém a data do próximo dia, incrementando a data atual em um dia.
     * @return a data do próximo dia no formato "dd/MM/yyyy"
     * @throws ParseException se houver erro na formatação da data
     */
    private String obterDataProximoDia() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateFormat.parse(weatherData.getData()));
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return dateFormat.format(cal.getTime());
    }

    /**
     * Notifica todos os displays registrados sobre a atualização dos dados meteorológicos.
     */
    public void notifyDisplays() {
        for (Display display : displays) {
            display.update(weatherData);
        }
    }
}

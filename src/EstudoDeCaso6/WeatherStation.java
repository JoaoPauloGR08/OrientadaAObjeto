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

    public void registrarDisplay(Display display) {
        displays.add(display);
    }

    public void setMedicoes(float temperatura, float umidade, float pressao, String data) {
        weatherData.setTemperatura(temperatura);
        weatherData.setUmidade(umidade);
        weatherData.setPressao(pressao);
        weatherData.setData(data);
        notifyDisplays();
    }

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

    private String obterDataProximoDia() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateFormat.parse(weatherData.getData()));
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return dateFormat.format(cal.getTime());
    }

    public void notifyDisplays() {
        for (Display display : displays) {
            display.update(weatherData);
        }
    }
}

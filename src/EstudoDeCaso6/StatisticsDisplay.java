package EstudoDeCaso6;

import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class StatisticsDisplay extends JPanel implements Display {
    private JLabel temperaturaMediaLabel;
    private float somaTemperaturas = 0;
    private int totalMedicoes = 0;

    public StatisticsDisplay() {
        setLayout(new GridLayout(1, 1));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        temperaturaMediaLabel = new JLabel("Temperatura Média: ");
        temperaturaMediaLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(temperaturaMediaLabel);
    }

    @Override
    public void update(WeatherData data) {
        // Atualiza a temperatura média com base na nova medição
        somaTemperaturas += data.getTemperatura();
        totalMedicoes++;
        float temperaturaMedia = somaTemperaturas / totalMedicoes;
        DecimalFormat formato = new DecimalFormat("#.##");
        temperaturaMediaLabel.setText("Temperatura Média: " + formato.format(temperaturaMedia) + "°C");
    }
}

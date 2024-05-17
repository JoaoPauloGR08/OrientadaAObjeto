package EstudoDeCaso6;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class CurrentConditionsDisplay extends JPanel implements Display {
    private JLabel temperaturaLabel;
    private JLabel umidadeLabel;
    private JLabel pressaoLabel;
    private JLabel dataLabel;

    public CurrentConditionsDisplay() {
        setLayout(new GridLayout(4, 1));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        temperaturaLabel = new JLabel("Temperatura: ");
        temperaturaLabel.setFont(new Font("Arial", Font.BOLD, 14));
        umidadeLabel = new JLabel("Umidade: ");
        umidadeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        pressaoLabel = new JLabel("Pressão: ");
        pressaoLabel.setFont(new Font("Arial", Font.BOLD, 14));
        dataLabel = new JLabel("Data: ");
        dataLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(temperaturaLabel);
        add(umidadeLabel);
        add(pressaoLabel);
        add(dataLabel);
    }

    @Override
    public void update(WeatherData data) {
        temperaturaLabel.setText("Temperatura: " + String.format("%.1f", data.getTemperatura()) + "°C");
        umidadeLabel.setText("Umidade: " + String.format("%.1f", data.getUmidade()) + "%");
        pressaoLabel.setText("Pressão: " + String.format("%.1f", data.getPressao()) + "hPa");
        dataLabel.setText("Data: " + data.getData());
    }
}

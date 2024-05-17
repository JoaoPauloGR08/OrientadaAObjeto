package EstudoDeCaso6;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.util.List;

class PastConditionsDisplay extends JPanel implements Display {
    private List<JLabel> labels = new ArrayList<>();

    public PastConditionsDisplay(int numDias) {
        setLayout(new GridLayout(numDias, 1));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        for (int i = 0; i < numDias; i++) {
            JLabel label = new JLabel();
            label.setFont(new Font("Arial", Font.BOLD, 14));
            labels.add(label);
            add(label);
        }
    }

    @Override
    public void update(WeatherData data) {
        for (int i = labels.size() - 1; i > 0; i--) {
            labels.get(i).setText(labels.get(i - 1).getText());
        }
        labels.get(0).setText(data.getData() + " - Temp: " + String.format("%.1f", data.getTemperatura()) + "°C, Umidade: " + String.format("%.1f", data.getUmidade()) + "%, Pressão: " + String.format("%.1f", data.getPressao()) + "hPa");
    }
}

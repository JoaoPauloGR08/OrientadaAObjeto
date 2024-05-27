/*
 * @author João Paulo
 * @version 1.0
 * A classe CurrentConditionsDisplay é uma representação visual das condições meteorológicas atuais.
 * Ela exibe a temperatura, umidade, pressão e data em uma interface gráfica.
 */
package EstudoDeCaso6;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
class CurrentConditionsDisplay extends JPanel implements Display {
    private JLabel temperaturaLabel;
    private JLabel umidadeLabel;
    private JLabel pressaoLabel;
    private JLabel dataLabel;

    /**
     * Construtor da classe CurrentConditionsDisplay.
     * Configura a disposição e o estilo dos elementos visuais.
     */
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

    /**
     * Atualiza os dados exibidos com base nos novos dados meteorológicos recebidos.
     * @param data os novos dados meteorológicos a serem exibidos
     */
    @Override
    public void update(WeatherData data) {
        temperaturaLabel.setText("Temperatura: " + String.format("%.1f", data.getTemperatura()) + "°C");
        umidadeLabel.setText("Umidade: " + String.format("%.1f", data.getUmidade()) + "%");
        pressaoLabel.setText("Pressão: " + String.format("%.1f", data.getPressao()) + "hPa");
        dataLabel.setText("Data: " + data.getData());
    }
}

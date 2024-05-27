/*
 * @author João Paulo
 * @version
 * A classe StatisticsDisplay é uma representação visual das estatísticas das medições meteorológicas.
 * Ela exibe a temperatura média das medições em uma interface gráfica.
 */
package EstudoDeCaso6;

import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
class StatisticsDisplay extends JPanel implements Display {
    private JLabel temperaturaMediaLabel;
    private float somaTemperaturas = 0;
    private int totalMedicoes = 0;

    /**
     * Construtor da classe StatisticsDisplay.
     * Configura a disposição e o estilo dos elementos visuais.
     */
    public StatisticsDisplay() {
        setLayout(new GridLayout(1, 1));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        temperaturaMediaLabel = new JLabel("Temperatura Média: ");
        temperaturaMediaLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(temperaturaMediaLabel);
    }

    /**
     * Atualiza a exibição das estatísticas com base nos novos dados meteorológicos recebidos.
     * @param data os novos dados meteorológicos a serem utilizados para calcular a temperatura média
     */
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

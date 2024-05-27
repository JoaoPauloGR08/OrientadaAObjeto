/*
 * @author João Paulo
 * @version 1.0
 * Esta classe representa a aplicação principal para a Central de Dados Climáticos.
 */
package EstudoDeCaso6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

/**
 * A classe WeatherDataCentral é a aplicação principal que exibe a interface gráfica
 * da Central de Dados Climáticos e controla as interações do usuário.
 */
public class WeatherDataCentral {
    
    /**
     * O método main é o ponto de entrada da aplicação.
     */
    public static void main(String[] args) {
        // Criação e configuração do JFrame principal
        JFrame frame = new JFrame("Central de Dados Climáticos");
        frame.setLayout(new GridLayout(3, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(950, 300); 
        frame.setVisible(true);

        // Criação de uma instância de WeatherStation
        WeatherStation estacaoMeteorologica = new WeatherStation();

        // Registro das telas de exibição
        Display displayAtual = new CurrentConditionsDisplay();
        estacaoMeteorologica.registrarDisplay(displayAtual);

        Display displayAnterior = new PastConditionsDisplay(5);
        estacaoMeteorologica.registrarDisplay(displayAnterior);

        Display statisticsDisplay = new StatisticsDisplay();
        estacaoMeteorologica.registrarDisplay(statisticsDisplay);

        // Adição das telas de exibição à janela principal
        frame.add((JPanel) displayAtual);
        frame.add((JPanel) displayAnterior);
        frame.add((JPanel) statisticsDisplay);

        // Criação e configuração do botão "Próximo Dia"
        JButton proximoDiaButton = new JButton("Próximo Dia");
        proximoDiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    estacaoMeteorologica.proximoDia();
                } catch (ParseException e1) {
                    e1.printStackTrace();
                }
            }
        });
        frame.add(proximoDiaButton);

        // Configuração das medições iniciais
        estacaoMeteorologica.setMedicoes(20, 80, 1000, "01/01/2024");
    }
}

package Testes;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// Interface que define um método para atualizar as telas de exibição
interface Display {
    void update(float temperatura, float umidade, float pressao, String data);
}

// Implementação de uma tela de exibição para as condições atuais
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
    public void update(float temperatura, float umidade, float pressao, String data) {
        // Atualiza a tela de exibição com os novos valores
        temperaturaLabel.setText("Temperatura: " + String.format("%.1f", temperatura) + "°C");
        umidadeLabel.setText("Umidade: " + String.format("%.1f", umidade) + "%");
        pressaoLabel.setText("Pressão: " + String.format("%.1f", pressao) + "hPa");
        dataLabel.setText("Data: " + data);
    }
}

// Implementação de uma tela de exibição para os dados dos dias anteriores
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
    public void update(float temperatura, float umidade, float pressao, String data) {
        // Atualiza a tela de exibição com os novos valores
        for (int i = labels.size() - 1; i > 0; i--) {
            labels.get(i).setText(labels.get(i - 1).getText());
        }
        labels.get(0).setText(data + " - Temp: " + String.format("%.1f", temperatura) + "°C, Umidade: " + String.format("%.1f", umidade) + "%, Pressão: " + String.format("%.1f", pressao) + "hPa");
    }
}

// Estação meteorológica que mede as condições climáticas
class WeatherStation {
    private List<Display> displays = new ArrayList<>();
    private float temperaturaAtual = 20; // Temperatura inicial
    private float umidadeAtual = 80; // Umidade inicial
    private float pressaoAtual = 1000; // Pressão inicial
    private String dataAtual = "01/01/2024"; // Data inicial

    public void registrarDisplay(Display display) {
        displays.add(display);
    }

    // Define novos valores para temperatura, umidade e pressao
    public void setMedicoes(float temperatura, float umidade, float pressao, String data) {
        for (Display display : displays) {
            display.update(temperatura, umidade, pressao, data);
        }
        temperaturaAtual = temperatura;
        umidadeAtual = umidade;
        pressaoAtual = pressao;
        dataAtual = data;
    }

    // Gera novos dados climáticos para o próximo dia com pequena variação
    public void proximoDia() throws ParseException {
        Random rand = new Random();
        float variacaoTemperatura = rand.nextFloat() * 2 - 1; // Variação de temperatura entre -1°C e 1°C
        float variacaoUmidade = rand.nextFloat() * 4 - 2; // Variação de umidade entre -2% e 2%
        float variacaoPressao = rand.nextFloat() * 2 - 1; // Variação de pressão entre -1hPa e 1hPa
        float temperatura = temperaturaAtual + variacaoTemperatura;
        float umidade = umidadeAtual + variacaoUmidade;
        float pressao = pressaoAtual + variacaoPressao;
        setMedicoes(temperatura, umidade, pressao, obterDataProximoDia());
    }

    // Obtém a data do próximo dia
    private String obterDataProximoDia() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateFormat.parse(dataAtual)); // Define a data atual
        cal.add(Calendar.DAY_OF_MONTH, 1); // Adiciona um dia
        return dateFormat.format(cal.getTime());
    }

    // Obtém a data atual
    public String getDataAtual() {
        return dataAtual;
    }
}

public class Testes {
    public static void main(String[] args) {
        // Configuração da janela principal
        JFrame frame = new JFrame("Central de Dados Climáticos");
        frame.setLayout(new GridLayout(3, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300); // Tamanho da janela
        frame.setVisible(true);

        // Criação da estação meteorológica
        WeatherStation estacaoMeteorologica = new WeatherStation();

        // Criação e registro das telas de exibição
        Display displayAtual = new CurrentConditionsDisplay();
        estacaoMeteorologica.registrarDisplay(displayAtual);

        Display displayAnterior = new PastConditionsDisplay(5);
        estacaoMeteorologica.registrarDisplay(displayAnterior);

        // Adição das telas de exibição à janela principal
        frame.add((JPanel) displayAtual);
        frame.add((JPanel) displayAnterior);

        // Botão para gerar os dados do próximo dia
        JButton proximoDiaButton = new JButton("Próximo Dia");
        proximoDiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
					estacaoMeteorologica.proximoDia();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        frame.add(proximoDiaButton);

        // Inicialização com os dados do primeiro dia
        estacaoMeteorologica.setMedicoes(20, 80, 1000, "01/01/2024");
    }
}

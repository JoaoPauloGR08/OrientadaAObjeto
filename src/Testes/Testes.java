package Testes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

// Classe que representa os dados climáticos
class DadosClimaticos {
    private float temperatura;
    private float umidade;
    private float pressao;

    public DadosClimaticos(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public float getPressao() {
        return pressao;
    }
}

// Interface para telas de exibição
interface Display {
    void update(DadosClimaticos dadosClimaticos, String data);
}

// Implementação de uma tela de exibição para as condições atuais
class DisplayCondicõesAtuais extends JPanel implements Display {
    private JLabel temperaturaLabel;
    private JLabel umidadeLabel;
    private JLabel pressaoLabel;
    private JLabel dataLabel;

    public DisplayCondicõesAtuais() {
        setBackground(Color.WHITE);
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
    public void update(DadosClimaticos dadosClimaticos, String data) {
        // Atualiza a exibição com os dados climáticos atuais e a data
        temperaturaLabel.setText("Temperatura: " + String.format("%.1f", dadosClimaticos.getTemperatura()) + "°C");
        umidadeLabel.setText("Umidade: " + String.format("%.1f", dadosClimaticos.getUmidade()) + "%");
        pressaoLabel.setText("Pressão: " + String.format("%.1f", dadosClimaticos.getPressao()) + "hPa");
        dataLabel.setText("Data: " + data);
    }
}

// Implementação de uma tela de exibição para os dados dos dias anteriores
class DisplayDiasAnteriores extends JPanel implements Display {
    private JLabel[] labels;
    private ArrayList<DadosClimaticos> dadosAnteriores;
    private String[] datas;

    public DisplayDiasAnteriores(int numDias) {
        setBackground(Color.WHITE);
        setLayout(new GridLayout(numDias, 1));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        labels = new JLabel[numDias];
        dadosAnteriores = new ArrayList<>();
        datas = new String[numDias];
        for (int i = 0; i < numDias; i++) {
            labels[i] = new JLabel();
            labels[i].setFont(new Font("Arial", Font.PLAIN, 12));
            final int index = i;
            labels[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    mostrarDetalhesDia(index);
                }
            });
            add(labels[i]);
        }
    }

    @Override
    public void update(DadosClimaticos dadosClimaticos, String data) {
        // Adiciona os dados climáticos atuais à lista de dados anteriores
        dadosAnteriores.add(new DadosClimaticos(dadosClimaticos.getTemperatura(), dadosClimaticos.getUmidade(), dadosClimaticos.getPressao()));
        // Adiciona a data atual à lista de datas
        datas[0] = data;

        // Atualiza a exibição com os dados dos dias anteriores e as datas
        for (int i = labels.length - 1; i > 0; i--) {
            labels[i].setText(labels[i - 1].getText());
        }
        labels[0].setText("Dia Atual: " + String.format("%.1f", dadosClimaticos.getTemperatura()) + "°C / " +
                String.format("%.1f", dadosClimaticos.getUmidade()) + "% / " +
                String.format("%.1f", dadosClimaticos.getPressao()) + "hPa");
    }

    // Exibe os detalhes do dia selecionado
    public void mostrarDetalhesDia(int index) {
        // Verifica se o índice está dentro dos limites da lista de dados anteriores
        if (index >= 0 && index < dadosAnteriores.size()) {
            DadosClimaticos dados = dadosAnteriores.get(index);
            String dataSelecionada = datas[index];
            // Atualiza os displays com os dados do dia selecionado
            for (Display display : displays) {
                display.update(dados, dataSelecionada);
            }
        }
    }
}

// Classe que representa uma estação meteorológica
class EstacaoMeteorologica {
    private ArrayList<Display> displays;
    private ArrayList<DadosClimaticos> dadosAnteriores;
    private String[] datas;
    private String dataAtual;

    public EstacaoMeteorologica() {
        displays = new ArrayList<>();
        dadosAnteriores = new ArrayList<>();
        datas = new String[5];
        // Inicializa a data atual como "01/01/2024"
        dataAtual = "01/01/2024";
    }

    // Registra uma nova tela de exibição
    public void registrarDisplay(Display display) {
        displays.add(display);
    }

    // Define novos valores para temperatura, umidade e pressão e notifica os displays
    public void setMedicoes(float temperatura, float umidade, float pressao) {
        // Adiciona os dados climáticos atuais à lista de dados anteriores
        dadosAnteriores.add(new DadosClimaticos(temperatura, umidade, pressao));

        // Atualiza os displays com os dados climáticos atuais e a data atual
        for (Display display : displays) {
            display.update(new DadosClimaticos(temperatura, umidade, pressao), dataAtual);
        }
    }

    // Exibe os detalhes da data selecionada
    public void mostrarDetalhesData(String data) {
        // Verifica se a data selecionada está na lista de datas
        if (dataAtual.equals(data)) {
            // Se a data selecionada for a data atual, mostra os dados atuais
            for (Display display : displays) {
                display.update(dadosAnteriores.get(0), dataAtual);
            }
        } else {
            // Se a data selecionada estiver na lista de datas anteriores, encontra os dados correspondentes
            for (int i = 0; i < datas.length; i++) {
                if (datas[i] != null && datas[i].equals(data)) {
                    DadosClimaticos dados = dadosAnteriores.get(i);
                    // Atualiza os displays com os dados do dia selecionado
                    for (Display display : displays) {
                        display.update(dados, data);
                    }
                    return;
                }
            }
            // Se a data selecionada não estiver na lista de datas anteriores, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Dados para a data selecionada não encontrados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

// Classe que representa a estação central de monitoramento climático
public class Testes {
    public static void main(String[] args) {
        EstacaoMeteorologica estacaoMeteorologica = new EstacaoMeteorologica();

        // Cria e registra telas de exibição
        DisplayCondicõesAtuais displayCondicõesAtuais = new DisplayCondicõesAtuais();
        DisplayDiasAnteriores displayDiasAnteriores = new DisplayDiasAnteriores(5);

        JFrame frame = new JFrame("Central de Dados Climáticos");
        frame.setLayout(new GridLayout(2, 1));
        frame.add(displayCondicõesAtuais);
        frame.add(displayDiasAnteriores);

        // Botão para simular mudança de dados climáticos para cada dia
        JButton proximoDiaButton = new JButton("Próximo Dia");
        proximoDiaButton.setFont(new Font("Arial", Font.BOLD, 16));
        proximoDiaButton.setBackground(new Color(0, 102, 0));
        proximoDiaButton.setForeground(Color.WHITE);
        proximoDiaButton.setFocusPainted(false);
        proximoDiaButton.addActionListener(new ActionListener() {
            private float temperatura = 20;
            private float umidade = 60;
            private float pressao = 1013;

            private int contadorDias = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Gerar valores aleatórios para temperatura, umidade e pressão
                Random rand = new Random();
                float variacaoTemperatura = rand.nextFloat() * 5 - 2.5f;
                float variacaoUmidade = rand.nextFloat() * 10 - 5;
                float variacaoPressao = rand.nextFloat() * 4 - 2;

                temperatura += variacaoTemperatura;
                umidade += variacaoUmidade;
                pressao += variacaoPressao;

                // Garante que os valores fiquem dentro do intervalo desejado
                temperatura = Math.min(Math.max(temperatura, -5), 40);
                umidade = Math.min(Math.max(umidade, 0), 100);
                pressao = Math.min(Math.max(pressao, 980), 1040);

                // Atualiza os dados climáticos e o título do frame
                estacaoMeteorologica.setMedicoes(temperatura, umidade, pressao);
                frame.setTitle("Central de Dados Climáticos - Dia " + contadorDias++);
            }
        });

        frame.add(proximoDiaButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        estacaoMeteorologica.registrarDisplay(displayCondicõesAtuais);
        estacaoMeteorologica.registrarDisplay(displayDiasAnteriores);
    }
}

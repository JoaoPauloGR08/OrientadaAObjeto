package EstudoDeCaso3;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

public class Tela {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		boolean auxEC = false;
		
		// Cliente
		
		JLabel idCliente = new JLabel("Id do Cliente");
		JTextField txIdCliente = new JTextField();
		
		JLabel nomeCliente = new JLabel("Nome do Cliente");
		JTextField txNomeCliente = new JTextField();
		
		JLabel loginCliente = new JLabel("Login");
		JTextField txLoginCliente = new JTextField();
		
		JLabel senhaCliente = new JLabel("Senha");
		JPasswordField txSenhaCliente = new JPasswordField();
		
		// Pedido
		
		JList<Produto> idProdutoPedido = new JList<Produto>();
		JTextField txIdProdutoPedido = new JTextField();
		
		JLabel precoPedido = new JLabel("Valor do Pedido");
		JTextField txPrecoPedido = new JTextField();
		
		// Componente
		
		JLabel idComp = new JLabel("Id Componente");
		JTextField txIdComp = new JTextField();
		
		JLabel nomeComp = new JLabel("Nome Componente");
		JTextField txNomeComp = new JTextField();
		
		// Produto
		
		JLabel nomeProduto = new JLabel("Nome do Produto");
		JTextField txNomeProduto = new JTextField();
		
		JLabel idProduto = new JLabel("Id do Produto");
		JTextField txIdProduto = new JTextField();
		
		JList<ComponenteFabrica> compProduto = new JList<ComponenteFabrica>();
		
		// Botões
		
		JToggleButton botaoAddMais = new JToggleButton("Adicionar mais");
		
		
		// Criar tela fazer pedido
		
		Cliente cliente = new Cliente();
		Pedido ped = new Pedido();
		
		JPanel lPedido = new JPanel();
		lPedido.setLayout(new GridLayout(2,2));
		lPedido.add(loginCliente);
		lPedido.add(txLoginCliente);
		lPedido.add(senhaCliente);
		lPedido.add(txSenhaCliente);
		
		JPanel mPedido = new JPanel();
		mPedido.setLayout(new GridLayout(2,1));
		mPedido.add(nomeProduto);
		mPedido.add(txNomeProduto);
		
		JOptionPane.showMessageDialog(null, lPedido);
		
		JTable tabela = new JTable();
		
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

			modelo.addColumn("Id");
			modelo.addColumn("Nome");
	        
	        for (int i = 0; i < tabela.getColumnCount(); i++) {
	            Class<?> columnClass = tabela.getColumnClass(i);
	            tabela.setDefaultEditor(columnClass, null);
	        }
		if(auxEC == true) {
			
			if(cliente.testeLogin(txLoginCliente.getText(), new String(txSenhaCliente.getPassword()))) {
				JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
				
				JFrame frame = new JFrame("Tabela de Produtos");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(new JScrollPane(tabela));
		        frame.pack();
		        frame.setVisible(true);
				
				JOptionPane.showMessageDialog(lPedido, mPedido);
				
				frame.setVisible(false);
				
				ped.setCliente(cliente);
				
				JOptionPane.showMessageDialog(null, "Pedido feito com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
			}
		
		}
		
	}
	
}

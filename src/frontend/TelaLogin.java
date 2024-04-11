package frontend;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin {

	public static void main(String[] args) {
		
		// Criar os componentes
		
		JLabel usuario = new JLabel("Usuário");
		JTextField txUsuario = new JTextField();
		
		JLabel senha = new JLabel("Senha");
		JPasswordField txSenha = new JPasswordField();
		
		txSenha.setToolTipText("Insira uma senha de 8 digitos");
		
		// Agrupar os componentes
		
		Object[] componentes = {usuario, txUsuario, senha, txSenha};
		
		
		// Criar janela
		
		JOptionPane.showMessageDialog(null, componentes);
		
		Cliente cliente = new Cliente();
		
		if(cliente.verificarLogin(txUsuario.getText(), new String(txSenha.getPassword()))) {
			JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
		}
		
	}
	
}

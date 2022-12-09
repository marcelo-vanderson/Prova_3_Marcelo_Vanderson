package persistencia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Time;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import negocio.Usuario;
import persistencia.UsuarioDAO;

public class CadastrarNovoBolao extends JFrame {

	public CadastrarNovoBolao() {
		


		JButton salvar = new JButton("proxima tela");
		salvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == salvar) {
					QuartasdeFinal q = new QuartasdeFinal();

					
					
				}

			}
		});

		salvar.setBackground(Color.green);
		add(salvar);
		setTitle("proxima tela");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setResizable(false);
		setBackground(Color.yellow);
		setVisible(true);
	}

}

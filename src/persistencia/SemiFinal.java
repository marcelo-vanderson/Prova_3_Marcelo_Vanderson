package persistencia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import negocio.Usuario;

public class SemiFinal extends JFrame {

	public SemiFinal() {

		// equipe1 e placar1
		JLabel lblequipe1 = new JLabel("equipe1");
		lblequipe1.setEnabled(true);
		add(lblequipe1);
		JTextField txtequipe1 = new JTextField(5);
		add(txtequipe1);

		JLabel lblplacar1 = new JLabel("placar");
		lblplacar1.setEnabled(true);
		add(lblplacar1);
		JTextField txtplacar1 = new JTextField(5);
		add(txtplacar1);

		// equipe2 e placar2
		JLabel lblequipe2 = new JLabel("equipe2");
		lblequipe2.setEnabled(true);
		add(lblequipe2);
		JTextField txtequipe2 = new JTextField(5);
		add(txtequipe2);

		JLabel lblplacar2 = new JLabel("placar2");
		lblplacar2.setEnabled(true);
		add(lblplacar2);
		JTextField txtplacar2 = new JTextField(5);
		add(txtplacar2);

		// equipe3 e placar3
		JLabel lblequipe3 = new JLabel("equipe3");
		lblequipe3.setEnabled(true);
		add(lblequipe3);
		JTextField txtequipe3 = new JTextField(5);
		add(txtequipe3);

		JLabel lblplacar3 = new JLabel("placar3");
		lblplacar3.setEnabled(true);
		add(lblplacar3);
		JTextField txtplacar3 = new JTextField(5);
		add(txtplacar3);

		// equipe4 e placar4
		JLabel lblequipe4 = new JLabel("equipe4");
		lblequipe4.setEnabled(true);
		add(lblequipe4);
		JTextField txtequipe4 = new JTextField(5);
		add(txtequipe4);

		JLabel lblplacar4 = new JLabel("placar4");
		lblplacar4.setEnabled(true);
		add(lblplacar4);
		JTextField txtplacar4 = new JTextField(5);
		add(txtplacar4);

		setTitle("Semifinal");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setBackground(Color.BLUE);
		setResizable(false);
		setVisible(true);

		JButton atualizar = new JButton();
		atualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == atualizar) {
					Final f = new Final();
					Usuario usuario = new Usuario();
					UsuarioDAO dao = new UsuarioDAO();

					usuario.setEquipe1(txtequipe1.getText());
					usuario.setPlacar1(Integer.parseInt(txtplacar1.getText()));

					usuario.setEquipe2(txtequipe2.getText());
					usuario.setPlacar2(Integer.parseInt(txtplacar2.getText()));

					usuario.setEquipe3(txtequipe3.getText());
					usuario.setPlacar3(Integer.parseInt(txtplacar3.getText()));

					usuario.setEquipe4(txtequipe4.getText());
					usuario.setPlacar4(Integer.parseInt(txtplacar4.getText()));

					dao.atualizar(usuario);
					dao.Conexao();

				}

			}
		});
		atualizar.setBackground(Color.green);
		atualizar.setText("atualizar");
		add(atualizar);
	}
}

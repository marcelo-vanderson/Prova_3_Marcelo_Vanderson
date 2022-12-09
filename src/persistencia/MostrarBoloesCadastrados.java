package persistencia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import negocio.Usuario;
import persistencia.UsuarioDAO;

public class MostrarBoloesCadastrados extends JFrame {

	public MostrarBoloesCadastrados() {

		// equipe1 e placar1
		JLabel lblnome = new JLabel("nome");
		lblnome.setEnabled(true);
		add(lblnome);
		JTextField txtnome = new JTextField(5);
		add(txtnome);

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

		// equipe5 e placar5
		JLabel lblequipe5 = new JLabel("equipe5");
		lblequipe5.setEnabled(true);
		add(lblequipe5);
		JTextField txtequipe5 = new JTextField(5);
		add(txtequipe5);

		JLabel lblplacar5 = new JLabel("placar5");
		lblplacar5.setEnabled(true);
		add(lblplacar5);
		JTextField txtplacar5 = new JTextField(5);
		add(txtplacar5);

		// equipe6 e placar6
		JLabel lblequipe6 = new JLabel("equipe6");
		lblequipe6.setEnabled(true);
		add(lblequipe6);
		JTextField txtequipe6 = new JTextField(5);
		add(txtequipe6);

		JLabel lblplacar6 = new JLabel("placar6");
		lblplacar6.setEnabled(true);
		add(lblplacar6);
		JTextField txtplacar6 = new JTextField(5);
		add(txtplacar6);
		setTitle("Quartas de Final");

		// equipe7 e placar7
		JLabel lblequipe7 = new JLabel("equipe7");
		lblequipe7.setEnabled(true);
		add(lblequipe7);
		JTextField txtequipe7 = new JTextField(5);
		add(txtequipe7);

		JLabel lblplacar7 = new JLabel("placar7");
		lblplacar7.setEnabled(true);
		add(lblplacar7);
		JTextField txtplacar7 = new JTextField(5);
		add(txtplacar7);
		setSize(800, 600);

		// equipe8 e placar8
		JLabel lblequipe8 = new JLabel("equipe8");
		lblequipe8.setEnabled(true);
		add(lblequipe8);
		JTextField txtequipe8 = new JTextField(5);
		add(txtequipe8);

		JLabel lblplacar8 = new JLabel("placar8");
		lblplacar8.setEnabled(true);
		add(lblplacar8);
		JTextField txtplacar8 = new JTextField(5);
		add(txtplacar8);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton consulta = new JButton();
		consulta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == consulta) {

					MostrarBoloesCadastrados m = new MostrarBoloesCadastrados();
					Usuario usuario = new Usuario();
					UsuarioDAO dao = new UsuarioDAO();

					usuario.setNome(txtnome.getText());

					usuario.setEquipe1(txtequipe1.getText());
					usuario.setPlacar1(Integer.parseInt(txtplacar1.getText()));

					usuario.setEquipe2(txtequipe2.getText());
					usuario.setPlacar2(Integer.parseInt(txtplacar2.getText()));

					usuario.setEquipe3(txtequipe3.getText());
					usuario.setPlacar3(Integer.parseInt(txtplacar3.getText()));

					usuario.setEquipe4(txtequipe4.getText());
					usuario.setPlacar4(Integer.parseInt(txtplacar4.getText()));

					usuario.setEquipe5(txtequipe5.getText());
					usuario.setPlacar5(Integer.parseInt(txtplacar5.getText()));

					usuario.setEquipe6(txtequipe6.getText());
					usuario.setPlacar6(Integer.parseInt(txtplacar6.getText()));

					usuario.setEquipe7(txtequipe7.getText());
					usuario.setPlacar7(Integer.parseInt(txtplacar7.getText()));

					usuario.setEquipe8(txtequipe8.getText());
					usuario.setPlacar8(Integer.parseInt(txtplacar8.getText()));

					dao.consulta();
					dao.Conexao();

				}

			}
		});
		consulta.setBackground(Color.green);
		consulta.setText("inserir");
		add(consulta);
		
		setTitle("mostrar boloes cadastrados");
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setBackground(Color.yellow);
		setVisible(true);

	}
}

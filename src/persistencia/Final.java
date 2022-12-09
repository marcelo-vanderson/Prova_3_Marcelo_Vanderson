package persistencia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Final extends JFrame implements ActionListener {
	JLabel label_7 = new JLabel();
	JTextField nome_7 = new JTextField(5);
	JLabel label = new JLabel();
	JTextField nome = new JTextField(5);
	JLabel label2 = new JLabel();
	JTextField nome2 = new JTextField(5);
	JLabel label3 = new JLabel();
	JTextField nome3 = new JTextField(5);
	JLabel label4 = new JLabel();
	JButton enviar4 = new JButton();

	public Final() {

//		label.setLayout(new GridLayout());

		label.setText("Selecao");
		nome.setEditable(true);
		add(label);
		add(nome);

		label2.setText("Placar");
		nome2.setEditable(true);
		add(label2);
		add(nome2);

		label3.setText("Selecao");
		nome3.setEditable(true);
		add(label3);
		add(nome3);

		label4.setText("Placar");
		nome_7.setEditable(true);
		add(label4);
		add(nome_7);

		enviar4.setBackground(Color.green);
		enviar4.setText("Enviar");
		add(enviar4, BorderLayout.NORTH);
		enviar4.addActionListener(this);

		setTitle("Final");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setBackground(Color.BLUE);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==enviar4) {
			
			
			
		}
	}
}

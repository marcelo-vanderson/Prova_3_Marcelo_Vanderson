package persistencia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame implements ActionListener {
	JButton b1 = new JButton("cadastrar novo bolao");
	JButton b2 = new JButton("mostrar bolao ");
	JButton b3 = new JButton("importar bolao");
	JButton b4 = new JButton("exportar bolao");

	public JanelaPrincipal() {

		b1.setSize(50, 50);
		add(b1);
		b1.addActionListener(this);

		b2.setSize(50, 50);
		add(b2);
		b2.addActionListener(this);

		b3.setSize(50, 50);
		add(b3);
		b3.addActionListener(this);

		b4.setSize(50, 50);
		add(b4);
		b4.addActionListener(this);

		setTitle("Frame inicial");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setResizable(false);
		setBackground(Color.GRAY);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			CadastrarNovoBolao b1 = new CadastrarNovoBolao();
			dispose();
		} else if (e.getSource() == b2) {
			MostrarBoloesCadastrados b2 = new MostrarBoloesCadastrados();
			dispose();
		} else if (e.getSource() == b3) {
			ImportarBoloes b3 = new ImportarBoloes();
			dispose();
		} else if (e.getSource() == b4) {
			ExportarBoloes b4 = new ExportarBoloes();
			dispose();
		}

		{

		}
	}
}

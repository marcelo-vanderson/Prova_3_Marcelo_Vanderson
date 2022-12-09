package persistencia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExportarBoloes extends JFrame {

	JLabel label = new JLabel();

	public ExportarBoloes() {
//		label.setText("exportar boloes");
		label.setSize(new Dimension(100, 100));
		label.setFont(new Font(null));
		add(label);

		setTitle("exportar boloes");
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setBackground(Color.yellow);
		setVisible(true);

	}
}

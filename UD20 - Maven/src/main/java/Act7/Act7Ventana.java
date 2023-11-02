package Act7;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;

public class Act7Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	boolean type = false;

	final double PESETAS = 166.386;
	
	private static final DecimalFormat formato_decimal = new DecimalFormat("0.00");


	/**
	 * Create the frame.
	 */
	public Act7Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 125);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(10, 23, 134, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(154, 20, 58, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblResultadoAPesetas = new JLabel("Resultado");
		lblResultadoAPesetas.setBounds(10, 51, 134, 14);
		contentPane.add(lblResultadoAPesetas);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(154, 47, 58, 20);
		contentPane.add(textField_1);
		
		final JButton btnEurosAPesetas = new JButton("Euros a Pesetas");
		
		btnEurosAPesetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					textField_1.setText(String.valueOf(formato_decimal.format(Double.parseDouble(textField.getText()) * PESETAS)));

				} else {
					JOptionPane.showMessageDialog(null, "Introduce un valor monetario!");
				}
			}
		});
		
		btnEurosAPesetas.setBounds(222, 18, 174, 25);
		getContentPane().add(btnEurosAPesetas);


		final JButton btnPesetasAEuros = new JButton("Pesetas a Euros");
		btnPesetasAEuros.setBounds(222, 18, 174, 25);
		
		btnPesetasAEuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					textField_1.setText(String.valueOf(formato_decimal.format(Double.parseDouble(textField.getText()) / PESETAS)));

				} else {
					JOptionPane.showMessageDialog(null, "Introduce un valor monetario!");
				}
			}
		});
		
		getContentPane().add(btnPesetasAEuros);
		
		JButton btnCambiarDeMoneda = new JButton("Cambiar de moneda");
		btnCambiarDeMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!type) 
				{
					btnEurosAPesetas.setVisible(false);
					btnPesetasAEuros.setVisible(true);
					type = true;
				}
				else
				{
					type = false;
					btnEurosAPesetas.setVisible(true);
					btnPesetasAEuros.setVisible(false);
				}
			}
		});
		btnCambiarDeMoneda.setBounds(222, 47, 174, 23);
		contentPane.add(btnCambiarDeMoneda);
	}

}

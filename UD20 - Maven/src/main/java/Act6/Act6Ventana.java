package Act6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Act6Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;



	/**
	 * Create the frame.
	 */
	public Act6Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura (Metros)");
		lblNewLabel.setBounds(10, 45, 101, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(121, 45, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPesokg = new JLabel("Peso (Kg)");
		lblPesokg.setBounds(250, 45, 68, 20);
		contentPane.add(lblPesokg);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(328, 45, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(217, 95, 114, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					if (textField_1.getText().length() > 0) {
						textField_2.setText(String.valueOf(
								Math.round(
										((Double.parseDouble(textField_1.getText()))) / (Math.pow(Double.parseDouble(textField.getText()) , 2))
										)));
					} else {
						JOptionPane.showMessageDialog(null, "Introduce un peso!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Introduce una altura!");
				}
			}
		});
		btnNewButton.setBounds(86, 94, 121, 23);
		contentPane.add(btnNewButton);
	}

}

package Act1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Act1Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_2;

	/**
	 * Create the frame.
	 */
	public Act1Ventana() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(142, 87, 138, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Cambiar tamaño");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int lblNewLabel = Integer.parseInt(textField.getText());
				int lblNewLabel_1 = Integer.parseInt(textField.getText());
				textField.setBounds(130, 66, lblNewLabel, lblNewLabel_1);
			}
		});
		
		btnNewButton.setBounds(142, 136, 138, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("Escribe un tamaño: ");
		lblNewLabel_2.setBounds(142, 62, 138, 14);
		contentPane.add(lblNewLabel_2);
		
		
	}

}

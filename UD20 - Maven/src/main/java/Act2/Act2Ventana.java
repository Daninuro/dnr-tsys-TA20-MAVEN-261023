package Act2;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Act2Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Act2Ventana() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Has pulsado el ");
		lblNewLabel.setBounds(10, 59, 89, 24);
		contentPane.add(lblNewLabel);
		
		final JLabel lblbtn1o2 = new JLabel("");
		lblbtn1o2.setBounds(93, 59, 198, 24);
		contentPane.add(lblbtn1o2);
		
		
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(93, 94, 89, 23);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblbtn1o2.setText(" Botón 1");
			}
		});
		

		
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(202, 94, 89, 23);
		contentPane.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblbtn1o2.setText(" Botón 2");
			}
		});

		

		
		
	}

}

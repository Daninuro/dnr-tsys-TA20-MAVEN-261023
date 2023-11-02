package Act3;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Act3Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int count1=0, count2=0;

	/**
	 * Create the frame.
	 */
	public Act3Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblBoton1 = new JLabel("Boton 1:");
		lblBoton1.setBounds(10, 42, 237, 14);
		contentPane.add(lblBoton1);
		
		final JLabel lblBoton2 = new JLabel("Boton 2:");
		lblBoton2.setBounds(10, 67, 237, 14);
		contentPane.add(lblBoton2);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(257, 36, 89, 23);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {		

			public void actionPerformed(ActionEvent arg0) {
				count1++;
				lblBoton1.setText("Has pulsado el boton 1: " +  count1 + " veces");
			}
		});
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(257, 61, 89, 23);
		contentPane.add(btn2);
		
		JLabel lblNewLabel = new JLabel("Pulsa el boton para sumar");
		lblNewLabel.setBounds(239, 11, 166, 14);
		contentPane.add(lblNewLabel);
		btn2.addActionListener(new ActionListener() {		

			public void actionPerformed(ActionEvent arg0) {
				count2++;
				lblBoton2.setText("Has pulsado el boton 2: " +  count2 + " veces");
			}
		});
		
	}

}

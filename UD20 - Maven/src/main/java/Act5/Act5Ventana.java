package Act5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Act5Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Act5Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 46, 414, 204);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.setBounds(156, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		add(btnNewButton);

		textArea.addMouseListener(new MouseAdapter() {
			//Cuando entra
	        public void mouseEntered(MouseEvent e) {
	        	textArea.setText(textArea.getText() + "ENTRADO EN EL COMPONENTE ");
	        }
	        //Cuando sale
	        public void mouseExited(MouseEvent e) {
	        	textArea.setText(textArea.getText() + "SALIDO DEL COMPONENTE ");
	        }
	    });
		

		
		
	}

}

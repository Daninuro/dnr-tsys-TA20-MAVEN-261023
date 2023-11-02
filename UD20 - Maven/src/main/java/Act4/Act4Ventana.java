package Act4;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Act4Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Act4Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setBounds(10, 16, 71, 14);
		contentPane.add(lblNewLabel);
		
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		
		textArea.setText("Texto Inicial \n");
		textArea.setBounds(91, 11, 333, 239);
		contentPane.add(textArea);
		
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent arg0) {
				resize(arg0);
			}

			private void resize(WindowEvent e) {
				//minimizada
				if ((e.getNewState() & Frame.ICONIFIED) == Frame.ICONIFIED){
					textArea.setText(textArea.getText() + "Ventana Minimizada \n");	
				}
				// maximizada
				else if ((e.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH){
					textArea.setText(textArea.getText() + "Ventana Maximizada \n");	
				}
				
			}
		});
	}
}

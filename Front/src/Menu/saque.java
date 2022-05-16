package Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class saque extends JFrame {

	private JPanel contentPane;
	private JTextField txtR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					saque frame = new saque();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public saque() {
		setTitle("SAQUE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 217, 134);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EFETUAR SAQUE NO VALOR DE:");
		lblNewLabel.setBounds(22, 11, 178, 14);
		contentPane.add(lblNewLabel);
		
		txtR = new JTextField();
		txtR.setText("R$");
		txtR.setBounds(22, 36, 127, 20);
		contentPane.add(txtR);
		txtR.setColumns(10);
		
		JButton btnNewButton = new JButton("EFETUAR");
		btnNewButton.setBounds(22, 65, 89, 23);
		contentPane.add(btnNewButton);
	}

}

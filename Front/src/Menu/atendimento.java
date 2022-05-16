package Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class atendimento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atendimento frame = new atendimento();
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
	public atendimento() {
		setTitle("ATENDIMENTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 237, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Cliente");
		lblNewLabel.setBounds(26, 11, 91, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNDaConta = new JLabel("N\u00BA da Conta do Cliente");
		lblNDaConta.setBounds(26, 33, 119, 14);
		contentPane.add(lblNDaConta);
		
		JButton btnNewButton = new JButton("SAQUE");
		btnNewButton.setBounds(36, 58, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnDeposito = new JButton("DEPOSITO");
		btnDeposito.setBounds(36, 91, 89, 23);
		contentPane.add(btnDeposito);
		
		JButton btnNewButton_1_1 = new JButton("EXTRATO");
		btnNewButton_1_1.setBounds(36, 124, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("SAIR");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBounds(36, 158, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
	}

}

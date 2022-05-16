package Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JButton;

public class relatorio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					relatorio frame = new relatorio();
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
	public relatorio() {
		setTitle("RELATORIO DO ATENDIMENTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEMPO NA FILA:");
		lblNewLabel.setBounds(25, 39, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHistoricoDoAtendimento = new JLabel("HISTORICO DO ATENDIMENTO:");
		lblHistoricoDoAtendimento.setBounds(25, 64, 160, 14);
		contentPane.add(lblHistoricoDoAtendimento);
		
		JLabel lblHoraDeEntrada = new JLabel("HORA DE ENTRADA:");
		lblHoraDeEntrada.setBounds(25, 14, 103, 14);
		contentPane.add(lblHoraDeEntrada);
		
		JLabel lblNewLabel_4 = new JLabel("tempo na fila");
		lblNewLabel_4.setBounds(107, 39, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("hora de entrada");
		lblNewLabel_4_1.setBounds(129, 14, 86, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JList list = new JList();
		list.setBounds(25, 87, 160, 83);
		contentPane.add(list);
		
		JLabel lblTempoDoAtendimento = new JLabel("TEMPO DO ATENDIMENTO:");
		lblTempoDoAtendimento.setBounds(25, 181, 140, 14);
		contentPane.add(lblTempoDoAtendimento);
		
		JLabel lblNewLabel_4_2 = new JLabel("tempo do atendimento");
		lblNewLabel_4_2.setBounds(159, 181, 115, 14);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblHoraDeSaida = new JLabel("HORA DE SAIDA:");
		lblHoraDeSaida.setBounds(25, 200, 103, 14);
		contentPane.add(lblHoraDeSaida);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("hora de saida");
		lblNewLabel_4_1_1.setBounds(116, 200, 77, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton = new JButton("ENCERRAR");
		btnNewButton.setBounds(58, 225, 89, 23);
		contentPane.add(btnNewButton);
	}
}

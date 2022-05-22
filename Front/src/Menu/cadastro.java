package Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNo;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastro frame = new cadastro();
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
	public cadastro() {
		setTitle("CADASTRO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 210, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 33, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CONTA CORRENTE:");
		lblNewLabel_1.setBounds(10, 64, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 86, 164, 20);
		contentPane.add(textField_1);
		
		lblNewLabel_2 = new JLabel("PRIORIDADE:");
		lblNewLabel_2.setBounds(10, 122, 109, 14);
		contentPane.add(lblNewLabel_2);
		
		rdbtnNewRadioButton = new JRadioButton("SIM");
		rdbtnNewRadioButton.setBounds(77, 113, 46, 31);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNo = new JRadioButton("N\u00C3O");
		rdbtnNo.setBounds(125, 113, 52, 29);
		contentPane.add(rdbtnNo);
		
		btnNewButton = new JButton("SALVAR");
		btnNewButton.setBounds(38, 147, 104, 23);
		contentPane.add(btnNewButton);
	}

	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}

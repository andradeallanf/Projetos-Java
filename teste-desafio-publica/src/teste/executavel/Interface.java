package teste.executavel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(111, 87, 48, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(170, 84, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("Esporte");
		lblNewLabel_1.setBounds(111, 112, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 115, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMensagem = DefaultComponentFactory.getInstance().createTitle("Game Records");
		lblMensagem.setForeground(new Color(204, 0, 0));
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMensagem.setBounds(141, 35, 155, 23);
		contentPane.add(lblMensagem);
		
		JButton btnNewButton = new JButton("O K");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText("Olá, mundo!");
			}
		});
		btnNewButton.setBounds(170, 164, 96, 23);
		contentPane.add(btnNewButton);
	}
}

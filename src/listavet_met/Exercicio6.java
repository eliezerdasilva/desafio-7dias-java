package desafio7diasjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deqdd {

	/**
	 * @author Eliezer da silva
	 * @data 10/10/2022
	 * @version 1.0
	 */
	private JFrame frame;
	private JTextField textField;
	private JTextField txtnota1;
	private JTextField txtnota2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	
	/*
	 * . Faça uma janela (JFrame) como se pede:
3.1. Quatro campos de texto (JTextField): um campo de texto representa o nome do estudante e
outros três representam as notas de um(a) estudante;
3.2. Quatro JLabels para cada campo de texto, representando o que cada campo de texto é,
respectivamente (nome, nota 1, nota 2, nota 3);
3.3. Um botão (JButton) com texto “CALCULAR”
3.4. Ao clicar no botão, o seu sistema deve calcular a média do estudante e exibir o resultado em
uma caixa de diálogo com o showMessageDialog (JOptionPane)

	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deqdd window = new deqdd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public deqdd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M\u00E9dia ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(172, 30, 108, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(112, 75, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtnota1 = new JTextField();
		txtnota1.setBounds(264, 75, 86, 20);
		frame.getContentPane().add(txtnota1);
		txtnota1.setColumns(10);
		
		txtnota2 = new JTextField();
		txtnota2.setBounds(264, 117, 86, 20);
		frame.getContentPane().add(txtnota2);
		txtnota2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(37, 78, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(264, 161, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nota1:");
		lblNewLabel_2.setBounds(208, 78, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota2:");
		lblNewLabel_3.setBounds(208, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nota3:");
		lblNewLabel_4.setBounds(208, 164, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton calcula = new JButton("Calcular");
		calcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textField.getText();
				String  n1 = textField_1.getText();
				String  n2 = txtnota1.getText();
				String  n3 = txtnota2.getText();
				
			
				Integer  nota1 = Integer.valueOf ( n1 );
				Integer  nota2 = Integer.valueOf ( n2 );
				Integer  nota3 = Integer.valueOf ( n3 );
				Integer  media= (nota3+ nota2 +nota1)/3;
				if (media>6) {
					
					JOptionPane.showMessageDialog(null, "aluno: " + nome + "\n média:"+ media+ "\n Aprovado" );
					
				}if(media<6 && media>=4) {
					JOptionPane.showMessageDialog(null, "aluno: " + nome + "\n média:"+ media+ "\n Recuperação" );
				}if (media<4) {
					JOptionPane.showMessageDialog(null, "aluno: " + nome + "\n média:"+ media+ "\n reprovado" );
					
				}
				
				
				
			}
		});
		calcula.setBounds(274, 212, 89, 23);
		frame.getContentPane().add(calcula);
	}
}

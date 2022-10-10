import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Triangulo extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JButton btnNewButton;

	/**
	 * @author Eliezer da silva
	 * @data 09/10/2022
	 * @version 1.0
	 */
	
	/*
	 * 
	 * Exercicio 2 de swing.
	 * 
	 * Lista Fixação1
	 * 
	 * Faça uma janela (JFrame) com três campos de texto (inputs) - que representam os lados de um
triângulo - e apenas um botão. Programe o botão para que, quando clicado, verifique que tipo de
triângulo é representado pelos lados inseridos - triângulo equilátero (três lados iguais), isósceles
(dois lados iguais) ou escaleno (três lados diferentes).

	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
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
	public Triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(25, 105, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(154, 105, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setText("");
		txt3.setBounds(282, 105, 86, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		btnNewButton = new JButton("Verificar qual tri\u00E2ngulo \u00E9:");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  l1 = txt1.getText();
				String  l2 = txt2.getText();
				String  l3 = txt3.getText();
				
				if (! l1 . isEmpty () && ! l2 . isEmpty () && ! l3 . isEmpty ()) {
					Integer  numero1 = Integer.valueOf ( l1 );
					Integer  numero2 = Integer.valueOf ( l2 );
					Integer  numero3 = Integer.valueOf ( l3 );
					
					if ( numero1 == numero2 && numero1 == numero3 && numero2 == numero3 ) {
						JOptionPane . showMessageDialog ( null , "Todos os lados são iguais \n\b O triângulo é: Equilátero" );
					}
					else 
						if ( numero1 == numero2 || numero1 == numero3 || numero2 == numero3 ) {
						JOptionPane . showMessageDialog ( null , "Dois dos lados do triângulo é igual \b\n O triângulo é triângulo é: Isoceles" );
					}
						else 
							if ( numero1 != numero2 && numero1 != numero3 && numero2 != numero3 ) {
						JOptionPane . showMessageDialog ( null , "O angulo dos três lados do triângulo é diferete \b \n o triângulo é : Escaleno" );
						
					}
				}
				
			}
			
			
		});
		btnNewButton.setBounds(25, 187, 208, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Informe o ângulo de cada lado do tri\u00E2ngulo ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(37, 39, 334, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("valor 1:");
		lblNewLabel_1.setBounds(41, 85, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("valor 2:");
		lblNewLabel_2.setBounds(169, 85, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("valor 3:");
		lblNewLabel_3.setBounds(295, 85, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
}

package desafio7diasjava;

/**
 * @author Eliezerdasilva
 * @date 11/10/2022
 * @version 1.0
 * 
 */
 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MaiorMenor extends JFrame {

	private JPanel num;
	private JTextField textField_1;
	private JTextField numeroInfo;
	private JTextField maiorNum;
	private JTextField menorNum;
	ArrayList<Double> lista = new ArrayList();

	
	/*
	 * 5. Faça uma janela (JFrame) como se pede:
5.1. Crie três campos de texto (JTextField): um campo para cadastrar um número e outros dois
para mostrar o maior e o menor número;
5.1.1. O campo de maior e menor não podem ser editáveis - você deve procurar a
propriedade para desativar no menu de propriedades do WindowBuilder
5.2. Três labels (JLabel) para identificar cada campo de texto;
5.3. Um botão (JButton) com texto “CADASTRAR” e outro botão (JButton) com texto
“EXIBIR”
5.4. Ao clicar no botão “CADASTRAR” você deve inserir o número em uma lista (ArrayList)
de Double.
5.5. Ao clicar no botão “EXIBIR” você deve exibir o maior e o menor número - que foram
armazenados na lista - nos respectivos campos de texto.


	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaiorMenor frame = new MaiorMenor();
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
	public MaiorMenor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 228);
		num = new JPanel();
		num.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(num);
		num.setLayout(null);

		numeroInfo = new JTextField();
		numeroInfo.setBounds(35, 62, 114, 19);
		num.add(numeroInfo);
		numeroInfo.setColumns(10);

		JButton Cadastrar = new JButton("cadastre");
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lista.add(Double.valueOf(numeroInfo.getText()));

			}
		});
		Cadastrar.setBounds(35, 92, 108, 25);
		num.add(Cadastrar);


		JButton exibir = new JButton("Exibir");
		exibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double maior = Double.MIN_VALUE;
				Double menor = Double.MAX_VALUE;

				for (int i = 0; i < lista.size(); i++) {
					if (maior < lista.get(i)){
						maior = lista.get(i);
						maiorNum.setText(String.valueOf(maior));
					}
					if (menor > lista.get(i)) {
						menor = lista.get(i);
						menorNum.setText(String.valueOf(menor));
					}
				}
			}
		});
		exibir.setBounds(190, 42, 108, 25);
		num.add(exibir);

		

		JLabel lblNewLabel = new JLabel("Maior");
		lblNewLabel.setBounds(200, 78, 70, 15);
		num.add(lblNewLabel);

		JLabel lblMenor = new JLabel("Menor");
		lblMenor.setBounds(200, 124, 70, 15);
		num.add(lblMenor);
		
		maiorNum = new JTextField();
		maiorNum.setEditable(false);
		maiorNum.setColumns(10);
		maiorNum.setBounds(190, 148, 114, 19);
		num.add(maiorNum);
		
		menorNum = new JTextField();
		menorNum.setEditable(false);
		menorNum.setColumns(10);
		menorNum.setBounds(190, 97, 114, 19);
		num.add(menorNum);
		
		JLabel lblNewLabel_1 = new JLabel("Informe");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(38, 31, 111, 14);
		num.add(lblNewLabel_1);
	}
}

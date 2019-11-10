package br.edu.ifcvideira.Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Exe3Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textAlturaDaParede;
	private JTextField textLarguraDaParede;
	private JTextField textLarguraDoAzuleijo;
	private JTextField textAlturaDoAzuleijo;
	Exe3CalculadoraAzuleijos calc = new Exe3CalculadoraAzuleijos();
  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe3Principal frame = new Exe3Principal();
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
	public Exe3Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora de Azuleijos");
		lblCalculadora.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblCalculadora.setBounds(90, 11, 195, 14);
		contentPane.add(lblCalculadora);
		
		JLabel lblAlturaDaParede = new JLabel("Altura da Parede:");
		lblAlturaDaParede.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblAlturaDaParede.setBounds(25, 67, 145, 14);
		contentPane.add(lblAlturaDaParede);
		
		textAlturaDaParede = new JTextField();
		textAlturaDaParede.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textAlturaDaParede.setColumns(10);
		textAlturaDaParede.setBounds(188, 64, 140, 20);
		contentPane.add(textAlturaDaParede);
		
		JLabel lblLarguraDaParede = new JLabel("Largura da Parede:");
		lblLarguraDaParede.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblLarguraDaParede.setBounds(25, 92, 156, 14);
		contentPane.add(lblLarguraDaParede);
		
		textLarguraDaParede = new JTextField();
		textLarguraDaParede.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textLarguraDaParede.setColumns(10);
		textLarguraDaParede.setBounds(188, 89, 140, 20);
		contentPane.add(textLarguraDaParede);
		
		JLabel lblAlturaDoAzuleijo = new JLabel("Altura do Azuleijo:");
		lblAlturaDoAzuleijo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblAlturaDoAzuleijo.setBounds(25, 124, 145, 14);
		contentPane.add(lblAlturaDoAzuleijo);
		
		JLabel lblLarguraDoAzuleijo = new JLabel("Largura do Azuleijo:");
		lblLarguraDoAzuleijo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblLarguraDoAzuleijo.setBounds(25, 149, 156, 14);
		contentPane.add(lblLarguraDoAzuleijo);
		
		textLarguraDoAzuleijo = new JTextField();
		textLarguraDoAzuleijo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textLarguraDoAzuleijo.setColumns(10);
		textLarguraDoAzuleijo.setBounds(188, 146, 140, 20);
		contentPane.add(textLarguraDoAzuleijo);
		
		textAlturaDoAzuleijo = new JTextField();
		textAlturaDoAzuleijo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textAlturaDoAzuleijo.setColumns(10);
		textAlturaDoAzuleijo.setBounds(188, 120, 140, 20);
		contentPane.add(textAlturaDoAzuleijo);
		
		JComboBox cbOperacao = new JComboBox();		
		cbOperacao.setBackground(Color.WHITE);
		cbOperacao.setModel(new DefaultComboBoxModel(new String[] {"Selecione o tipo de azuleijo...", "Azuleijo Quadrado", "Azuleijo Ret\u00E2ngulo", "Azuleijo Triangular de Lados Iguais", "Azuleijo Triangular de Lados Diferentes"}));
		cbOperacao.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		cbOperacao.setBounds(25, 190, 318, 22);
		contentPane.add(cbOperacao);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double areaParede;
				double areaAzuleijo = 0;
				double qtdAzuleijos = 0;
				calc.setAlturaParede(Double.parseDouble(textAlturaDaParede.getText()));
				calc.setLarguraParede(Double.parseDouble(textLarguraDaParede.getText()));
				calc.setAlturaAzuleijo(Double.parseDouble(textAlturaDoAzuleijo.getText()));
				calc.setLarguraAzuleijo(Double.parseDouble(textLarguraDoAzuleijo.getText()));
				areaParede = calc.getAlturaParede()*calc.getLarguraParede();
				if (cbOperacao.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(cbOperacao, "Selecione uma Operação");
				}else if (cbOperacao.getSelectedIndex()==1) {
					areaAzuleijo = calc.getLarguraAzuleijo()*calc.getLarguraAzuleijo();
				}else if (cbOperacao.getSelectedIndex()==2) {
					areaAzuleijo = calc.getLarguraAzuleijo()*calc.getAlturaAzuleijo();
				}else if (cbOperacao.getSelectedIndex()==3) {
					areaAzuleijo = (calc.getLarguraAzuleijo()*calc.getLarguraAzuleijo())/2;
				}else if (cbOperacao.getSelectedIndex()==4) {
					areaAzuleijo = (calc.getLarguraAzuleijo()*calc.getLarguraAzuleijo())/2;
				}
				qtdAzuleijos = areaParede/areaAzuleijo;
				String formatAreaParede = String.format("%.2f", areaParede);
				String formatAreaAzuleijo = String.format("%.2f", areaAzuleijo);
				String formatqtdAzuleijo = String.format("%.2f", qtdAzuleijos);
				
				
				JOptionPane.showMessageDialog(null, "Quantidade Necessárias de Azuleijos:\n"
						+ "Área da Parede: "+formatAreaParede+" m².\n"
								+ "Área do Azuleijo: "+formatAreaAzuleijo+" m².\n"
										+ "Quantidade de Azuleijos Necessários: "+formatqtdAzuleijo+ " azuleijos.");
				
			}
		});
		btnCalcular.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnCalcular.setBounds(136, 256, 111, 34);
		contentPane.add(btnCalcular);
		

	}
}

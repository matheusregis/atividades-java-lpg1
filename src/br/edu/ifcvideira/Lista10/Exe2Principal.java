package br.edu.ifcvideira.Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exe2Principal extends JFrame{

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textValor;
	private JTextField textAnoDeUso;
	private JTextField textCapacidade;
	Exe2Moto moto = new Exe2Moto();
	Exe2Automovel automovel = new Exe2Automovel();
	Exe2Caminhao caminhao = new Exe2Caminhao();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe2Principal frame = new Exe2Principal();
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
	public Exe2Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaOVeiculo = new JLabel("Escolha seu Ve\u00EDculo");
		lblEscolhaOVeiculo.setBounds(126, 11, 166, 14);
		lblEscolhaOVeiculo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(lblEscolhaOVeiculo);
		
		JRadioButton rbMoto = new JRadioButton("Moto");
		buttonGroup.add(rbMoto);
		rbMoto.setBounds(38, 35, 68, 23);
		rbMoto.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(rbMoto);
		rbMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbMoto.isSelected()) {
					textCapacidade.setEditable(false);
					
				}
			}
		});
		
		JRadioButton rbAutomovel = new JRadioButton("Autom\u00F3vel");
		buttonGroup.add(rbAutomovel);
		rbAutomovel.setBounds(150, 35, 107, 23);
		rbAutomovel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(rbAutomovel);
		rbAutomovel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbAutomovel.isSelected()) {
					textCapacidade.setEditable(false);
					
				}
			}
		});
		
		JRadioButton rbCaminhao = new JRadioButton("Caminh\u00E3o");
		buttonGroup.add(rbCaminhao);
		rbCaminhao.setBounds(291, 35, 107, 23);
		rbCaminhao.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(rbCaminhao);
		rbCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbCaminhao.isSelected()) {
					textCapacidade.setEditable(true);
					
				}
			}
		});
		
		JLabel lblValor = new JLabel("Valor Ve\u00EDculo:");
		lblValor.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblValor.setBounds(38, 75, 117, 14);
		contentPane.add(lblValor);
		
		textValor = new JTextField();
		textValor.setBounds(150, 74, 117, 20);
		textValor.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		JLabel lblAnosDeUso = new JLabel("Anos de Uso:");
		lblAnosDeUso.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblAnosDeUso.setBounds(38, 112, 117, 14);
		contentPane.add(lblAnosDeUso);
		
		textAnoDeUso = new JTextField();
		textAnoDeUso.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textAnoDeUso.setColumns(10);
		textAnoDeUso.setBounds(150, 111, 117, 20);
		contentPane.add(textAnoDeUso);
		
		JCheckBox chSeguro = new JCheckBox("Seu carro possui seguro?");
		chSeguro.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		chSeguro.setBounds(135, 212, 221, 23);
		contentPane.add(chSeguro);
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbMoto.isSelected()){
					moto.setValor(Double.parseDouble(textValor.getText()));
					moto.setAno(Integer.parseInt(textAnoDeUso.getText()));
					moto.calcSeguro();
					moto.calcIpva();
					moto.valorDepreciado();
					if (chSeguro.isSelected()) {
						JOptionPane.showMessageDialog(null, "Moto:\n"
								+ "Valor Pago: R$"+moto.getValor()+" reais.\n"
										+ "Anos de Uso: "+moto.getAno()+" anos\n"
												+ "Nenhuma Moto Possui Seguro\n"
														+ "Valor Atual da Moto: R$"+moto.getDepreciado()+" reais.\n"
																+ "Valor IPVA: R$"+moto.getIpva()+" reais.");
					}else {
						JOptionPane.showMessageDialog(null, "Moto:\n"
								+ "Valor Pago: R$"+moto.getValor()+" reais.\n"
										+ "Anos de Uso: "+moto.getAno()+" anos\n"
												+ "Valor Atual da Moto: R$"+moto.getDepreciado()+" reais.\n"
														+ "Valor IPVA: R$"+moto.getIpva()+" reais.");
					}
					
				}else if (rbAutomovel.isSelected()){
					automovel.setValor(Double.parseDouble(textValor.getText()));
					automovel.setAno(Integer.parseInt(textAnoDeUso.getText()));
					automovel.calcSeguro();
					automovel.calcIpva();
					automovel.valorDepreciado();
					if (chSeguro.isSelected()) {
						JOptionPane.showMessageDialog(null, "Automóvel:\n"
								+ "Valor Pago: R$"+automovel.getValor()+" reais.\n"
										+ "Anos de Uso: "+automovel.getAno()+" anos\n"
												+ "Valor Seguro: R$"+automovel.getSeguro()+" reais.\n"
														+ "Valor Atual do Automóvel: R$"+automovel.getDepreciado()+" reais.\n"
																+ "Valor IPVA: R$"+automovel.getIpva()+" reais.");
					}else {
						JOptionPane.showMessageDialog(null, "Automóvel:\n"
								+ "Valor Pago: R$"+automovel.getValor()+" reais.\n"
										+ "Anos de Uso: "+automovel.getAno()+" anos\n"
												+ "Valor Atual do Automóvel: R$"+automovel.getDepreciado()+" reais.\n"
														+ "Valor IPVA: R$"+automovel.getIpva()+" reais.");
					}
					
				}else if (rbCaminhao.isSelected()){
					caminhao.setValor(Double.parseDouble(textValor.getText()));
					caminhao.setAno(Integer.parseInt(textAnoDeUso.getText()));
					caminhao.setCapacidade(Integer.parseInt(textCapacidade.getText()));
					caminhao.calcSeguro();
					caminhao.calcIpva();
					caminhao.valorDepreciado();
					
					if (chSeguro.isSelected()) {
						JOptionPane.showMessageDialog(null, "Caminhão:\n"
								+ "Valor Pago: R$"+caminhao.getValor()+" reais.\n"
										+ "Anos de Uso: "+caminhao.getAno()+" anos\n"
												+ "Valor Seguro: R$"+caminhao.getSeguro()+" reais.\n"
														+ "Valor Atual do Caminhão: R$"+caminhao.getDepreciado()+" reais.\n"
																+ "Valor IPVA: R$"+caminhao.getIpva()+" reais.");
					}else {
						JOptionPane.showMessageDialog(null, "Caminhão:\n"
								+ "Valor Pago: R$"+caminhao.getValor()+" reais.\n"
										+ "Anos de Uso: "+caminhao.getAno()+" anos\n"
												+ "Valor Atual do Caminhão: R$"+caminhao.getDepreciado()+" reais.\n"
														+ "Valor IPVA: R$"+caminhao.getIpva()+" reais.");
					}
					
				}
			}
		});
		btnCalcular.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnCalcular.setBounds(136, 243, 169, 32);
		contentPane.add(btnCalcular);
		
		JLabel lblCapacidade = new JLabel("Capacidade:");
		lblCapacidade.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblCapacidade.setBounds(38, 151, 117, 19);
		contentPane.add(lblCapacidade);
		
		textCapacidade = new JTextField();
		textCapacidade.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textCapacidade.setColumns(10);
		textCapacidade.setBounds(150, 150, 117, 20);
		contentPane.add(textCapacidade);
		
	}
}

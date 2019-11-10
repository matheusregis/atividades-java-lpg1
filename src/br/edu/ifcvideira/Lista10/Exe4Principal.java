package br.edu.ifcvideira.Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exe4Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textRua;
	private JTextField textEmail;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textProfissao;
	private JTextField textSetor;
	private JTextField textParentesco;
	private JTextField textTelefone;
	Exe4ColegaDeTrabalho colega = new Exe4ColegaDeTrabalho();
	Exe4Amigo amigo = new Exe4Amigo();
	Exe4Parente parente = new Exe4Parente();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe4Principal frame = new Exe4Principal();
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
	public Exe4Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAgenda = new JLabel("Cadastrar Contato");
		lblAgenda.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblAgenda.setBounds(176, 11, 183, 24);
		contentPane.add(lblAgenda);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNome.setBounds(33, 49, 49, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textNome.setColumns(10);
		textNome.setBounds(122, 46, 345, 20);
		contentPane.add(textNome);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblRua.setBounds(33, 74, 56, 14);
		contentPane.add(lblRua);
		
		textRua = new JTextField();
		textRua.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textRua.setColumns(10);
		textRua.setBounds(122, 71, 345, 20);
		contentPane.add(textRua);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblEmail.setBounds(33, 99, 71, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textEmail.setColumns(10);
		textEmail.setBounds(122, 96, 345, 20);
		contentPane.add(textEmail);
		
		JLabel lblProfissao = new JLabel("Profissao:");
		lblProfissao.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblProfissao.setBounds(33, 127, 86, 14);
		contentPane.add(lblProfissao);
		
		textProfissao = new JTextField();
		textProfissao.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textProfissao.setColumns(10);
		textProfissao.setBounds(122, 124, 345, 20);
		contentPane.add(textProfissao);
		
		
		
		JLabel lblSetor = new JLabel("Setor:");
		lblSetor.setVisible(false);
		lblSetor.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblSetor.setBounds(33, 206, 98, 14);
		contentPane.add(lblSetor);
		
		textSetor = new JTextField();
		textSetor.setVisible(false);
		textSetor.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textSetor.setColumns(10);
		textSetor.setBounds(132, 203, 335, 20);
		contentPane.add(textSetor);
		
		JLabel lblParentesco = new JLabel("Parentesco:");
		lblParentesco.setVisible(false);
		lblParentesco.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblParentesco.setBounds(33, 206, 98, 14);
		contentPane.add(lblParentesco);
		
		textParentesco = new JTextField();
		textParentesco.setVisible(false);
		textParentesco.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textParentesco.setColumns(10);
		textParentesco.setBounds(132, 203, 335, 20);
		contentPane.add(textParentesco);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setVisible(false);
		lblTelefone.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblTelefone.setBounds(33, 206, 98, 14);
		contentPane.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setVisible(false);
		textTelefone.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textTelefone.setColumns(10);
		textTelefone.setBounds(132, 203, 335, 20);
		contentPane.add(textTelefone);
		
		
		JRadioButton rbColega = new JRadioButton("Colega");
		rbColega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbColega.isSelected()) {
					textTelefone.setVisible(false);
					lblTelefone.setVisible(false);
					lblParentesco.setVisible(false);
					textParentesco.setVisible(false);
					textSetor.setVisible(true);
					lblSetor.setVisible(true);
				}
			}
		});
		buttonGroup.add(rbColega);
		rbColega.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		rbColega.setBounds(111, 160, 77, 23);
		contentPane.add(rbColega);
		
		JRadioButton rbAmigo = new JRadioButton("Amigo");
		rbAmigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbAmigo.isSelected()) {
					textSetor.setVisible(false);
					lblSetor.setVisible(false);
					lblParentesco.setVisible(false);
					textParentesco.setVisible(false);
					textTelefone.setVisible(true);
					lblTelefone.setVisible(true);
				}
			}
		});
		
		buttonGroup.add(rbAmigo);
		rbAmigo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		rbAmigo.setBounds(238, 160, 77, 23);
		contentPane.add(rbAmigo);
		
		JRadioButton rbParente = new JRadioButton("Parente");
		
		rbParente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbParente.isSelected()) {
					textSetor.setVisible(false);
					lblSetor.setVisible(false);
					lblTelefone.setVisible(false);
					textTelefone.setVisible(false);
					lblParentesco.setVisible(true);
					textParentesco.setVisible(true);
				}
			}
		});
		
		buttonGroup.add(rbParente);
		rbParente.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		rbParente.setBounds(364, 160, 86, 23);
		contentPane.add(rbParente);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbColega.isSelected()) {
					colega.setNome(String.valueOf(textNome.getText()));
					colega.setRua(String.valueOf(textRua.getText()));
					colega.setEmail(String.valueOf(textEmail.getText()));
					colega.setProfissao(String.valueOf(textProfissao.getText()));
					colega.setSetor(String.valueOf(textSetor.getText()));
					
					JOptionPane.showMessageDialog(null, "Dados Cadastrais:\n"
							+ "Nome: "+colega.getNome()+"\n"
									+ "Rua: "+colega.getRua()+"\n"
											+ "E-mail: "+colega.getEmail()+"\n"
													+ "Profissão: "+colega.getProfissao()+"\n"
															+ "Setor: "+colega.getSetor()+"\n"
																	+ "Assinatura de E-mail: Att. "+colega.getNome()+".");
					
					
				}else if (rbAmigo.isSelected()) {
					amigo.setNome(String.valueOf(textNome.getText()));
					amigo.setRua(String.valueOf(textRua.getText()));
					amigo.setEmail(String.valueOf(textEmail.getText()));
					amigo.setProfissao(String.valueOf(textProfissao.getText()));
					amigo.setTelefonePessoal(String.valueOf(textTelefone.getText()));
					
					JOptionPane.showMessageDialog(null, "Dados Cadastrais:\n"
							+ "Nome: "+amigo.getNome()+"\n"
									+ "Rua: "+amigo.getRua()+"\n"
											+ "E-mail: "+amigo.getEmail()+"\n"
													+ "Profissão: "+amigo.getProfissao()+"\n"
															+ "Telefone: "+amigo.getTelefonePessoal()+"\n"
																	+ "Assinatura de E-mail: Abraços. "+amigo.getNome()+".");
					
					
				}else if (rbParente.isSelected()) {
					parente.setNome(String.valueOf(textNome.getText()));
					parente.setRua(String.valueOf(textRua.getText()));
					parente.setEmail(String.valueOf(textEmail.getText()));
					parente.setProfissao(String.valueOf(textProfissao.getText()));
					parente.setParentesco(String.valueOf(textParentesco.getText()));
					
					JOptionPane.showMessageDialog(null, "Dados Cadastrais:\n"
							+ "Nome: "+parente.getNome()+"\n"
									+ "Rua: "+parente.getRua()+"\n"
											+ "E-mail: "+parente.getEmail()+"\n"
													+ "Profissão: "+parente.getProfissao()+"\n"
															+ "Telefone: "+parente.getParentesco()+"\n"
																	+ "Assinatura de E-mail: Até mais. "+parente.getNome()+".");
					
					
				}
			}
		});
		btnEnviar.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnEnviar.setBounds(205, 249, 111, 34);
		contentPane.add(btnEnviar);
		
	}
}

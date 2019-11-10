package br.edu.ifcvideira.Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Ex1Principal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JComboBox cbPlacaVideo = new JComboBox();
	JCheckBox chCarregador = new JCheckBox("Carregador - R$ 200,00");
	JCheckBox chPasta = new JCheckBox("Pasta - R$ 200,00");
	JCheckBox chEstabilizador = new JCheckBox("Estabilizador - R$ 200,00");
	JCheckBox chTeclado = new JCheckBox("Teclado - R$ 200,00");
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	Ex1Notebook no = new Ex1Notebook();
	Ex1Desktop de = new Ex1Desktop();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1Principal frame = new Ex1Principal();
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
	public Ex1Principal() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Ex1Principal.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		setTitle("Computador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaAConfigurao = new JLabel("Escolha a configura\u00E7\u00E3o do seu computador");
		lblEscolhaAConfigurao.setBounds(87, 11, 333, 26);
		lblEscolhaAConfigurao.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(lblEscolhaAConfigurao);
		
		JRadioButton rbNotebook = new JRadioButton("Notebook");
		rbNotebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chCarregador.setEnabled(true);
				chPasta.setEnabled(true);
				chEstabilizador.setEnabled(false);
				chTeclado.setEnabled(false);
			}
		});
		buttonGroup.add(rbNotebook);
		rbNotebook.setSelected(true);
		rbNotebook.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		rbNotebook.setBounds(62, 46, 109, 23);
		contentPane.add(rbNotebook);
		
		JRadioButton rbDesktop = new JRadioButton("Desktop");
		rbDesktop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chCarregador.setEnabled(false);
				chPasta.setEnabled(false);
				chEstabilizador.setEnabled(true);
				chTeclado.setEnabled(true);
			}
		});
		buttonGroup.add(rbDesktop);
		rbDesktop.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		rbDesktop.setBounds(311, 48, 109, 23);
		contentPane.add(rbDesktop);
		
		JLabel lblPlacaMe = new JLabel("Placa M\u00E3e:");
		lblPlacaMe.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblPlacaMe.setBounds(70, 78, 126, 26);
		contentPane.add(lblPlacaMe);
		
		JComboBox cbPlacaMae = new JComboBox();
		cbPlacaMae.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 500,00", "Modelo 2 - R$ 1000,00", "Modelo 3 - R$ 1500,00"}));
		cbPlacaMae.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		cbPlacaMae.setBounds(212, 78, 208, 26);
		contentPane.add(cbPlacaMae);
		
		JLabel lblProcessador = new JLabel("Processador:");
		lblProcessador.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblProcessador.setBounds(70, 115, 126, 26);
		contentPane.add(lblProcessador);
		
		JComboBox cbProcessador = new JComboBox();
		cbProcessador.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 600,00", "Modelo 2 - R$ 800,00", "Modelo 3 - R$ 1000,00"}));
		cbProcessador.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		cbProcessador.setBounds(212, 115, 208, 26);
		contentPane.add(cbProcessador);
		
		JLabel lblHd = new JLabel("Hd:");
		lblHd.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblHd.setBounds(70, 152, 126, 26);
		contentPane.add(lblHd);
		
		JComboBox cbHd = new JComboBox();
		cbHd.setModel(new DefaultComboBoxModel(new String[] {"500 GB - R$ 100,00", "1 TB - R$ 200,00", "2 TB - R$ 300,00"}));
		cbHd.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		cbHd.setBounds(212, 152, 208, 26);
		contentPane.add(cbHd);
		
		JLabel lblMemria = new JLabel("Mem\u00F3ria:");
		lblMemria.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblMemria.setBounds(70, 189, 126, 26);
		contentPane.add(lblMemria);
		
		JComboBox cbMemoria = new JComboBox();
		cbMemoria.setModel(new DefaultComboBoxModel(new String[] {"4 GB - R$ 200,00", "8 GB - R$ 300,00", "16 GB - R$ 400,00"}));
		cbMemoria.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		cbMemoria.setBounds(212, 189, 208, 26);
		contentPane.add(cbMemoria);
		
		JCheckBox chPlacaVideo = new JCheckBox("Placa V\u00EDdeo Off Board");
		chPlacaVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chPlacaVideo.isSelected()) {
					cbPlacaVideo.setEnabled(true);
				}else {
					cbPlacaVideo.setEnabled(false);
				}
			}
		});
		chPlacaVideo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		chPlacaVideo.setBounds(34, 230, 221, 23);
		contentPane.add(chPlacaVideo);
		
		cbPlacaVideo.setEnabled(false);
		cbPlacaVideo.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 600,00", "Modelo 2 - R$ 900,00", "Modelo 3 - R$ 1200,00"}));
		cbPlacaVideo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		cbPlacaVideo.setBounds(266, 228, 208, 26);
		contentPane.add(cbPlacaVideo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 272, 476, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(254, 272, 13, 77);
		contentPane.add(separator_1);
		
		chCarregador.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		chCarregador.setBounds(34, 281, 213, 23);
		contentPane.add(chCarregador);

		chPasta.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		chPasta.setBounds(34, 318, 200, 23);
		contentPane.add(chPasta);

		chEstabilizador.setEnabled(false);
		chEstabilizador.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		chEstabilizador.setBounds(265, 281, 240, 23);
		contentPane.add(chEstabilizador);

		chTeclado.setEnabled(false);
		chTeclado.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		chTeclado.setBounds(265, 318, 200, 23);
		contentPane.add(chTeclado);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 348, 476, 2);
		contentPane.add(separator_2);
		
		JCheckBox chGarantia = new JCheckBox("Garantia Estendida");
		chGarantia.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		chGarantia.setBounds(173, 356, 221, 23);
		contentPane.add(chGarantia);
		
		JButton btnNewButton = new JButton("Finalizar Pedido");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rbNotebook.isSelected()) {
					//notebook	
					
					no.setConfig("");
					
					//placa mae
					if (cbPlacaMae.getSelectedIndex()==0) {
						no.setPlacaMae(500);
					}else if (cbPlacaMae.getSelectedIndex()==1) {
						no.setPlacaMae(1000);
					}else if (cbPlacaMae.getSelectedIndex()==2) {
						no.setPlacaMae(1500);
					}
					no.setConfig(no.getConfig()+"Placa Mãe: "+cbPlacaMae.getSelectedItem()+"\n");
					
					
					//processador
					if (cbProcessador.getSelectedIndex()==0) {
						no.setProcessador(600);
					}else if (cbProcessador.getSelectedIndex()==1) {
						no.setProcessador(800);
					}else if (cbProcessador.getSelectedIndex()==2) {
						no.setProcessador(1000);
					}
					no.setConfig(no.getConfig()+"Processador: "+cbProcessador.getSelectedItem()+"\n");
					
					
					//hd
					if (cbHd.getSelectedIndex()==0) {
						no.setHd(100);
					}else if (cbHd.getSelectedIndex()==1) {
						no.setHd(200);
					}else if (cbHd.getSelectedIndex()==2) {
						no.setHd(3300);
					}
					no.setConfig(no.getConfig()+"HD: "+cbHd.getSelectedItem()+"\n");
					
					//memoria
					if (cbMemoria.getSelectedIndex()==0) {
						no.setMemoria(200);
					}else if (cbMemoria.getSelectedIndex()==1) {
						no.setMemoria(300);
					}else if (cbMemoria.getSelectedIndex()==2) {
						no.setMemoria(400);
					}
					no.setConfig(no.getConfig()+"Memória: "+cbMemoria.getSelectedItem()+"\n");
					
					//placa video
					if (chPlacaVideo.isSelected()) {
						if (cbPlacaVideo.getSelectedIndex()==0) {
							no.setPlacaVideo(600);
						}else if (cbPlacaVideo.getSelectedIndex()==1) {
							no.setPlacaVideo(900);
						}else if (cbPlacaVideo.getSelectedIndex()==2) {
							no.setPlacaVideo(1200);
						}
						no.setConfig(no.getConfig()+"Placa Vídeo: "+cbPlacaVideo.getSelectedItem()+"\n");
					}
					
					//carregador
					if (chCarregador.isSelected()) {
						no.setCarregador(200);
						no.setConfig(no.getConfig()+chCarregador.getText()+"\n");
					}
					
					
					//pasta
					if (chPasta.isSelected()) {
						no.setPasta(200);
						no.setConfig(no.getConfig()+chPasta.getText()+"\n");
					}
					
					no.setVolumes(1);
					no.setConfig(no.getConfig()+"Volumes: "+no.getVolumes()+"\n");
					
					if (chGarantia.isSelected()) {
						no.setGarantia(2);
						no.setConfig(no.getConfig()+"Garantia: "+no.getGarantia()+" anos\n");
						JOptionPane.showMessageDialog(null, no.imprime()+df.format(no.calculaPrecoGarantia()));
					}else {
						no.setGarantia(1);
						no.setConfig(no.getConfig()+"Garantia: "+no.getGarantia()+" anos\n");
						JOptionPane.showMessageDialog(null, no.imprime()+df.format(no.calculaPreco()));
					}	
					
				}else {
					//desktop
					
					de.setConfig("");
					
					//placa mae
					if (cbPlacaMae.getSelectedIndex()==0) {
						de.setPlacaMae(500);
					}else if (cbPlacaMae.getSelectedIndex()==1) {
						de.setPlacaMae(1000);
					}else if (cbPlacaMae.getSelectedIndex()==2) {
						de.setPlacaMae(1500);
					}
					de.setConfig(de.getConfig()+"Placa Mãe: "+cbPlacaMae.getSelectedItem()+"\n");
					
					
					//processador
					if (cbProcessador.getSelectedIndex()==0) {
						de.setProcessador(600);
					}else if (cbProcessador.getSelectedIndex()==1) {
						de.setProcessador(800);
					}else if (cbProcessador.getSelectedIndex()==2) {
						de.setProcessador(1000);
					}
					de.setConfig(de.getConfig()+"Processador: "+cbProcessador.getSelectedItem()+"\n");
					
					
					//hd
					if (cbHd.getSelectedIndex()==0) {
						de.setHd(100);
					}else if (cbHd.getSelectedIndex()==1) {
						de.setHd(200);
					}else if (cbHd.getSelectedIndex()==2) {
						de.setHd(3300);
					}
					de.setConfig(de.getConfig()+"HD: "+cbHd.getSelectedItem()+"\n");
					
					//memoria
					if (cbMemoria.getSelectedIndex()==0) {
						de.setMemoria(200);
					}else if (cbMemoria.getSelectedIndex()==1) {
						de.setMemoria(300);
					}else if (cbMemoria.getSelectedIndex()==2) {
						de.setMemoria(400);
					}
					de.setConfig(de.getConfig()+"Memória: "+cbMemoria.getSelectedItem()+"\n");
					
					//placa video
					if (chPlacaVideo.isSelected()) {
						if (cbPlacaVideo.getSelectedIndex()==0) {
							de.setPlacaVideo(600);
						}else if (cbPlacaVideo.getSelectedIndex()==1) {
							de.setPlacaVideo(900);
						}else if (cbPlacaVideo.getSelectedIndex()==2) {
							de.setPlacaVideo(1200);
						}
						de.setConfig(de.getConfig()+"Placa Vídeo: "+cbPlacaVideo.getSelectedItem()+"\n");
					}
					
					//estabilizador
					if (chEstabilizador.isSelected()) {
						de.setEstabilizador(200);
						de.setConfig(de.getConfig()+chEstabilizador.getText()+"\n");
					}
					
					
					//teclado
					if (chTeclado.isSelected()) {
						de.setTeclado(200);
						de.setConfig(de.getConfig()+chTeclado.getText()+"\n");
					}
					
					de.setVolumes(4);
					de.setConfig(de.getConfig()+"Volumes: "+de.getVolumes()+"\n");
					
					if (chGarantia.isSelected()) {
						de.setGarantia(3);
						de.setConfig(de.getConfig()+"Garantia: "+de.getGarantia()+" anos\n");
						JOptionPane.showMessageDialog(null, de.imprime()+df.format(de.calculaPrecoGarantia()));
					}else {
						de.setGarantia(2);
						de.setConfig(de.getConfig()+"Garantia: "+de.getGarantia()+" anos\n");
						JOptionPane.showMessageDialog(null, de.imprime()+df.format(de.calculaPreco()));
					}	
				}
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(174, 387, 169, 32);
		contentPane.add(btnNewButton);
	}
}







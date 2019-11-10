package br.edu.ifcvideira.Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JSlider;

public class PrincipalCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textNumero1;
	private JTextField textNumero2;
	private JTextField textResultado;
	Calculadora calc = new Calculadora();
	
	JRadioButton rbSoma = new JRadioButton("Soma");
	JRadioButton rbSubtracao = new JRadioButton("Subtra\u00E7\u00E3o");
	JRadioButton rbMultiplicacao = new JRadioButton("Multiplica\u00E7\u00E3o");
	JRadioButton rbDivisao = new JRadioButton("Divis\u00E3o");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalCalculadora frame = new PrincipalCalculadora();
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
	public PrincipalCalculadora() {
		setFont(new Font("Cambria", Font.BOLD, 14));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(700, 300, 309, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(80, 11, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("N\u00FAmero 1:");
		lblNmero.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNmero.setBounds(32, 40, 83, 27);
		contentPane.add(lblNmero);
		
		textNumero1 = new JTextField();
		textNumero1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textNumero1.setBounds(125, 45, 116, 20);
		contentPane.add(textNumero1);
		textNumero1.setColumns(10);
		
		JLabel lblNmero_1 = new JLabel("N\u00FAmero 2:");
		lblNmero_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNmero_1.setBounds(32, 78, 83, 27);
		contentPane.add(lblNmero_1);
		
		textNumero2 = new JTextField();
		textNumero2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textNumero2.setColumns(10);
		textNumero2.setBounds(125, 83, 116, 20);
		contentPane.add(textNumero2);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
				textResultado.setText(""+calc.soma());
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(10, 116, 50, 29);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
				textResultado.setText(""+calc.subtrair());
			}
		});
		button.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		button.setBounds(70, 116, 50, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
				textResultado.setText(""+calc.multiplicacao());
			}
		});
		button_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		button_1.setBounds(135, 116, 50, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
				textResultado.setText(""+calc.divisao());
			}
		});
		button_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		button_2.setBounds(204, 116, 50, 29);
		contentPane.add(button_2);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblResultado.setBounds(32, 407, 83, 27);
		contentPane.add(lblResultado);
		
		textResultado = new JTextField();
		textResultado.setEnabled(false);
		textResultado.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		textResultado.setColumns(10);
		textResultado.setBounds(125, 412, 116, 20);
		contentPane.add(textResultado);
		
		JComboBox cbOperacao = new JComboBox();
		
		cbOperacao.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
				
				if (cbOperacao.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(cbOperacao, "Selecione uma Operação");
				}else if (cbOperacao.getSelectedIndex()==1) {
					textResultado.setText(""+calc.soma());
				}else if (cbOperacao.getSelectedIndex()==2) {
					textResultado.setText(""+calc.subtrair());
				}else if (cbOperacao.getSelectedIndex()==3) {
					textResultado.setText(""+calc.multiplicacao());
				}else if (cbOperacao.getSelectedIndex()==4) {
					textResultado.setText(""+calc.divisao());
				}
				
			}
			
	
			public void popupMenuCanceled(PopupMenuEvent e) {
				// TODO Auto-generated method stub
				
			}
		
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		cbOperacao.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		cbOperacao.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "Soma", "Subtra\u00E7\u00E3o", "Multiplica\u00E7\u00E3o", "Divis\u00E3o"}));
		cbOperacao.setBounds(70, 150, 137, 22);
		contentPane.add(cbOperacao);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
					
				if (rbSoma.isSelected()) {
					textResultado.setText(""+calc.soma());
				}else if (rbSubtracao.isSelected()) {
					textResultado.setText(""+calc.subtrair());
				}else if (rbMultiplicacao.isSelected()) {
					textResultado.setText(""+calc.multiplicacao());
				}else if (rbDivisao.isSelected()) {
					textResultado.setText(""+calc.divisao());
				}
//				if (cbOperacao.getSelectedItem().equals("Soma")) {
//					textResultado.setText(""+calc.soma());
//				}else if (cbOperacao.getSelectedItem().equals("Subtração")) {
//					textResultado.setText(""+calc.subtrair());
//				}else if (cbOperacao.getSelectedItem().equals("Multiplicação")) {
//					textResultado.setText(""+calc.multiplicacao());
//				}else if (cbOperacao.getSelectedItem().equals("Divisão")) {
//					textResultado.setText(""+calc.divisao());
//				}
			}
		});
		btnCalcular.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnCalcular.setBounds(74, 318, 111, 34);
		contentPane.add(btnCalcular);
		rbSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
				textResultado.setText(""+calc.soma());
			}
		});
		
		
		rbSoma.setSelected(true);
		buttonGroup.add(rbSoma);
		rbSoma.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rbSoma.setBounds(50, 204, 83, 23);
		contentPane.add(rbSoma);
		
		buttonGroup.add(rbSubtracao);
		rbSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
				textResultado.setText(""+calc.subtrair());
			}
		});
		rbSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rbSubtracao.setBounds(149, 204, 105, 23);
		contentPane.add(rbSubtracao);
		
		buttonGroup.add(rbMultiplicacao);
		rbMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
				textResultado.setText(""+calc.multiplicacao());
			}
		});
		rbMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rbMultiplicacao.setBounds(50, 244, 96, 23);
		contentPane.add(rbMultiplicacao);
		
		buttonGroup.add(rbDivisao);
		rbDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setNumero1(Double.parseDouble(textNumero1.getText()));
				calc.setNumero2(Double.parseDouble(textNumero2.getText()));
				textResultado.setText(""+calc.divisao());
			}
		});
		rbDivisao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rbDivisao.setBounds(158, 244, 83, 23);
		contentPane.add(rbDivisao);
	}
}

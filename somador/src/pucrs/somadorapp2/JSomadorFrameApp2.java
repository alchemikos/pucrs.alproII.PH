package pucrs.somadorapp2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class JSomadorFrameApp2 extends JFrame {

	private JPanel contentPane;
	private JTextField primeiraParcelaField;
	private JTextField segundaParcelaField;
	private JTextField somaField;
	private final Action somaAction = new SwingAction();
	private Somador modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSomadorFrameApp2 frame = new JSomadorFrameApp2();
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
	public JSomadorFrameApp2() {
		modelo = new Somador();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		primeiraParcelaField = new JTextField();
		primeiraParcelaField.setBounds(200, 23, 114, 19);
		contentPane.add(primeiraParcelaField);
		primeiraParcelaField.setColumns(10);
		
		segundaParcelaField = new JTextField();
		segundaParcelaField.setBounds(200, 66, 114, 19);
		contentPane.add(segundaParcelaField);
		segundaParcelaField.setColumns(10);
		
		somaField = new JTextField();
		somaField.setEditable(false);
		somaField.setBounds(200, 146, 114, 19);
		contentPane.add(somaField);
		somaField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(somaAction);
		btnNewButton.setBounds(200, 97, 114, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Primeira Parcela");
		lblNewLabel.setBounds(61, 25, 116, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segunda Parcela");
		lblNewLabel_1.setBounds(61, 68, 132, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Soma");
		lblNewLabel_2.setBounds(123, 148, 70, 15);
		contentPane.add(lblNewLabel_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Somar");
			putValue(SHORT_DESCRIPTION, "Calcula a soma das duas pardelas");
		}
		public void actionPerformed(ActionEvent e) {
			String textoA = primeiraParcelaField.getText();// "2"
			String textoB = segundaParcelaField.getText();
			int a = Integer.parseInt(textoA);//2
			int b = Integer.parseInt(textoB);
			modelo.setA(a);
			modelo.setB(b);
			int soma = modelo.getSoma();
			String textoSoma = String.format("%d", soma);
			somaField.setText(textoSoma);
		}
	}
}

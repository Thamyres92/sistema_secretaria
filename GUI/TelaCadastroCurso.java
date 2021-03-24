package sistema_secretaria.GUI;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import persistencia.PersistenciaNoBanco;
import sistema_secretaria.modelos.Curso;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroCurso extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtCodigo;
	private JTextField txtCargaHoraria;
	private JTextField txtNome;
	private JPanel panel;
	private JLabel lblCodigo;
	private JLabel lblNome;
	private JLabel lblCargaHoraria;
	private JLabel lblArea;
	private JLabel lblNivel;
	private JComboBox comboBoxArea;
	private JComboBox comboBoxNivel;
	private JButton btnSalvar;
	private JButton btnFechar;
	private int codigo;
	private String nome;
	private String area;
	private String nivel;
	private int cargaHoraria;
	private Curso curso;
	private JLabel lblTitulo;
	
	
	
	public TelaCadastroCurso() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("CADASTRO CURSO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(800, 600);
		setModal(true);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 153, 51));
		panel.setBounds(0, 459, 794, 112);
		getContentPane().add(panel);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				codigo = Integer.parseInt(txtCodigo.getText());
				cargaHoraria = Integer.parseInt(txtCargaHoraria.getText());
				nome = txtNome.getText();
				area = comboBoxArea.getSelectedItem().toString();
				nivel = comboBoxNivel.getSelectedItem().toString();
				
				
				curso = new Curso(codigo, nome, area, nivel, cargaHoraria);
				System.out.println(curso);
				
				
				PersistenciaNoBanco.pegarInstancia().CadastrarCurso(curso);
				
			}
		});
		panel.add(btnSalvar);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int f = JOptionPane.showConfirmDialog(null, "Deseja Fechar a Janela?");
				if(f==0)
					dispose();
				else
				{	
				}
			}
		});
		btnFechar.setBounds(229, 11, 86, 57);
		panel.add(btnFechar);
		setVisible(true);

		
		lblCodigo = new JLabel("C\u00D3DIGO");
		lblCodigo.setFont(new Font("Arial Narrow", Font.PLAIN, 26));
		lblCodigo.setBounds(117, 142, 111, 28);
		getContentPane().add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(238, 142, 368, 29);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Arial Narrow", Font.PLAIN, 26));
		lblNome.setBounds(117, 86, 70, 20);
		getContentPane().add(lblNome);
		
		lblCargaHoraria = new JLabel("CARGA HOR\u00C1RIA");
		lblCargaHoraria.setFont(new Font("Arial Narrow", Font.PLAIN, 17));
		lblCargaHoraria.setBounds(117, 202, 125, 28);
		getContentPane().add(lblCargaHoraria);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(252, 204, 350, 28);
		getContentPane().add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(238, 88, 368, 28);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		lblArea = new JLabel("\u00C1REA");
		lblArea.setFont(new Font("Arial Narrow", Font.PLAIN, 23));
		lblArea.setBounds(117, 261, 63, 36);
		getContentPane().add(lblArea);
		
		comboBoxArea = new JComboBox();
		comboBoxArea.setModel(new DefaultComboBoxModel(new String[] {"Selecionar", "Exatas", "Humanas", "Sa\u00FAde"}));
		comboBoxArea.setBounds(238, 272, 121, 22);
		getContentPane().add(comboBoxArea);
		
		lblNivel = new JLabel("N\u00CDVEL");
		lblNivel.setFont(new Font("Arial Narrow", Font.PLAIN, 25));
		lblNivel.setBounds(117, 323, 105, 28);
		getContentPane().add(lblNivel);
		
		comboBoxNivel = new JComboBox();
		comboBoxNivel.setModel(new DefaultComboBoxModel(new String[] {"Selecionar", "T\u00E9cnico", "Superior"}));
		comboBoxNivel.setBounds(238, 331, 121, 22);
		getContentPane().add(comboBoxNivel);
		
		lblTitulo = new JLabel("Cadastro de Curso");
		lblTitulo.setForeground(new Color(255, 140, 0));
		lblTitulo.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblTitulo.setBounds(269, 11, 301, 36);
		getContentPane().add(lblTitulo);
		setVisible(true);
		
		
	}
}

package sistema_secretaria.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import persistencia.PersistenciaNoBanco;
import sistema_secretaria.modelos.Aluno;

import java.text.ParseException;

public class TelaCadastroAluno extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JButton btnSalvar;
	private JButton btnFechar;
	private JLabel lblMatricula;
	private JTextField txtMatricula;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JFormattedTextField txtCpf;
	private JTextField txtNome;
	private JLabel lblDataNascimento;
	private JFormattedTextField txtDataNascimento;
	private JLabel lblTelefone;
	private JFormattedTextField txtTelefone;
	private JLabel lblRua;
	private JTextField txtRua;
	private JLabel lblNumRua;
	private JTextField txtNumCasa;
	private JLabel lblBairro;
	private JTextField txtBairro;
	private JLabel lblCidade;
	private JTextField txtCidade;
	private JLabel lblSexo;
	private JComboBox comboBoxSexo;
	private int matricula ;
	private String cpf; 
	private String nome;
	private String telefone; 
	private String dataNascimento;
	private String rua; 
	private int numCasa;
	private String bairro;
	private String cidade; 
	private String sexo;
	private Aluno aluno;
	private JLabel tituloAluno;
	
	public TelaCadastroAluno() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("CADASTRO ALUNO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(800, 600);
		setModal(true);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 153, 51));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 480, 794, 91);
		getContentPane().add(panel);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				matricula = Integer.parseInt(txtMatricula.getText());
				cpf = txtCpf.getText();
				nome = txtNome.getText();
				telefone = txtTelefone.getText();
				dataNascimento = txtDataNascimento.getText();
				rua = txtRua.getText();
				numCasa = Integer.parseInt(txtNumCasa.getText());
				bairro = txtBairro.getText();
				cidade = txtCidade.getText();
				sexo = comboBoxSexo.getSelectedItem().toString();

				aluno = new Aluno(matricula, cpf, nome, telefone, dataNascimento, rua, numCasa, bairro, cidade, sexo);
				System.out.println(aluno);
				
				
				PersistenciaNoBanco.pegarInstancia().CadastrarAluno(aluno);
				
				
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
		
		
		lblMatricula = new JLabel("MATRICULA");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMatricula.setBounds(71, 61, 95, 30);
		getContentPane().add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(176, 66, 180, 25);
		getContentPane().add(txtMatricula);
		txtMatricula.setColumns(10);
		
		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		lblNome.setBounds(71, 134, 76, 30);
		getContentPane().add(lblNome);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Arial Narrow", Font.PLAIN, 22));
		lblCpf.setBounds(71, 102, 76, 30);
		getContentPane().add(lblCpf);
		
		txtCpf = new JFormattedTextField();
		txtCpf.setBounds(176, 102, 180, 20);
		getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		MaskFormatter mfCpf;
		try {
			mfCpf = new MaskFormatter("###.###.###-##");
			mfCpf.install(txtCpf);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		txtNome = new JTextField();
		txtNome.setBounds(176, 142, 359, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		lblDataNascimento = new JLabel("DATA DE NASCIMENTO");
		lblDataNascimento.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblDataNascimento.setBounds(71, 231, 122, 14);
		getContentPane().add(lblDataNascimento);
		
		txtDataNascimento = new JFormattedTextField();
		txtDataNascimento.setBounds(207, 229, 149, 20);
		getContentPane().add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		MaskFormatter mfDataNascimento;
		try {
			mfDataNascimento = new MaskFormatter("##/##/####");
			mfDataNascimento.install(txtDataNascimento);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setFont(new Font("Arial Narrow", Font.PLAIN, 17));
		lblTelefone.setBounds(71, 256, 85, 25);
		getContentPane().add(lblTelefone);
		
		txtTelefone = new JFormattedTextField();
		txtTelefone.setBounds(176, 260, 180, 20);
		getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		MaskFormatter mfTelefone;
		try {
			mfTelefone = new MaskFormatter("(##)#####-####");
			mfTelefone.install(txtTelefone);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		lblRua = new JLabel("RUA");
		lblRua.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		lblRua.setBounds(77, 301, 46, 14);
		getContentPane().add(lblRua);
		
		txtRua = new JTextField();
		txtRua.setBounds(176, 295, 369, 20);
		getContentPane().add(txtRua);
		txtRua.setColumns(10);
		
		lblNumRua = new JLabel("N\u00BA DA CASA");
		lblNumRua.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		lblNumRua.setBounds(71, 334, 95, 14);
		getContentPane().add(lblNumRua);
		
		txtNumCasa = new JTextField();
		txtNumCasa.setBounds(176, 334, 116, 20);
		getContentPane().add(txtNumCasa);
		txtNumCasa.setColumns(10);
		
		lblBairro = new JLabel("BAIRRO");
		lblBairro.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		lblBairro.setBounds(71, 375, 76, 20);
		getContentPane().add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(176, 375, 180, 20);
		getContentPane().add(txtBairro);
		txtBairro.setColumns(10);
		
		lblCidade = new JLabel("CIDADE");
		lblCidade.setFont(new Font("Arial Narrow", Font.PLAIN, 23));
		lblCidade.setBounds(71, 422, 76, 22);
		getContentPane().add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(176, 422, 193, 20);
		getContentPane().add(txtCidade);
		txtCidade.setColumns(10);
		
		lblSexo = new JLabel("SEXO");
		lblSexo.setFont(new Font("Arial Narrow", Font.PLAIN, 22));
		lblSexo.setBounds(71, 184, 52, 25);
		getContentPane().add(lblSexo);
		
		comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Feminino", "Masculino"}));
		comboBoxSexo.setBounds(179, 184, 102, 22);
		getContentPane().add(comboBoxSexo);
		
		tituloAluno = new JLabel("CADASTRO DE ALUNO");
		tituloAluno.setForeground(new Color(255, 165, 0));
		tituloAluno.setFont(new Font("Arial Black", Font.PLAIN, 28));
		tituloAluno.setBounds(216, 11, 400, 31);
		getContentPane().add(tituloAluno);
		setVisible(true);
	}
}

package sistema_secretaria.GUI;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.Point;
import java.awt.Label;
import java.awt.Scrollbar;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.SystemColor;

public class TelaPrincipal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuBar;
	private JMenu mnAluno;
	private JMenuItem mntmCadastrarAluno;
	private JMenuItem mntmCadastrarCurso;
	private JMenu mnSair;
	
	

	public TelaPrincipal() {
		setResizable(false);
		setSize(800, 600);
		setTitle("Tela Principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAluno = new JMenu("Aluno");
		menuBar.add(mnAluno);
		
		mntmCadastrarAluno = new JMenuItem("Cadastrar Aluno");
		mnAluno.add(mntmCadastrarAluno);
		mntmCadastrarAluno.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TelaCadastroAluno();
			}
		});
		
		
		JMenu mnCurso = new JMenu("Curso");
		menuBar.add(mnCurso);
		
		mntmCadastrarCurso = new JMenuItem("Cadastrar Curso");
		mntmCadastrarCurso.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TelaCadastroCurso();
			}
		});
		mnCurso.add(mntmCadastrarCurso);
		
		mnSair = new JMenu("Sair");
		mnSair.addMenuListener(new MenuListener() {
			
			@Override
			public void menuSelected(MenuEvent e) {
				// TODO Auto-generated method stub
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair da aplicação?");
				if(resposta == 0)
				{
					System.exit(0);
				}
				else
				{
					
				}
			}
			
			@Override
			public void menuDeselected(MenuEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void menuCanceled(MenuEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		menuBar.add(mnSair);
		setVisible(true);
	}
}

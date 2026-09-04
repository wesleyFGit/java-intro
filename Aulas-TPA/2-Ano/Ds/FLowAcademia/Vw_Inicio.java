package academiaFlow_View;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Vw_inicio {

	public static void main(String[] args) {
		
    	//Linhas verdes
    	JPanel linhaV = new JPanel();
    	linhaV.setBackground(new Color(168,255,42));
    	linhaV.setBounds(300,0,10,1000);
    	JPanel linhaH = new JPanel();
    	linhaH.setBackground(new Color(168,255,42));
    	linhaH.setBounds(300,180,1800,10);
    	
    	//botoes dados alunos
    	JLabel L_alunosInativos = new JLabel();
    	L_alunosInativos.setText("Número de alunos inativos (+1 mes)");
    	JLabel L_alunosAtivos = new JLabel();
    	L_alunosAtivos.setText("Número de alunos ativos");
    	JLabel L_alunosNovos = new JLabel();
    	L_alunosNovos.setText("Número de alunos novos");
    	
    	JPanel alunos_Inativos = new JPanel();
    	alunos_Inativos.setBackground(new Color(168,255,42));
    	alunos_Inativos.setBounds(320,200,320,240);
    	JPanel alunos_Ativos = new JPanel();
    	alunos_Ativos.setBackground(new Color(168,255,42));
    	alunos_Ativos.setBounds(650,200,320,240);
    	JPanel alunos_Novos = new JPanel();
    	alunos_Novos.setBackground(new Color(168,255,42));
    	alunos_Novos.setBounds(980,200,320,240);
    	
    	//botoes crud
    	JLabel L_cadastrar = new JLabel();
    	L_cadastrar.setText("Cadastrar");
    	JLabel L_atualizar = new JLabel();
    	L_atualizar.setText("Atualizar");
    	JLabel L_deletar = new JLabel();
    	L_deletar.setText("Deletar");
    	
    	
    	JPanel cadastrar = new JPanel();
    	cadastrar.setBackground(new Color(33,255,248));
    	cadastrar.setBounds(320,450,520,500);
    	JPanel atualizar = new JPanel();
    	atualizar.setBackground(new Color(33,255,248));
    	atualizar.setBounds(850,450,520,500);
    	JPanel deletar = new JPanel();
    	deletar.setBackground(new Color(33,255,248));
    	deletar.setBounds(1380,450,515,500);
    	
    	//logo Flow academia
    	JPanel logoContainer = new JPanel();
    	logoContainer.setBounds(320,10,500,160);
    	
    	
    	ImageIcon logoIcon = new ImageIcon("FlowLogo.png");
    	JLabel logo = new JLabel();
    	logo.setIcon(logoIcon); 
    	
    	
    	JFrame inicio = new JFrame();
    	inicio.setLayout(null);
    	inicio.setTitle("Menu");
    	inicio.setSize(1920, 1080);
    	inicio.getContentPane().setBackground(new Color(12,12,12));
    	
    	//linhas verdes 
    	inicio.add(linhaV);
    	inicio.add(linhaH);
    	
    	//botoes dados alunos
    	alunos_Inativos.add(L_alunosInativos);
    	inicio.add(alunos_Inativos);
    	
    	alunos_Ativos.add(L_alunosAtivos);
    	inicio.add(alunos_Ativos);
    	
    	alunos_Novos.add(L_alunosNovos);
    	inicio.add(alunos_Novos);
    	
    	//botoes crud
    	cadastrar.add(L_cadastrar);
    	inicio.add(cadastrar);

    	atualizar.add(L_atualizar);
    	inicio.add(atualizar);

    	deletar.add(L_deletar);
    	inicio.add(deletar);
    	
    	//logo
    	logoContainer.add(logo);
    	inicio.add(logoContainer); 
    	
    	
    	inicio.setVisible(true);

	}

}

package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {

	public void criarTela() {
		
		JFrame telaRetangulo = new JFrame();
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaRetangulo.setSize(500, 300);
		telaRetangulo.setTitle("Cálculos com retângulo");
		telaRetangulo.setLayout(null);
		
		// *** Criar  Label e TextField da altura
		JLabel labelAltura = new JLabel ();
		labelAltura.setText("Altura: ");
		//** Definir a posição do tamanho do label ( x , y , w , h)
		labelAltura.setBounds(10, 10, 60, 30);
		
		//*** Criar um TextFild
		
		JTextField  textAltura = new JTextField();
		textAltura.setBounds(70, 10, 50, 30);
		
		// Criar um Label Base
		
		JLabel labelBase = new JLabel();
		labelBase.setText("Base: ");
		labelBase.setBounds(10, 50, 60, 30);
		
		// CONTRUIR JTEXTFIELD base //
		JTextField  textBase = new JTextField();
		textBase.setBounds(70, 50, 50, 30);
		
		//** criar botao Calcular***//
		
		JButton buttonCalcular = new JButton ();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(10, 100, 110, 30);
		 
		//*** botão limpar***//
		JButton buttonLimpar = new JButton ();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(10, 140, 110, 30);
		
		//*** Lables resultados **//
		
		JLabel labelArea = new JLabel();
		labelArea.setText("Área: ");
		labelArea.setBounds(150, 10, 70, 30);
		
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Perimetro: ");
		labelPerimetro.setBounds(150,50, 100, 30);
		
		//*** Colocar label altura dentro do painel de conteúdo 
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		telaRetangulo.getContentPane().add(buttonLimpar);
		telaRetangulo.getContentPane().add(labelArea);
		telaRetangulo.getContentPane().add(labelPerimetro);
		
		
		telaRetangulo.setVisible(true);
		
		//*** Ouvintes de ações/eventos 
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Retangulo r1 = new Retangulo();
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText()));
				labelArea.setText( "Área: " + String.valueOf(r1.calcularArea()));
				labelPerimetro.setText("Perimetro: " + String.valueOf(r1.calcularPerimetro()));
			}
		});
		
	}
}

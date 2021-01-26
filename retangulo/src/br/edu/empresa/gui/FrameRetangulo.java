package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		labelAltura.setBounds(10, 10, 80, 30);
		
		//*** Criar um TextFild
		
		JTextField  textAltura = new JTextField();
		textAltura.setBounds(90, 10, 100, 30);
		
		// Criar um Label e TextField
		
		JLabel labelBase = new JLabel();
		labelBase.setText(null);
		labelBase.setText("Base: ");
		labelBase.setBounds(90, 45, 80, 30);
		
		JTextField  textBase = new JTextField();
		textBase.setBounds(90, 45, 100, 30);
		
		//** criar botao
		
		JButton buttonCalcular = new JButton ();
		buttonCalcular.setText("Calcular");
		Color laranja = new Color (255,180,0);
		buttonCalcular.setBackground(laranja);
		buttonCalcular.setBounds(10, 95, 180, 30);
		
		//*** Colocar label altura dentro do painel de conteúdo 
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		
	
		
		telaRetangulo.setVisible(true);
		
		//*** Cliques na tela 
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			Retangulo r = new Retangulo();
			r.setAltura(Double.parseDouble(textAltura.getText()));
			r.setBase(Double.parseDouble(textBase.getText()));
			
			labelAltura.setText(String.copyValueOf(r.calcularArea()));
			labelBase.setText(String.copyValueOf(r.calcularPerimetro()));
			}
		});
		
	}
}

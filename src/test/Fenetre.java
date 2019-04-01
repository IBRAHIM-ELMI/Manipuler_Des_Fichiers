package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Fenetre extends JFrame{
	
	
	public Fenetre(Personne[] p) throws IOException{
		
		JList b = new JList();
		DefaultListModel model = new DefaultListModel();
		for (Personne str : p) {
		model.addElement(str);
		}
		b.setModel(model);
		add(b,BorderLayout.CENTER);
		
		JPanel jp = new JPanel();
		JButton sauve = new JButton("Sauve");
		JButton annuler = new JButton("Annuler");
		jp.add(sauve, BorderLayout.EAST);
		jp.add(annuler, BorderLayout.WEST);
		add(jp, BorderLayout.SOUTH);
		
		//ajoute un texte
		JPanel pp = new JPanel();
		pp.setBackground(Color.GREEN);
		JTextArea k = new JTextArea("Je m'appelle youssouf "
				+ " En Formation à ISSMI "
				+ "Institut privé au Système au metier Informatique");
		
		pp.add(k);
		add(k, BorderLayout.NORTH);
		
		
		
		
		//ImageIcon image = new ImageIcon ("C:/Users/Youssouf IBRAHIM/Desktop/tof_youssouf.jpg");
		
		/*
		ImageIcon image = new ImageIcon ("C:/Users/Youssouf IBRAHIM/Desktop/tof_youssouf.jpg");
		JLabel icon = new JLabel(image);
		add(jp1,BorderLayout.EAST);
		*/
		
		
		
		
		
		//Action de sauve apres click
		sauve.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent r) {
			try {
				Copie.sauve(new File("copie.txt"), p);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		});
		
		//action annuler 
		annuler.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Annulation réussi");
			}
			
			
		});
		
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
			
			
			
			
package com.Simon.jeu;


import javax.swing.JFrame;


public class Main {
	
	public static JFrame fenetre; 
	public static Scene scene;
	
	
	public static void main(String[] args) {
		
		fenetre = new JFrame("Tron");
		scene = new Scene();
		
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(600,400);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		
		
		fenetre.setContentPane(scene);
		 
		fenetre.setVisible(true);
	
		

	}

}

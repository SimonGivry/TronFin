package com.Simon.jeu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JPanel;

import com.Simon.Joueur.Perso;
import javax.swing.JOptionPane;

public class Scene extends JPanel{
	

	private Image ImgFond;
	private ImageIcon icoFond;
	public Perso perso;
	public boolean finDuJeu;

	
	public Scene()
	{	
		super();
		this.finDuJeu = false;
		this.icoFond = new ImageIcon(getClass().getResource("/Images/noir.jpg"));
		this.ImgFond = this.icoFond.getImage();
		this.setBorder(BorderFactory.createLineBorder(Color.red, 6));
		this.perso = new Perso(300,200,"/Images/carre.png");
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		Thread chrono = new Thread(new Chrono());
		chrono.start();
	}
	public boolean collisionPerso()
	{
		boolean finDuJeu = false;
				
		if(this.perso.getY()< 0 || this.perso.getY()> 362)
		{
			finDuJeu = true;
									
		}
		if(this.perso.getX()< 0 || this.perso.getX()> 592)
		{
			finDuJeu = true;
									
		}
		
		
		return finDuJeu;
	}
	public void paintComponent(Graphics g )
	{	
		this.finDuJeu = this.collisionPerso();
		if(finDuJeu ==true)
		{
			JOptionPane.showMessageDialog(this,"Lose!!!"
					+ "\nTry Again ","crash", JOptionPane.ERROR_MESSAGE);

	
		}
		g.drawImage(this.ImgFond,0,0,null);
		g.drawImage(this.perso.getImgPerso(),this.perso.getX(),this.perso.getY(),null);
		
	}
	
	
}

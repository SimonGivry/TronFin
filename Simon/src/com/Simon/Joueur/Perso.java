package com.Simon.Joueur;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Perso {

	private int largeur; 
	private int hauteur;
	private int x; 
	private int y ; 
	private int dx; 
	private int dy; 
	private Image imgPerso;
	private String strImage;
	private ImageIcon icoPerso;
	
	
	public Perso(int x, int y, String strImage)
	{
		this.largeur = 2;
		this.hauteur = 2;
		this.x = x; 
		this.y = y;
		this.strImage = strImage;
		this.icoPerso = new ImageIcon(getClass().getResource(this.strImage));
		this.imgPerso= this.icoPerso.getImage();
		
		
		
	}


	public int getLargeur() {
		return largeur;
	}


	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}


	public int getHauteur() {
		return hauteur;
	}


	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Image getImgPerso() {
		return imgPerso;
	}


	public void setImgPerso(Image imgPerso) {
		this.imgPerso = imgPerso;
	}
	
	public void up()
	{
		this.dy = 4;
		this.y = this.y - this.dy;
	}
	public void down()
	{
		this.dy = 4;
		this.y = this.y + this.dy;
	}
	public void right()
	{
		this.dx = 4;
		this.x = this.x + this.dx;
	}
	public void left()
	{
		this.dx = 4;
		this.x = this.x - this.dx;
	}
	
}

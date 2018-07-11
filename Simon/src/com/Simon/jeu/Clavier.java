package com.Simon.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Clavier implements KeyListener
{

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			Main.scene.perso.up();
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			Main.scene.perso.down();
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			Main.scene.perso.right();
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			Main.scene.perso.left();
		}
	
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}

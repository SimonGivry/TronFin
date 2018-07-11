package com.Simon.jeu;

public class Chrono implements Runnable{

	private final int PAUSE = 5;
	@Override
	public void run() {
		while(Main.scene.finDuJeu == false)
		{
			Main.scene.repaint();
			try {
				Thread.sleep(this.PAUSE);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
		// TODO Auto-generated method stub
		
	}

}

package TronMaven.TronGit;

import TronMaven.TronGit.*;

//rafraichissement de l'affichage
public class Chrono implements Runnable{
	
	//temps de pause entre chaque tour de boucle avant de repeindre l'écran
	private final int PAUSE = 10;		//en milliseconde

	public void run() {
		
		//boucle infini
		while(true) {
			
			//On repeint
			main.scene.repaint();
			
			//Gère les bugs car fonction pas sur
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
			
			
		}
		
	}

}

package TronMaven.TronGit;

/**
 * Cette classe s'occupe du raffraichissement de la fenêtre.
 * 
 * @author Thomas
 *
 */
public class Chrono implements Runnable{
	
	/**
	 * PAUSE est le temps en milliseconde entre chaque raffraichissement.
	 * 
	 * @see Chrono#run()
	 */
	private final int PAUSE = 10;		

	
	/**
	 * Dans cette méthode, il y a une boucle infini qui repeint à intervalle régulier.
	 * Cette intervalle équivaut à PAUSE.
	 * 
	 * @see main
	 * @see Chrono#PAUSE
	 */
	public void run() {
		
		while(true) {
			main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
			
			
		}
		
	}

}

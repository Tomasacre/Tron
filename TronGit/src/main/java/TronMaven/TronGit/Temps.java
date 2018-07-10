package TronMaven.TronGit;


/**
 * Cette classe s'occupe de gérer le temps de jeux.
 * 
 * @author Thomas
 *
 */
public class Temps implements Runnable{
	
	/**
	 * PAUSE est le temps en milliseconde entre chaque incrémentation de compteurTemps.
	 * 
	 * @see Temps#run()
	 */
	private final int PAUSE = 1000;
	
	/**
	 * compteurTemps s'inccrémente de 1 toute les secondes.
	 * 
	 * @see Temps#Temps()
	 * @see Temps#getCompteurTemps()
	 */
	private int compteurTemps;
	
	/**
	 * Constructeur de Temps
	 * 
	 * On initialise le comteur à 0 et on le démarre.
	 * 
	 * @see Temps#compteurTemps
	 */
	public Temps() {
		
		this.compteurTemps=0;
		
		Thread temps = new Thread(this);
		temps.start();
	}
	
	
	/**
	 * retourne le compteur de temps
	 * 
	 * @return le temps depuis le lancement du programme.
	 */
	public int getCompteurTemps() {
		return compteurTemps;
		
	}

	/**
	 * Incrémente le compteur de temps toutes les secondes.
	 * 
	 * Cette méthode attend 1 seconde (le temps de PAUSE) puis ajoute 1 au compteur de temps (en seconde) en boucle.
	 * Elle répète cette opération du lancement du programme jusqu'à ça fin.
	 * 
	 * @see Temps#PAUSE
	 * @see Temps#compteurTemps
	 */
	public void run() {

		while(true) {
			try{
				Thread.sleep(PAUSE);
			}
			catch (InterruptedException e) {}
			this.compteurTemps++;
		
		}
		
	}

}

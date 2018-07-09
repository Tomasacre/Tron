package TronMaven.TronGit;

public class Temps implements Runnable{
	
	private final int PAUSE = 1000;
	private int compteurTemps;
	
	
	public Temps() {
		
		this.compteurTemps=0;
		
		Thread temps = new Thread(this);
		temps.start();
	}
	
	public int getCompteurTemps() {
		return compteurTemps;
		
	}



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

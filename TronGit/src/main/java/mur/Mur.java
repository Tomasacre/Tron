package mur;

public class Mur {
	
	private int largeur;
	private int hauteur;
	private int x;
	private int y;
	
	
	//Constructeur
	public Mur(int x, int y) {
		this.largeur = 2;
		this.hauteur = 2;
		this.x=x;
		this.y=y;
	}


	public int getLargeur() {
		return largeur;
	}


	
	public int getHauteur() {
		return hauteur;
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
	

	
	
	
}
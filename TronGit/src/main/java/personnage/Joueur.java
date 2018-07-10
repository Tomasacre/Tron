package personnage;

import TronMaven.TronGit.*;

/**
 * Classe Joueur
 * 
 * Cette classe défini les paramètres de tous les joueurs.
 * 
 * @author Thomas
 * 
 * @see J1
 * @see J2
 * @see Scene
 */
public class Joueur {
	
	/**
	 * Coordonnées x et y des joueurs.
	 */
	protected int x,y;
	
	
	/**
	 * Constructeur de la classe joueur.
	 * 
	 * @param x
	 * 			Coordonnées x du joueur.
	 * @param y
	 * 			Coordonnées y du joueur.
	 */
	public Joueur (int x, int y) {
		this.x=x;
		this.y=y;
	}
}

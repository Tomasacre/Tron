package mur;

import TronMaven.TronGit.*;

/**
 * Classe mur
 * 
 * Cette classe défini les paramètres de tous les murs.
 * 
 * @author Thomas
 *
 * @see MurJaune
 * @see MurRouge
 * @see Scene 
 */
public class Mur {
	
	/**
	 * Coordonnées x et y des murs.
	 */
	private int x,y;


	/**
	 * Constructeur de la classe mur.
	 * 
	 * @param x
	 * 			Coordonnées x du mur.
	 * @param y
	 * 			Coordonnées y du mur.
	 */
	public Mur(int x, int y) {

		this.x=x;
		this.y=y;		
	}	
}

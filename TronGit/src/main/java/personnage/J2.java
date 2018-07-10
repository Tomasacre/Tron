package personnage;

import java.awt.Image;

import TronMaven.TronGit.*;

import javax.swing.ImageIcon;


/**
 * Classe définnissant le joueur 2.
 * Cette classe hérite de joueur.
 * 
 * @author Thomas
 *
 * @see Joueur
 * @see Scene
 */
public class J2 extends Joueur{
	
	/**
	 * Stockage de l'image du joueur 2.
	 * 
	 * @see J2#getImgJ2()
	 */
	private Image imgJ2;
	private ImageIcon icoJ2;
	
	/**
	 * Constructeur de J2.
	 * 
	 * Il initialise ses coordonnées ainsi que son sprite.
	 * 
	 * @param x
	 * 			Coordonnées x.
	 * @param y
	 * 			Coordonnées y.
	 * 
	 * @see J2#getImgJ2()
	 * @see Joueur
	 */
	public J2(int x, int y) {
		super(x, y);
		this.icoJ2 = new ImageIcon(getClass().getResource("/image/J2.png"));
		this.imgJ2 = this.icoJ2.getImage();
	}
	
	
	/**
	 * Méthode pour obtenir l'image de J2.
	 * 
	 * @return l'image du joueur 2.
	 * 
	 * @see J2#J2(int, int)
	 */
	public Image getImgJ2() {
		return imgJ2;
	}

}

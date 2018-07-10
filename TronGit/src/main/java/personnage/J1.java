package personnage;

import java.awt.Image;
import TronMaven.TronGit.*;

import javax.swing.ImageIcon;


/**
 * Classe définnissant le joueur 1.
 * Cette classe hérite de joueur.
 * 
 * @author Thomas
 * 
 * @see Joueur
 * @see Scene
 */
public class J1 extends Joueur{
	
	/**
	 * Stockage de l'image du joueur 1.
	 * 
	 * @see J1#getImgJ1()
	 */
	private Image imgJ1;
	private ImageIcon icoJ1;

	/**
	 * Constructeur de J1.
	 * 
	 * Il initialise ses coordonnées ainsi que son sprite.
	 * 
	 * @param x
	 * 			Coordonnées x.
	 * @param y
	 * 			Coordonnées y.
	 * 
	 * @see J1#getImgJ1()
	 * @see Joueur
	 */	
	public J1(int x, int y) {
		super(x, y);
		this.icoJ1 = new ImageIcon(getClass().getResource("/image/J1.png"));
		this.imgJ1 = this.icoJ1.getImage();
	}
	
	
	/**
	 * Méthode pour obtenir l'image de J1.
	 * 
	 * @return l'image du joueur 1.
	 * 
	 * @see J1#J1(int, int)
	 */
	public Image getImgJ1() {
		return imgJ1;
	}

}

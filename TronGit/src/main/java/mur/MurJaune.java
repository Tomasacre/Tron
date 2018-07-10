package mur;

import java.awt.Image;

import javax.swing.ImageIcon;

import TronMaven.TronGit.*;



/**
 * Classe définnissant les murs du joueur 1.
 * Cette classe hérite de mur.
 * 
 * @author Thomas
 * 
 * @see Mur
 * @see Scene
 */
public class MurJaune extends Mur{
	
	/**
	 * Stockage de l'image du mur.
	 * 
	 * @see MurJaune#getImgJ1()
	 */
	private Image imgJ1;
	private ImageIcon icoJ1;
	
	/**
	 * Constructeur du murJaune.
	 * 
	 * Il initialise ses coordonnées ainsi que son sprite.
	 * 
	 * @param x
	 * 			Coordonnées x.
	 * @param y
	 * 			Coordonnées y.
	 * 
	 * @see MurJaune#getImgJ1()
	 * @see Mur
	 */
	public MurJaune(int x, int y) {
		super(x, y);
		this.icoJ1 = new ImageIcon(getClass().getResource("/image/J1.png"));
		this.imgJ1 = this.icoJ1.getImage();
	}
	
	
	/**
	 * Méthode pour obtenir l'image de murJaune.
	 * 
	 * @return l'image du mur Jaune.
	 * 
	 * @see MurJaune#MurJaune(int, int)
	 */
	public Image getImgJ1() {
		return imgJ1;
	}

}

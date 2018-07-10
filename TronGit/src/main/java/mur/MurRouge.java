package mur;

import java.awt.Image;

import javax.swing.ImageIcon;

import TronMaven.TronGit.*;


/**
 * Classe définnissant les murs du joueur 2.
 * Cette classe hérite de mur.
 * 
 * @author Thomas
 *
 * @see Mur
 * @see Scene
 */
public class MurRouge extends Mur{
	
	/**
	 * Stockage de l'image du mur.
	 * 
	 * @see MurRouge#getImgJ2()
	 */
	private Image imgJ2;
	private ImageIcon icoJ2;
	
	/**
	 * Constructeur du murRouge.
	 * 
	 * Il initialise ses coordonnées ainsi que son sprite.
	 * 
	 * @param x
	 * 			Coordonnées x.
	 * @param y
	 * 			Coordonnées y.
	 * 
	 * @see MurRouge#getImgJ2()
	 * @see Mur
	 */
	public MurRouge(int x, int y) {
		super(x, y);
		this.icoJ2 = new ImageIcon(getClass().getResource("/image/J2.png"));
		this.imgJ2 = this.icoJ2.getImage();
	}
	
	
	/**
	 * Méthode pour obtenir l'image de murRouge.
	 * 
	 * @return l'image du mur Rouge.
	 * 
	 * @see MurRouge#MurRouge(int, int)
	 */
	public Image getImgJ2() {
		return imgJ2;
	}

}

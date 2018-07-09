package personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class J2 extends Joueur{
	
	private Image imgJ2;
	private ImageIcon icoJ2;

	
	
	public J2(int x, int y) {
		super(x, y);
		this.icoJ2 = new ImageIcon(getClass().getResource("/image/J2.png"));
		this.imgJ2 = this.icoJ2.getImage();
	}
	
	
	
	public Image getImgJ2() {
		return imgJ2;
	}

}

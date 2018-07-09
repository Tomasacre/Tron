package personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class J1 extends Joueur{
	
	private Image imgJ1;
	private ImageIcon icoJ1;

	
	
	public J1(int x, int y) {
		super(x, y);
		this.icoJ1 = new ImageIcon(getClass().getResource("/image/J1.png"));
		this.imgJ1 = this.icoJ1.getImage();
	}
	
	
	
	public Image getImgJ1() {
		return imgJ1;
	}

}

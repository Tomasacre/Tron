package mur;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MurJaune extends Mur{
	
	private Image imgJ1;
	private ImageIcon icoJ1;
	
	public MurJaune(int x, int y) {
		super(x, y);
		this.icoJ1 = new ImageIcon(getClass().getResource("/image/J1.png"));
		this.imgJ1 = this.icoJ1.getImage();
	}
	
	
	public Image getImgJ1() {
		return imgJ1;
	}

}

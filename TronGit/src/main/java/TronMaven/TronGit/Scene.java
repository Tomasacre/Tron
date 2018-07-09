package TronMaven.TronGit;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mur.MurJaune;
import mur.MurRouge;
import personnage.J1;
import personnage.J2;



@SuppressWarnings("serial") // Pas de numéro de série à cette classe
public class Scene extends JPanel {

	
	JOptionPane j1Loose, j2Loose;

	
	
	// Stockage des images
	private ImageIcon icoFond;
	private Image imgFond;

	
	// Coordonnées des images
	private int xFond;

	private int xJ1;
	private int yJ1;

	private int dx1; // gère les déplacements
	private int dy1;

	private int xJ2;
	private int yJ2;

	private int dx2;
	private int dy2;

	
	
	public J1 j1;
	public J2 j2;

	public MurJaune murJaune;
	public MurRouge murRouge;

	
	
	int Map[][] = new int[600][400];
	private int i;
	private int j;
	private int fin = 0;

	
	private Temps temps;

	
	
	
	// Constructeur
	public Scene() {
		super();

		// On place les images
		this.xFond = -350;

		this.xJ1 = 20;
		this.yJ1 = 20;

		this.dx1 = 0;
		this.dy1 = 2;

		this.xJ2 = 1180;
		this.yJ2 = 780;

		this.dx2 = 0;
		this.dy2 = -2;

		
		
		icoFond = new ImageIcon(getClass().getResource("/image/fond.png"));
		this.imgFond = this.icoFond.getImage();

		j1 = new J1(xJ1, yJ1);
		j2 = new J2(xJ2, yJ2);

		this.setFocusable(true);
		this.requestFocusInWindow(); // Récupérer le focus
		this.addKeyListener(new Clavier());

		
		temps = new Temps();

		// instance du chrono
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();

	}

	
	
	public int getDx1() {
		return dx1;
	}

	public int getDy1() {
		return dy1;
	}

	public int getDx2() {
		return dx2;
	}

	public int getDy2() {
		return dy2;
	}

	public void setDx1(int dx1) {
		this.dx1 = dx1;
	}

	public void setDy1(int dy1) {
		this.dy1 = dy1;
	}

	public void setDx2(int dx2) {
		this.dx2 = dx2;
	}

	public void setDy2(int dy2) {
		this.dy2 = dy2;
	}

	
	
	// Déplacement J1
	public void deplacementJ1() {

		this.xJ1 = this.xJ1 + this.dx1;
		this.yJ1 = this.yJ1 + this.dy1;
		// if(this.xJ1<0 || this.xJ1>1200 ||this.yJ1<0||this.yJ1>800)
		// System.out.println("J1 est sorti de l'écran");
		// main.main(fenetre).setVisible(true);
		// fenetre=null;

		// System.gc();

		/*
		 * j1Loose = new JOptionPane(); j1Loose.showMessageDialog(null,
		 * "Joueur 2 a gagné", "Fin de partie", JOptionPane.WARNING_MESSAGE);
		 */
	}

	// Déplacement J2
	public void deplacementJ2() {

		this.xJ2 = this.xJ2 + this.dx2;
		this.yJ2 = this.yJ2 + this.dy2;
	}

	
	
	
	private void majMap(int x, int y, int couleur) {
		Map[div(x)][div(y)] = couleur;
	
	}
	
	
	private int draw (int ii, int jj) {
		int color = 0;
		if (Map[ii][jj] == 1) {
			color=1;
		}
		if (Map[ii][jj] == 2) {
			color=2;
		}
		return color;
	}
	
	
	
	
	public int div(int g) {
		g=g/2;
		return g;
	}
	
	public int mul(int h) {
		h=h*2;
		return h;
	}
	
	
	
	// Permet de dessiner en java
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Améliore les graphiques

		this.deplacementJ1();
		this.deplacementJ2();

		if (fin == 1) {
			this.xJ1 = 20;
			this.yJ1 = 20;
			this.dx1 = 0;
			this.dy1 = 0;
			this.xJ2 = 1180;
			this.yJ2 = 780;
			this.dx2 = 0;
			this.dy2 = 0;
		} 
		else if (this.xJ1 < 0 || this.xJ1 > 1200 || this.yJ1 < 0 || this.yJ1 > 800 || Map[div(xJ1)][div(yJ1)] != 0) {
			/*
			 * this.xJ1 = 20; this.yJ1 = 18; this.dx1 = 0; this.dy1 = 0; this.xJ2 = 1180;
			 * this.yJ2 = 782; this.dx2 = 0; this.dy2 = 0;
			 */
			// System.out.println("J1 est sorti de l'écran");
			// fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			j1Loose = new JOptionPane();
			fin = 1;
			j1Loose.showMessageDialog(null, "Joueur 2 a gagné en " + this.temps.getCompteurTemps() + " secondes.","Fin de partie", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} 
		else if (this.xJ2 < 0 || this.xJ2 > 1200 || this.yJ2 < 0 || this.yJ2 > 800 || Map[div(xJ2)][div(yJ2)] != 0) {
			/*
			 * this.xJ1 = 20; this.yJ1 = 18; this.dx1 = 0; this.dy1 = 0; this.xJ2 = 1180;
			 * this.yJ2 = 782; this.dx2 = 0; this.dy2 = 0;
			 */
			// System.out.println("J2 est sorti de l'écran");
			j2Loose = new JOptionPane();
			fin = 1;
			j2Loose.showMessageDialog(null, "Joueur 1 a gagné en " + this.temps.getCompteurTemps() + " secondes.","Fin de partie", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}

		
		
		murJaune = new MurJaune(xJ1, yJ1);
		murRouge = new MurRouge(xJ2, yJ2);
		
		majMap(xJ1, yJ1, 1);
		majMap(xJ2, yJ2, 2);

		//Map[xJ1 / 2][yJ1 / 2] = 1;
		//Map[xJ2 / 2][yJ2 / 2] = 2;

		
		
		// Dessin des images
		g2.drawImage(this.imgFond, this.xFond, 0, null);
		g2.drawImage(this.j1.getImgJ1(), this.xJ1, this.yJ1, null);
		g2.drawImage(this.j2.getImgJ2(), this.xJ2, this.yJ2, null);

		
		for (i = 0; i < 600; i++) {
			for (j = 0; j < 400; j++) {
				draw(i , j);
				if (draw(i , j) == 1) {
					g2.drawImage(this.murJaune.getImgJ1(), mul(i), mul(j), null);
				}
				if (draw(i , j) == 2) {
					g2.drawImage(this.murRouge.getImgJ2(), mul(i), mul(j), null);
				}
			}
		}



	}

}

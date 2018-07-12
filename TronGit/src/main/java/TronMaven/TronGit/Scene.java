package TronMaven.TronGit;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mur.*;
import personnage.*;




/**
 * La classe Scene est la classe centrale du programme
 * 
 * Elle gère principalement l'affichage mais égalment la fin de partie ainsi que la map
 * 
 * 
 * @see main
 * @see Joueur
 * @see Mur
 * @see Temps
 * @see Chrono
 * @see Clavier
 * 
 * 
 * @author Thomas
 *
 */
@SuppressWarnings("serial")
public class Scene extends JPanel {

	
	/**
	 * j1Loose et j2Loose sont les fenêtres de fin de partie
	 */	
	JOptionPane j1Loose, j2Loose;


	/**
	 * Stockage de l'image de fond
	 */
	private ImageIcon icoFond;
	private Image imgFond;

	/**
	 * Coordonnées de l'image de fond
	 */	
	private int xFond;	
	
	/**
	 * Coordonnées x et y du joueur 1
	 */
	private int xJ1;
	private int yJ1;
		
	/**
	 * Variables de déplacment du joueur 1 en x et en y
	 */
	private int dx1; 
	private int dy1;

	/**
	 * Coordonnées x et y du joueur 2
	 */
	private int xJ2;
	private int yJ2;

	/**
	 * Variables de déplacment du joueur 2 en x et en y
	 */
	private int dx2;
	private int dy2;

	
	/**
	 * Le joueur 1
	 * 
	 * @see J1
	 */
	public J1 j1;
	/**
	 * Le joueur 2
	 * 
	 * @see J2
	 */
	public J2 j2;

	
	/**
	 * Les murs produit par le joueur 1
	 * 
	 * @see MurJaune
	 */
	public MurJaune murJaune;
	/**
	 * Les murs produit par le joueur 2
	 * 
	 * @see MurRouge
	 */
	public MurRouge murRouge;

	
	/**
	 * Tableau en 2 dimensions représentant la map.
	 * A l'initialisation la map est vide.
	 * Par la suite, les 1 représenteront les murs laissés par le joueur 1.
	 * Les 2 représenteront les murs laissés par le joueur 2.
	 */
	int Map[][] = new int[601][401];
	/**
	 * i et j sont les variables pour parcourir la map.
	 */
	private int i,j;
	/**
	 * fin passe à 1 lorsque l'un des joueurs perd.
	 */
	private int fin = 0;

	/**
	 * Initialisation de temps pour le chrono
	 * 
	 * @see Temps
	 */
	private Temps temps;

	
	
	
	/**
	 * Constructeur Scene
	 * 
	 * A la construction de scene, on place l'image de fond et les motos au bon endroit.
	 * On initialise également les déplacements des motos afin qu'elles avancent.
	 * 
	 * On va chercher l'image de fond.
	 * 
	 * On crée de nouveaux objets joueurs.
	 * 
	 * On récupère le focus e la fenêtre.
	 * On lui permet également de lire le clavier.
	 * 
	 * On initilaise le chrono et on le démarre.
	 * 
	 * @see Temps
	 * @see Chrono
	 * 
	 */
	public Scene() {
		super();

		
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
		this.requestFocusInWindow(); 
		this.addKeyListener(new Clavier());

		
		temps = new Temps();

		
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();

	}

	

	/**
	 * Met à jour le déplacement en x du joueur 1.
	 * 
	 * @param dx1
	 * 			Le nouveau déplacement en x du joueur 1.
	 * 
	 * @see Clavier#moveJ1(int, int)
	 */
	public void setDx1(int dx1) {
		this.dx1 = dx1;
	}

	/**
	 * Met à jour le déplacement en y du joueur 1.
	 * 
	 * @param dy1
	 * 			Le nouveaux déplacement en y du joueur 1.
	 * 
	 * @see Clavier#moveJ1(int, int)
	 */
	public void setDy1(int dy1) {
		this.dy1 = dy1;
	}

	/**
	 * Met à jour le déplacement en x du joueur 2.
	 * 
	 * @param dx2
	 * 			Le nouveau déplacement en x du joueur 2.
	 * 
	 * @see Clavier#moveJ2(int, int)
	 */
	public void setDx2(int dx2) {
		this.dx2 = dx2;
	}

	/**
	 * Met à jour le déplacement en y du joueur 2.
	 * 
	 * @param dy2
	 * 			Le  nouveau déplacement en y du joueur 2.
	 * 
	 * @see Clavier#moveJ2(int, int)
	 */
	public void setDy2(int dy2) {
		this.dy2 = dy2;
	}

	
	
	
	/**
	 * Calcul les nouvelles coordonnées du joueur 1.
	 */
	public void deplacementJ1() {
		this.xJ1 = this.xJ1 + this.dx1;
		this.yJ1 = this.yJ1 + this.dy1;
	}
	
	
	/**
	 * Calcul les nouvelles coordonnées du joueur 2.
	 */
	public void deplacementJ2() {
		this.xJ2 = this.xJ2 + this.dx2;
		this.yJ2 = this.yJ2 + this.dy2;
	}

	
	
	/**
	 * Met à jour le contenu de la map.
	 * 
	 * @param x
	 * 			La coordonnée x à mettre à jour.
	 * @param y
	 * 			La coordonnée y à mettre à jour.
	 * @param couleur
	 * 			Le numéro de la couleur à mettre dans la case: 1 pour jaune et 2 pour rouge.
	 * 
	 * @see Scene#div(int)
	 */
	private void majMap(int x, int y, int couleur) {
		Map[div(x)][div(y)] = couleur;
	
	}
	
	
	/**
	 * Vérifie quelle numéro il y a dans la case.
	 * 
	 * @param ii
	 * 			Coordonnées x.
	 * @param jj
	 * 			Coordonnées y.
	 * 
	 * @return Le numéro dans la case
	 */
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
	
	
	
	/**
	 * Divise par 2 le nombre que la méthode reçoit.
	 * Elle est utilisée pour convertir les coordonnées en pixel en coordonnées du tableau Map.
	 * 
	 * @param g
	 * 			Coordonnées reçue.
	 * 
	 * @return les coordonnées divisées par 2.
	 */
	public int div(int g) {
		g=g/2;
		return g;
	}
	
	
	/**
	 * Multiplie par 2 le nombre que la méthode reçoit.
	 * Elle est utilisée pour convertir les coordonnéesdu tableau Map en coordonnées en pixel.
	 * 
	 * @param h
	 * 			Coordonnées reçue.
	 * 
	 * @return les coordonnées multipliées par 2.
	 */
	public int mul(int h) {
		h=h*2;
		return h;
	}
	
	
	
	/**
	 * Vérifie si un joueur est mort.
	 * Si un joueur est sortit de la map ou s'il a foncé dans un mur :
	 * La fonction retourne true.
	 * 
	 * @param x
	 * 			Coordonnée x du joueur.
	 * @param y
	 * 			Coordonnée y du joueur.
	 * 
	 * @return si le joueur a perdu ou non.
	 * 
	 * @see Scene#div(int)
	 */
	public boolean mort( int x, int y) {
		boolean tac=false;
		if (x < 0 || x > 1202 || y < 0 || y > 802 || Map[div(x)][div(y)] != 0) {
			tac=true;
		}
		return tac;
	}
	
	
	
	/**
	 * Méthode pour dessiner.
	 * 
	 * On utilise Graphics2D pour améliorer les graphisme.
	 * On met à les déplacement avec les méthodes de déplacements
	 * 
	 * @see Scene#deplacementJ1()
	 * @see Scene#deplacementJ2()
	 * 
	 * Si la partie est déjâ finie on immobilise les 2 joueurs
	 * Autrement on vérifie avec leurs coordonnées si l'un des joueurs a perdu
	 * Si c'est le cas alors on active la fin et on crée la boîte de dialogue pour l'indiquer
	 * Lorsque l'on ferme cette boîte de dialogue, le jeux se ferme.
	 * 
	 * @see Scene#mort(int, int)
	 * @see Scene#j1Loose
	 * @see Scene#j2Loose
	 * @see Temps#getCompteurTemps()
	 * 
	 * 
	 * On dessine ensuite l'image de fond.
	 * Puis si la fin n'est pas enclenchée, on crée les murs que l'on positionne sur la carte dans le tableau.
	 * Ainsi que l'image des joueurs
	 * 
	 * @see MurJaune
	 * @see MurRouge
	 * @see Scene#majMap(int, int, int)
	 * 
	 * 
	 * Puis on parcourt la carte pour savoir où placer tous les murs.
	 * 
	 * @see Scene#mul(int)
	 */
	@SuppressWarnings("static-access")
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; 

		this.deplacementJ1();
		this.deplacementJ2();

		
		if (fin == 1) {
			this.dx1 = 0;
			this.dy1 = 0;
			this.dx2 = 0;
			this.dy2 = 0;
		} 
		
		else if (mort(this.xJ1, this.yJ1)==true) {
		
			j1Loose = new JOptionPane();
			fin = 1;
			j1Loose.showMessageDialog(null, "Joueur 2 a gagné en " + this.temps.getCompteurTemps() + " secondes.","Fin de partie", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} 
		
		else if (mort(this.xJ2, this.yJ2)==true) {

			j2Loose = new JOptionPane();
			fin = 1;
			j2Loose.showMessageDialog(null, "Joueur 1 a gagné en " + this.temps.getCompteurTemps() + " secondes.","Fin de partie", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}

		
	
		
		g2.drawImage(this.imgFond, this.xFond, 0, null);
		
		
		if (fin!=1) {
			murJaune = new MurJaune(xJ1, yJ1);
			murRouge = new MurRouge(xJ2, yJ2);
			majMap(xJ1, yJ1, 1);
			majMap(xJ2, yJ2, 2);
			g2.drawImage(this.j1.getImgJ1(), this.xJ1, this.yJ1, null);
			g2.drawImage(this.j2.getImgJ2(), this.xJ2, this.yJ2, null);

		}
		
		
		for (i = 0; i < 601; i++) {
			for (j = 0; j < 401; j++) {
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

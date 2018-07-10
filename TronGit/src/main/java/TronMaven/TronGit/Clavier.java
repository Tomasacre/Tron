package TronMaven.TronGit;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * Cette classe permet de lire les entrées clavier et de les convertir en direction à prendre.
 * 
 * @author Thomas
 * 
 * @see Scene
 */
public class Clavier implements KeyListener{
	
	
	/**
	 * m indique la direction du joueur 1.
	 * Elle est initialisé vers le sud (bas) au début.
	 * 1:Nord	2:Est 3:Sud 4:Ouest
	 * 
	 * @see Clavier#keyPressed(KeyEvent)
	 */
	private int m=3;
	
	/**
	 * m indique la direction du joueur 2.

	 * Elle est initialisé vers le nord (haut) au début.
	 * 1:Nord	2:Est 3:Sud 4:Ouest
	 * 
	 * @see Clavier#keyPressed(KeyEvent)
	 */
	private int n=1;		
	
	
	/**
	 * Cette méthode permet de déplacé le joueur 1.
	 * 
	 * @param x
	 * 			déplacement à effectué en x.
	 * @param y
	 * 			déplacement à effectué en y.
	 * 
	 * @see Scene#setDx1(int)
	 * @see Scene#setDy1(int)
	 */
	public void moveJ1(int x, int y) {
		main.scene.setDx1(x);
		main.scene.setDy1(y);
	}
	
	
	/**
	 * Cette méthode permet de déplacé le joueur 1.
	 * 
	 * @param x
	 * 			déplacement à effectué en x.
	 * @param y
	 * 			déplacement à effectué en y.
	 * 
	 * @see Scene#setDx2(int)
	 * @see Scene#setDy2(int)
	 */
	public void moveJ2(int x, int y) {
		main.scene.setDx2(x);
		main.scene.setDy2(y);
	}
	 
	
	/**
	 * Cette méthode permet de mettre à jour la direction lors d'un virage à droite.
	 * 
	 * @param l
	 * 			direction reçue.
	 * @return la nouvelle direction.
	 * 
	 * @see Clavier#keyPressed(KeyEvent)
	 */
	public int BoucleD(int l) {
		l=l+1;
		if (l>4) {
			l=1;
		}
		return l;
	}
	
	/**
	 * Cette méthode permet de mettre à jour la direction lors d'un virage à gauche
	 * 
	 * @param l
	 * 			direction reçue.
	 * @return la nouvelle direction.
	 * 
	 * @see Clavier#keyPressed(KeyEvent)
	 */
	public int BoucleG(int l) {
		l=l-1;
		if (l<1) {
			l=4;
		}
		return l;
	}
	
	
	/**
	 * Cette méthode reçoie la direction dans laquelle le joueur 1 veut aller et la convertit en coordonnées de déplacement
	 * 
	 * @param o
	 * 			direction reçue
	 * 
	 * @see Clavier#moveJ1(int, int)
	 */
	public void TurnJ1(int o) {
		if (o==1) {
			moveJ1(0,-2);
		}
		else if (o==2) {
			moveJ1(2,0);
		}
		else if (o==3) {
			moveJ1(0,2);
		}
		else if (o==4) {
			moveJ1(-2,0);
		}
	}
	
	
	/**
	 * Cette méthode reçoie la direction dans laquelle le joueur 2 veut aller et la convertit en coordonnées de déplacement
	 * 
	 * @param p
	 * 			direction reçue
	 * 
	 * @see Clavier#moveJ2(int, int)
	 */
	public void TurnJ2(int p) {
		if (p==1) {
			moveJ2(0,-2);
		}
		else if (p==2) {
			moveJ2(2,0);
		}
		else if (p==3) {
			moveJ2(0,2);
		}
		else if (p==4) {
			moveJ2(-2,0);
		}
	}

	
	/**
	 * Cette méthode reçoie les touches pressées sur le clavier.
	 * La touche D permet au joueur 1 de tourner à droite.
	 * La touche Q permet au joueur 1 de tourner à gauche.
	 * La flèche de droite permet au joueur 2 de tourner à droite.
	 * La flèche de gauche permet au joueur 2 de tourner à gauche.
	 * 
	 * @see Clavier#BoucleD(int)
	 * @see Clavier#BoucleG(int)
	 * 
	 * @see Clavier#TurnJ1(int)
	 * @see Clavier#TurnJ2(int)
	 */
	public void keyPressed(KeyEvent e) {
		
		
		if(e.getKeyCode()==KeyEvent.VK_D) {
			m=BoucleD(m);			
			TurnJ1(m);			
		}
		
		else if(e.getKeyCode()==KeyEvent.VK_Q) {		
			m=BoucleG(m);			
			TurnJ1(m);
		}
		

		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {			
			n=BoucleD(n);
			TurnJ2(n);
		}
		
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {			
			n=BoucleG(n);
			TurnJ2(n);
		}
	}

	/**
	 * Cette méthode est inutilisée dans notre cas mais obligatoire au fonctionnement du code.
	 */
	public void keyReleased(KeyEvent e) {}

	/**
	 * Cette méthode est inutilisée dans notre cas mais obligatoire au fonctionnement du code.
	 */
	public void keyTyped(KeyEvent e) {}
	
	

}

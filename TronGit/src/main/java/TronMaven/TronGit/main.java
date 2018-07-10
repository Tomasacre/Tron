package TronMaven.TronGit;

import javax.swing.JFrame;

import TronMaven.TronGit.Scene;


/**
 * Classe main du programme
 * 
 * Cette classe est la classe principale du programme.
 * Elle permet également de créer la fenêtre.
 * 
 * @see Scene#Scene()
 * 
 * @author Thomas
 *
 */
public class main {
	
	
	/**
	 * Initialisation de l'objet scene
	 * @see Scene#Scene()
	 * @see main
	 */	
	public static Scene scene;
	
	
	/**
	 * La m principale "main"
	 * Elle contient la création de la fenêtre
	 * 
	 * 
	 * On la crée et on la nomme TRON
	 * On lui applique la fonctionnalité de se faire fermer avec la croix rouge en haut à droite
	 * On règle sa taille
	 * On la centre
	 * On empêche son redimmensionnement
	 *  
	 * On instancie scene
	 * 
	 * On associe scene à fenetre
	 * On rend la fenêtre visible
	 * 
	 * 
	 * @param args
	 * 			Paramètre de base de la méthode main
	 */
	public static void main(String[] args) {
		

		JFrame fenetre = new JFrame ("TRON"); 					
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		fenetre.setSize(1206, 830);								
		fenetre.setLocationRelativeTo(null);					
		fenetre.setResizable(false);							

		scene = new Scene();
		
		fenetre.setContentPane(scene);	
		fenetre.setVisible(true);		
				
	}

}

package TronMaven.TronGit;

import javax.swing.JFrame;

import TronMaven.TronGit.*;

public class main {
	
	
	public static Scene scene;

	public static void main(String[] args) {
		
		
		
		//Création de la fenetre
		JFrame fenetre = new JFrame ("TRON"); 					//Création + nommage
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fermé avec croix rouge
		fenetre.setSize(1206, 830);								//Taille
		fenetre.setLocationRelativeTo(null);					//centré
		fenetre.setResizable(false);							//Empêche le redimensionnement
		//fenetre.setAlwaysOnTop(true);							//Toujours au dessus des autre fenêtres
		
		//Instanciation de scene
		scene = new Scene();
		
		fenetre.setContentPane(scene);	//Association scene et fenetre
		fenetre.setVisible(true);		//Rendre la fenêtre visible
				
		
		
		
		

	}

}

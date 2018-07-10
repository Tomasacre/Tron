package TronMaven.TronGit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import TronMaven.TronGit.Clavier;


/**
 * Test les méthodes de la classe Clavier.
 * Ces méthodes sont les conversion de coordonnées (division et multiplication).
 * Ainsi que si le joueur est dans la carte.
 * 
 * 
 * @author Thomas
 *
 *@see Clavier
 */
public class ClavierTest {
	
	
	/**
	 * Test de la mise à jour de l'orientation lors d'un virage à droite lors d'un cas général.
	 * On envoie une valeur de 2 dans BoucleD().
	 * On vérifie ensuite que l'on a bien 3 en sortie.
	 * 
	 * @see Clavier#BoucleD(int)
	 */
	@Test
	public void testVirageDroiteOrientation() {
		int a=2;
		Clavier clavier = new Clavier();
		int b = clavier.BoucleD(a);
		assertEquals(3, b);
	}
	
	/**
	 * Test de la mise à jour de l'orientation lors d'un virage à droite lorsque l'on arrive à l'extrémité de la boucle.
	 * On envoie une valeur de 4 dans BoucleD().
	 * On vérifie ensuite que l'on a bien 1 en sortie.
	 * 
	 * @see Clavier#BoucleD(int)
	 */
	@Test
	public void testVirageDroiteOrientationBoucle() {
		int a=4;
		Clavier clavier = new Clavier();
		int b = clavier.BoucleD(a);
		assertEquals(1, b);
	}
	
	/**
	 * Test de la mise à jour de l'orientation lors d'un virage à gauche lors d'un cas général.
	 * On envoie une valeur de 4 dans BoucleG().
	 * On vérifie ensuite que l'on a bien 3 en sortie.
	 * 
	 * @see Clavier#BoucleG(int)
	 */
	@Test
	public void testVirageGaucheOrientation() {
		int a=4;
		Clavier clavier = new Clavier();
		int b = clavier.BoucleG(a);
		assertEquals(3, b);
	}
	
	/**
	 * Test de la mise à jour de l'orientation lors d'un virage à droite lorsque l'on arrive à l'extrémité de la boucle.
	 * On envoie une valeur de 1 dans BoucleG().
	 * On vérifie ensuite que l'on a bien 4 en sortie.
	 * 
	 * @see Clavier#BoucleG(int)
	 */
	@Test
	public void testVirageGaucheOrientationBoucle() {
		int a=1;
		Clavier clavier = new Clavier();
		int b = clavier.BoucleG(a);
		assertEquals(4, b);
	}

}
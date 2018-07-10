package TronMaven.TronGit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import TronMaven.TronGit.Scene;


/**
 * Test les méthodes de la classe Scene.
 * Ces méthodes sont les conversion de coordonnées (division et multiplication).
 * Ainsi que si le joueur est dans la carte.
 * 
 * 
 * @author Thomas
 *
 *@see Scene
 */
public class SceneTest {
	
	
	/**
	 * Test de division par 2.
	 * On envoie une valeur de 20 dans div().
	 * On vérifie ensuite que l'on a bien 10 en sortie.
	 * 
	 * @see Scene#div(int)
	 */
	@Test
	public void testDivisionPar2() {
		int a =20;
		Scene scene = new Scene();
		int b = scene.div(a);
		assertEquals(10, b);	
	}
	
	/**
	 * Test de multiplication par 2.
	 * On envoie une valeur de 250 dans mul().
	 * On vérifie ensuite que l'on a bien 500 en sortie.
	 * 
	 * @see Scene#mul(int)
	 */
	@Test
	public void testMultiplicationPar2() {
		int a =250;
		Scene scene = new Scene();
		int b = scene.mul(a);
		assertEquals(500, b);	
	}
	
	
	/**
	 * Test de coordonnées.
	 * Dans cette situation :
	 * x est supérieur au max.
	 * y est supérieur au max.
	 * 
	 * On doit obtenir true en sortie.
	 * 
	 * @see Scene#mort(int, int)
	 */
	@Test
	public void CoordonneesDeDefaitexPlusyPlus() {
		int a =1202;
		int b =802;
		Scene scene = new Scene();
		boolean c = scene.mort(a,b);
		assertEquals(true, c);	
	}
	
	/**
	 * Test de coordonnées.
	 * Dans cette situation :
	 * x est inférieur au min.
	 * y est inférieur au min.
	 * 
	 * On doit obtenir true en sortie.
	 * 
	 * @see Scene#mort(int, int)
	 */
	@Test
	public void CoordonneesDeDefaitexMoinsyMoins() {
		int a =-2;
		int b =-2;
		Scene scene = new Scene();
		boolean c = scene.mort(a,b);
		assertEquals(true, c);	
	}
	
	/**
	 * Test de coordonnées.
	 * Dans cette situation :
	 * x est supérieur au max.
	 * y est inférieur au min.
	 * 
	 * On doit obtenir true en sortie.
	 * 
	 * @see Scene#mort(int, int)
	 */
	@Test
	public void CoordonneesDeDefaitexPlusyMoins() {
		int a =1202;
		int b =-2;
		Scene scene = new Scene();
		boolean c = scene.mort(a,b);
		assertEquals(true, c);	
	}
	
	/**
	 * Test de coordonnées.
	 * Dans cette situation :
	 * x est inférieur au min.
	 * y est supérieur au max.
	 * 
	 * On doit obtenir true en sortie.
	 * 
	 * @see Scene#mort(int, int)
	 */
	@Test
	public void CoordonneesDeDefaitexMoinsyPlus() {
		int a =-2;
		int b =802;
		Scene scene = new Scene();
		boolean c = scene.mort(a,b);
		assertEquals(true, c);	
	}
	
	/**
	 * Test de coordonnées.
	 * Dans cette situation :
	 * x est dans l'intervalle.
	 * y est supérieur au max.
	 * 
	 * On doit obtenir true en sortie.
	 * 
	 * @see Scene#mort(int, int)
	 */
	@Test
	public void CoordonneesDeDefaitexEgaleyPlus() {
		int a =0;
		int b =802;
		Scene scene = new Scene();
		boolean c = scene.mort(a,b);
		assertEquals(true, c);	
	}
	
	/**
	 * Test de coordonnées.
	 * Dans cette situation :
	 * x est dans l'intervalle.
	 * y est inférieur au min.
	 * 
	 * On doit obtenir true en sortie.
	 * 
	 * @see Scene#mort(int, int)
	 */
	@Test
	public void CoordonneesDeDefaitexEgaleyMoins() {
		int a =1198;
		int b =-2;
		Scene scene = new Scene();
		boolean c = scene.mort(a,b);
		assertEquals(true, c);	
	}
	
	/**
	 * Test de coordonnées.
	 * Dans cette situation :
	 * x est supérieur au max.
	 * y est dans l'intervalle.
	 * 
	 * On doit obtenir true en sortie.
	 * 
	 * @see Scene#mort(int, int)
	 */
	@Test
	public void CoordonneesDeDefaitexPlusyEgale() {
		int a =1202;
		int b =0;
		Scene scene = new Scene();
		boolean c = scene.mort(a,b);
		assertEquals(true, c);
	}
	
	/**
	 * Test de coordonnées.
	 * Dans cette situation :
	 * x est inférieur au min.
	 * y est dans l'intervalle.
	 * 
	 * On doit obtenir true en sortie.
	 * 
	 * @see Scene#mort(int, int)
	 */
	@Test
	public void CoordonneesDeDefaitexMoinsyEgale() {
		int a =-2;
		int b =798;
		Scene scene = new Scene();
		boolean c = scene.mort(a,b);
		assertEquals(true, c);	
	}
	
	/**
	 * Test de coordonnées.
	 * Dans cette situation :
	 * x est dans l'intervalle.
	 * y est dans l'intervalle.
	 * 
	 * On doit obtenir false en sortie.
	 * 
	 * @see Scene#mort(int, int)
	 */
	@Test
	public void CoordonneesDedans() {
		int a =0;
		int b =798;
		Scene scene = new Scene();
		boolean g = scene.mort(a,b);
		assertEquals(false, g);	
	}
}

package TronMaven.TronGit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testClavier {
	
	@Test
	public void testVirageDroiteOrientation() {
		int a=2;
		Clavier clavier = new Clavier();
		int b = clavier.BoucleD(a);
		assertEquals(3, b);
	}
	
	@Test
	public void testVirageDroiteOrientationBoucle() {
		int a=4;
		Clavier clavier = new Clavier();
		int b = clavier.BoucleD(a);
		assertEquals(1, b);
	}
	
	@Test
	public void testVirageGaucheOrientation() {
		int a=4;
		Clavier clavier = new Clavier();
		int b = clavier.BoucleG(a);
		assertEquals(3, b);
	}
	
	@Test
	public void testVirageGaucheOrientationBoucle() {
		int a=1;
		Clavier clavier = new Clavier();
		int b = clavier.BoucleG(a);
		assertEquals(4, b);
	}

}

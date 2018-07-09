package TronMaven.TronGit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testScene {
	
	
	//Test div
	@Test
	public void testDivisionPar2() {
		int a =20;
		Scene scene = new Scene();
		int b = scene.div(a);
		assertEquals(10, b);	
	}
	
	@Test
	public void testMultiplicationPar2() {
		int a =250;
		Scene scene = new Scene();
		int b = scene.mul(a);
		assertEquals(500, b);	
	}
	
	
	
	@Test
	public void CoordonnéesDeDéfaitexPlusyPlus() {
		int a =1202;
		int b =802;
		Scene scene = new Scene();
		int c = scene.co(a,b);
		assertEquals(1, c);	
	}
	
	@Test
	public void CoordonnéesDeDéfaitexMoinsyMoins() {
		int a =-2;
		int b =-2;
		Scene scene = new Scene();
		int c = scene.co(a,b);
		assertEquals(1, c);	
	}
	
	@Test
	public void CoordonnéesDeDéfaitexPlusyMoins() {
		int a =1202;
		int b =-2;
		Scene scene = new Scene();
		int c = scene.co(a,b);
		assertEquals(1, c);	
	}
	
	@Test
	public void CoordonnéesDeDéfaitexMoinsyPlus() {
		int a =-2;
		int b =802;
		Scene scene = new Scene();
		int c = scene.co(a,b);
		assertEquals(1, c);	
	}
	
	@Test
	public void CoordonnéesDeDéfaitexEgaleyPlus() {
		int a =0;
		int b =802;
		Scene scene = new Scene();
		int c = scene.co(a,b);
		assertEquals(1, c);	
	}
	
	@Test
	public void CoordonnéesDeDéfaitexEgaleyMoins() {
		int a =1198;
		int b =-2;
		Scene scene = new Scene();
		int c = scene.co(a,b);
		assertEquals(1, c);	
	}
	
	@Test
	public void CoordonnéesDeDéfaitexPlusyEgale() {
		int a =1202;
		int b =0;
		Scene scene = new Scene();
		int c = scene.co(a,b);
		assertEquals(1, c);
	}
	
	@Test
	public void CoordonnéesDeDéfaitexMoinsyEgale() {
		int a =-2;
		int b =798;
		Scene scene = new Scene();
		int c = scene.co(a,b);
		assertEquals(1, c);	
	}
	
	@Test
	public void CoordonnéesDedans() {
		int a =0;
		int b =798;
		Scene scene = new Scene();
		int g = scene.co(a,b);
		assertEquals(0, g);	
	}
	
	


}

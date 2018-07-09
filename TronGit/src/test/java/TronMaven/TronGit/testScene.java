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


}

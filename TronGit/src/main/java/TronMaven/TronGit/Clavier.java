package TronMaven.TronGit;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener{
	
	//direction    1:Nord   2:Est   3: Sud   4: Ouest
	private int m=3;		//Joueur 1
	private int n=1;		//Joueur 2

	public void keyPressed(KeyEvent e) {
		
		
		if(e.getKeyCode()==KeyEvent.VK_D) {

			m=m+1;
			if (m>4) {
				m=1;
			}
			
			if (m==1) {
				main.scene.setDx1(0);
				main.scene.setDy1(-2);
			}
			else if (m==2) {
				main.scene.setDx1(2);
				main.scene.setDy1(0);
			}
			else if (m==3) {
				main.scene.setDx1(0);
				main.scene.setDy1(2);
			}
			else if (m==4) {
				main.scene.setDx1(-2);
				main.scene.setDy1(0);
			}
			
		}
		
		
		else if(e.getKeyCode()==KeyEvent.VK_Q) {
			m=m-1;
			if (m<1) {
				m=4;
			}
			if (m==1) {
				main.scene.setDx1(0);
				main.scene.setDy1(-2);
			}
			else if (m==2) {
				main.scene.setDx1(2);
				main.scene.setDy1(0);
			}
			else if (m==3) {
				main.scene.setDx1(0);
				main.scene.setDy1(2);
			}
			else if (m==4) {
				main.scene.setDx1(-2);
				main.scene.setDy1(0);
			}
		}
		
		
		
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			n=n+1;
			if (n>4) {
				n=1;
			}
			
			if (n==1) {
				main.scene.setDx2(0);
				main.scene.setDy2(-2);
			}
			else if (n==2) {
				main.scene.setDx2(2);
				main.scene.setDy2(0);
			}
			else if (n==3) {
				main.scene.setDx2(0);
				main.scene.setDy2(2);
			}
			else if (n==4) {
				main.scene.setDx2(-2);
				main.scene.setDy2(0);
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				n=n-1;
				if (n<1) {
					n=4;
				}
				if (n==1) {
					main.scene.setDx2(0);
					main.scene.setDy2(-2);
				}
				else if (n==2) {
					main.scene.setDx2(2);
					main.scene.setDy2(0);
				}
				else if (n==3) {
					main.scene.setDx2(0);
					main.scene.setDy2(2);
				}
				else if (n==4) {
					main.scene.setDx2(-2);
					main.scene.setDy2(0);
				}
			}
		}

		
		
		
	

	
	
	
	public void keyReleased(KeyEvent e) {}


	
	
	public void keyTyped(KeyEvent e) {}
	
	

}

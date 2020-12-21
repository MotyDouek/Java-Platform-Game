package GameState;

import java.awt.Graphics;

public abstract class GameState {
	
	protected GameStateManager gsm;
	public static int xOffset, yOffset;
	
	public GameState(GameStateManager gsm) {
		this.gsm = gsm;
		
		xOffset = 0;
		yOffset = 0;
		
		init();
	}
	
	public abstract void init();
	public abstract void tick();
	public abstract void draw(Graphics g);
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);

}

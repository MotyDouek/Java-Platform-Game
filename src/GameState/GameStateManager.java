package GameState;

import java.awt.Graphics;
import java.util.Stack;

public class GameStateManager {
	
	public Stack<GameState> states;
	
	public GameStateManager() {
		states = new Stack<GameState>();
		states.push(new MenuState(this));
	}
	
	public void tick() {
		// looks at the top of the stack and update by it
		states.peek().tick();
	}
	
	public void draw(Graphics g) {
		states.peek().draw(g);
	}
	
	public void keyPressed(int k) {
		states.peek().keyPressed(k);
	}
	
	public void keyReleased(int k) {
		states.peek().keyReleased(k);
	}

}

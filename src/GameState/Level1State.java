package GameState;

import java.awt.Graphics;

import Entities.Player;
import objects.Block;

public class Level1State extends GameState {
	
	private Player player;
	
	private Block[] b;

	public Level1State(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		player = new Player(30, 30);
		
		b = new Block[3];
		
		b[0] = new Block(350, 400);
		b[1] = new Block(400, 350);
		b[2] = new Block(450, 300);
		
	}

	@Override
	public void tick() {
		
		for(int i = 0; i < b.length; i++) {
			b[i].tick();
		}
		
		player.tick(b);
	}

	@Override
	public void draw(Graphics g) {
		player.draw(g);
		
		for(int i = 0; i < b.length; i++) {
			b[i].draw(g);
		}
	}

	@Override
	public void keyPressed(int k) {
		player.keyPressed(k);
	}

	@Override
	public void keyReleased(int k) {
		player.keyReleased(k);
	}

}

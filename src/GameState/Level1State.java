package GameState;

import java.awt.Graphics;

import Entities.Player;
import Mapping.Map;
import objects.Block;

public class Level1State extends GameState {
	
	private Player player;
	private Map map;

	public Level1State(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		player = new Player(30, 30);
		map = new Map("/Maps/map1.map");
		
		xOffset = -200;
		yOffset = -400;
	}

	@Override
	public void tick() {
		player.tick(map.getBlocks(), map.getMovingBlocks());
		map.tick();
	}

	@Override
	public void draw(Graphics g) {
		player.draw(g);
		map.draw(g);
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

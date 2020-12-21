package physics;

import java.awt.Point;

import objects.Block;

public class Collision {
	
	public static boolean playerBlcok(Point p, Block b) {
		return b.contains(p);
	}
	
}

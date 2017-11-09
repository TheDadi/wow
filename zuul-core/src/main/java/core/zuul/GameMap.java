package core.zuul;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.tiled.TiledMap;

import java.util.ArrayList;
import java.util.List;

public class GameMap extends TiledMap {

	private final List<Shape> collisionShapes = new ArrayList<>();
	private final List<Shape> doorShapes = new ArrayList<>();

	public GameMap(String mapPath) throws SlickException {
		super(mapPath);

		final int doorGroup = 2;
		final int collisionGroup = 1;

		for (int i = 0; i < super.getObjectCount(collGroup); i++) {

			Rectangle collRect = new Rectangle(super.getObjectX(collGroup, i),
					super.getObjectY(collGroup, i), super.getObjectWidth(
					collGroup, i), super.getObjectHeight(collGroup, i));
			collShapes.add(collRect);
		}

		for (int j = 0; j < super.getObjectCount(tranGroup); j++) {
			Rectangle tranRect = new Rectangle(super.getObjectX(tranGroup, j),
					super.getObjectY(tranGroup, j), super.getObjectWidth(
					tranGroup, j), super.getObjectHeight(tranGroup, j));
			tranShapes.add(tranRect);
		}
	}

	public List<Shape> getCollisionShapes() {
		return collisionShapes;
	}

	public List<Shape> getDoorShapes() {
		return doorShapes;
	}

	public boolean isDoor(Shape s) {
        for (Shape tranShape : doorShapes) {
            if (tranShape.intersects(s))
                return true;
        }

		return false;
	}

	public boolean isColliding(Shape s) {
        for (Shape collShape : collisionShapes) {
            if (collShape.intersects(s))
                return true;
        }

		return false;
	}

}
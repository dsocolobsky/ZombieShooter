package entities;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Entity {
	public Vector2 position;
	public Vector2 size;
	public Vector2 direction;
	public float speed;
	private Rectangle bounds;
	
	public Entity(float x, float y, float wd, float ht) {
		position  = new Vector2(x, y);
		size      = new Vector2(wd, ht);
		direction = new Vector2(0, 0);
		
		speed = 0;
		
		bounds = new Rectangle(x, y, wd, ht);
	}
	
	public void update(float dt) {
		updateBounds();
	}
	
	public void updateBounds() {
		bounds.set(position.x, position.y, size.x, size.y);
	}
}

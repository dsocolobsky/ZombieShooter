package entities;

public class Player extends Entity {

	public Player(float x, float y, float wd, float ht) {
		super(x, y, wd, ht);
		
		speed = 7;
	}
	
	public void update(float dt) {
		position.set(position.x + speed * direction.x * dt, +
				     position.y + speed * direction.y * dt);
	}
}

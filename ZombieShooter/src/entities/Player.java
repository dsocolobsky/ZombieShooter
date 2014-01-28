package entities;

import com.dysoco.zombieshooter.Assets;
import com.dysoco.zombieshooter.ZombieShooter;

public class Player extends Entity {

	public Player(float x, float y) {
		super(x, y, 48, 48);
		
		speed = 7;
	}
	
	public void update(float dt) {
		position.set(position.x + speed * direction.x * dt, +
				     position.y + speed * direction.y * dt);
	}
	
	public void render() {
		ZombieShooter.batch.draw(Assets.playertxt, position.x, position.y);
	}
}

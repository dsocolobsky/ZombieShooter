package screens;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.dysoco.zombieshooter.ZombieShooter;

import entities.Player;

public class GameScreen implements Screen, InputProcessor {
	private OrthographicCamera camera;
	public Player player;
	
	public GameScreen() {
		camera = new OrthographicCamera(32, 32*ZombieShooter.ASPECT);
		player = new Player(50, 50, 32, 32);
	}

	@Override
	public void render(float delta) {
		
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void show() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Keys.A) {
			player.direction.x = -1;
		} else if(keycode == Keys.D) {
			player.direction.x = 1;
		} else if(keycode == Keys.W) {
			player.direction.y = -1;
		} else if(keycode == Keys.S) {
			player.direction.y = 1;
		}
		
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

}

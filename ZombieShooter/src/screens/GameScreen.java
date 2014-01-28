package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.dysoco.zombieshooter.ZombieShooter;

import entities.Player;

public class GameScreen implements Screen, InputProcessor {
	private OrthographicCamera camera;
	private Stage stage;
	public Player player;
	
	public GameScreen() {
		camera = new OrthographicCamera(32, 32*ZombieShooter.ASPECT);
		stage  = new Stage();
		player = new Player(50, 50);
		
		stage.addActor(player);
		
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render(float delta) {
		// Clear screen to black
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		camera.update();
        ZombieShooter.batch.setProjectionMatrix(camera.combined);
        
        stage.act(delta);
		stage.draw();
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
		player.direction.set(0, 0);
		
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

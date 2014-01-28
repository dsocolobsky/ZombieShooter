package com.dysoco.zombieshooter;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import screens.GameScreen;

public class ZombieShooter extends Game {
	public final static int WIDTH  = 800;
	public final static int HEIGHT = 600;
	public final static int ASPECT = WIDTH/HEIGHT;
	
	private GameScreen gameScreen;
	
	public static SpriteBatch batch;

	@Override
	public void create() {
		Assets.load();
		
		batch = new SpriteBatch();
		
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}
}

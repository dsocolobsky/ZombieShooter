package com.dysoco.zombieshooter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Assets {
	
	public static Texture playertxt;
	
	public static void load() {
		playertxt = new Texture(Gdx.files.internal("data/player.png"));
	}
	
	public static void dispose() {
		
	}
}

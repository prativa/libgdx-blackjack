package com.cse.hanh.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cse.hanh.game.screen.MainMenu;
import com.cse.hanh.game.util.Resources;

public class MyBlackjackGdxGame extends Game {
	
	// sprite is used for all screen
	public SpriteBatch gameBatch;
	public SpriteBatch fadeBatch;
	
	@Override
	public void create () {
		gameBatch = new SpriteBatch();

		fadeBatch = new SpriteBatch();
		
		Resources.load();
		
		setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose() {
		gameBatch.dispose();
		fadeBatch.dispose();
	}
}

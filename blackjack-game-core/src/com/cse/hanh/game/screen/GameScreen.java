/**
 * 
 */
package com.cse.hanh.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.cse.hanh.game.MyBlackjackGdxGame;
import com.cse.hanh.game.util.Constants;

/**
 * @author Hanh
 *
 */
public class GameScreen extends ScreenAdapter {
	
	MyBlackjackGdxGame game;
	OrthographicCamera guiCam;
	
	float width;
	float height;
	
	public GameScreen(MyBlackjackGdxGame game) {
		this.game = game;
		guiCam = new OrthographicCamera(Constants.GUI_VIEWPORT_WIDTH, Constants.GUI_VIEWPORT_HEIGHT);
        guiCam.position.set(Constants.GUI_VIEWPORT_WIDTH / 2 , Constants.GUI_VIEWPORT_HEIGHT / 2, 0);
        
	}
	
	@Override
	public void render(float delta) {
		update();
		draw(delta);
	}

	private void draw(float delta) {
		 GL20 gl = Gdx.gl;
	     gl.glClearColor(1f,0f,0f,1f);
	     gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	     guiCam.update();
	     game.gameBatch.setProjectionMatrix(guiCam.combined);
	     
	}

	private void update() {
		
	}
}

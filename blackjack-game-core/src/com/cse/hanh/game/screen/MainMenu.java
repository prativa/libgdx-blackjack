/**
 * 
 */
package com.cse.hanh.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.cse.hanh.game.MyBlackjackGdxGame;
import com.cse.hanh.game.util.Constants;
import com.cse.hanh.game.util.Resources;

/**
 * @author Hanh
 *
 */
public class MainMenu extends ScreenAdapter {
	
	MyBlackjackGdxGame game;
	OrthographicCamera guiCam;
	Vector3 touchPoint;
	Rectangle playBounds;
	float width = 1024;
	float height = 680;
	
//	Card card;
	public MainMenu(MyBlackjackGdxGame game){
		this.game = game;
		guiCam = new OrthographicCamera(Constants.GUI_VIEWPORT_WIDTH, Constants.GUI_VIEWPORT_HEIGHT);
        guiCam.position.set(Constants.GUI_VIEWPORT_WIDTH / 2 , Constants.GUI_VIEWPORT_HEIGHT / 2, 0);
        touchPoint = new Vector3();
//        card = new Card(new Vector2(200f, 150f), Arrays.asList(Constants.SUITS).indexOf("D"), 
//        		Arrays.asList(Constants.RANKS).indexOf("5"));
        playBounds = new Rectangle(this.width / 3.3f, this.height / 3.0f, 300, 36);
	}
	
	@Override
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
		super.resize(width, height);
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
        game.gameBatch.disableBlending();
        game.gameBatch.begin();
        
        game.gameBatch.draw(Resources.blackjackBackground, 0, 0, Constants.GUI_VIEWPORT_WIDTH, 
        		Constants.GUI_VIEWPORT_HEIGHT);
        
        game.gameBatch.end();
        
        game.gameBatch.enableBlending();
        game.gameBatch.begin();
        
        game.gameBatch.draw(Resources.mainMenu, this.width / 3.3f, this.height / 3.0f, 300, 110);
        
        game.gameBatch.end();
	}

	private void update() {
		if(Gdx.input.justTouched()){
			guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
			
			if(playBounds.contains(touchPoint.x, touchPoint.y)){
				game.setScreen(new GameScreen(this.game));
				return;
			}
			
		}
	}
}

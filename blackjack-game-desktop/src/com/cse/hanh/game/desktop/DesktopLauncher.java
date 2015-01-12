package com.cse.hanh.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.cse.hanh.game.MyBlackjackGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1072;
		config.height = 680;
		config.title = "Blackjack";
		new LwjglApplication(new MyBlackjackGdxGame(), config);
	}
}

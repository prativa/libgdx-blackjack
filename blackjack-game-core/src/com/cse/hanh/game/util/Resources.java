/**
 * 
 */
package com.cse.hanh.game.util;

import java.util.Arrays;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * @author Hanh
 *
 */
public class Resources {
	public static Texture blackjackBackground;
	public static Texture guiItems;
	public static TextureRegion mainMenu;
	
	
	public static Texture items;
	public static TextureRegion cardBack;
	public static TextureRegion CA;
	public static TextureRegion C2;
	public static TextureRegion C3;
	public static TextureRegion C4;
	public static TextureRegion C5;
	public static TextureRegion C6;
	public static TextureRegion C7;
	public static TextureRegion C8;
	public static TextureRegion C9;
	public static TextureRegion C10;
	public static TextureRegion CJ;
	public static TextureRegion CQ;
	public static TextureRegion CK;
	
	public static TextureRegion SA;
	public static TextureRegion S2;
	public static TextureRegion S3;
	public static TextureRegion S4;
	public static TextureRegion S5;
	public static TextureRegion S6;
	public static TextureRegion S7;
	public static TextureRegion S8;
	public static TextureRegion S9;
	public static TextureRegion S10;
	public static TextureRegion SJ;
	public static TextureRegion SQ;
	public static TextureRegion SK;
	
	public static TextureRegion HA;
	public static TextureRegion H2;
	public static TextureRegion H3;
	public static TextureRegion H4;
	public static TextureRegion H5;
	public static TextureRegion H6;
	public static TextureRegion H7;
	public static TextureRegion H8;
	public static TextureRegion H9;
	public static TextureRegion H10;
	public static TextureRegion HJ;
	public static TextureRegion HQ;
	public static TextureRegion HK;
	
	public static TextureRegion DA;
	public static TextureRegion D2;
	public static TextureRegion D3;
	public static TextureRegion D4;
	public static TextureRegion D5;
	public static TextureRegion D6;
	public static TextureRegion D7;
	public static TextureRegion D8;
	public static TextureRegion D9;
	public static TextureRegion D10;
	public static TextureRegion DJ;
	public static TextureRegion DQ;
	public static TextureRegion DK;
	
	public static Resources instance;
	
	public static Texture loadTexture(String file){
        return new Texture(Gdx.files.internal(file));
    }
	
	public static Resources getInstance(){
		if(instance == null){
			instance = new Resources();
		}
		return instance;
	}
	
	public static void load(){
		blackjackBackground = loadTexture("blackjack.png");
		guiItems = loadTexture("items.png");
		mainMenu = new TextureRegion(guiItems, 0, 224, 300, 110);
		
		items = loadTexture("cards.png");
		
		cardBack = new TextureRegion(items, (int) Constants.CARD_WIDTH * 2, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("J"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		// Cac quan bai chat chuon
		CA = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("A"), 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		C2 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("2"), 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		C3 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("3") - 2, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		C4 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("4") - 2, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		C5 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("5") - 3, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		C6 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("6") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		C7 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("7") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		C8 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("8") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);	
		C9 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("9") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		C10 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("T") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		CJ = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("J") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		CQ = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("Q") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		CK = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("K") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("C"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		
		// Cac quan bai chat ro
		SA = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("A"), 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		S2 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("2"), 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		S3 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("3") - 2, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		S4 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("4") - 2, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		S5 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("5") - 3, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		S6 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("6") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		S7 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("7") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		S8 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("8") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);	
		S9 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("9") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		S10 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("T") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		SJ = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("J") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		SQ = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("Q") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		SK = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("K") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("S"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		
		// Cac quan bai chat co
		HA = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("A"), 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		H2 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("2"), 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		H3 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("3") - 2, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		H4 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("4") - 2, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		H5 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("5") - 3, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		H6 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("6") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		H7 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("7") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		H8 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("8") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);	
		H9 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("9") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		H10 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("T") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		HJ = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("J") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		HQ = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("Q") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		HK = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("K") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("H"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		
		// Cac quan bai chat bich
		DA = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("A"), 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		D2 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("2"), 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		D3 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("3") - 2, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		D4 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("4") - 2, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		D5 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("5") - 3, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		D6 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("6") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		D7 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("7") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);		
		D8 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("8") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);	
		D9 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("9") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		D10 = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("T") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		DJ = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("J") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		DQ = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("Q") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
		DK = new TextureRegion(items, (int) Constants.CARD_WIDTH * Arrays.asList(Constants.RANKS).indexOf("K") - 5, 
				(int) Constants.CARD_HEIGHT * Arrays.asList(Constants.SUITS).indexOf("D"), 
				(int) Constants.CARD_WIDTH, (int) Constants.CARD_HEIGHT);
	}
	
	private Resources() {}
	
}

/**
 * 
 */
package com.cse.hanh.game.util;

import java.util.LinkedHashMap;

/**
 * @author Hanh
 *
 */
public class Constants {

	public static float CARD_WIDTH = 168.0f;
	
	public static float CARD_HEIGHT = 244.0f;
	
	public static float GUI_VIEWPORT_WIDTH = 960.0f;
	
	public static float GUI_VIEWPORT_HEIGHT = 640.0f;
	
	public static String[] SUITS = {"C","S","H","D","J"};
	
	public static String[] RANKS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
	
	public static LinkedHashMap<String, Integer> VALUES = new LinkedHashMap<String, Integer>();
	
	public static Constants instance;
	
	public static Constants getInstance(){
		if(instance == null){
			instance = new Constants();			
		}
		return instance;
	}
	
	private Constants(){
		VALUES.put("A", 1);
		VALUES.put("2", 2);
		VALUES.put("3", 3);
		VALUES.put("4", 4);
		VALUES.put("5", 5);
		VALUES.put("6", 6);
		VALUES.put("7", 7);
		VALUES.put("8", 8);
		VALUES.put("9", 9);
		VALUES.put("10", 10);
		VALUES.put("J", 10);
		VALUES.put("Q", 10);
		VALUES.put("K", 10);
	}
}

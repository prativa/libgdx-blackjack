/**
 * 
 */
package com.cse.hanh.game.object;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.cse.hanh.game.util.Resources;

/**
 * @author Hanh
 *
 */
public class Card extends Sprite {
	
	private Vector2 position = new Vector2();
	
	float delta;
	
	public Card(Vector2 position, int type, int value) {
		super();
		this.position.set(position);
		this.setPosition(this.position.x, this.position.y);
		switch (type) {
		case 0:
			switch (value) {
			case 0:
				this.set(new Sprite(Resources.CA));
				break;
			case 1:
				this.set(new Sprite(Resources.C2));
				break;
			case 2:
				this.set(new Sprite(Resources.C3));
				break;
			case 3:
				this.set(new Sprite(Resources.C4));
				break;
			case 4:
				this.set(new Sprite(Resources.C5));
				break;
			case 5:
				this.set(new Sprite(Resources.C6));
				break;
			case 6:
				this.set(new Sprite(Resources.C7));
				break;
			case 7:
				this.set(new Sprite(Resources.C8));
				break;
			case 8:
				this.set(new Sprite(Resources.C9));
				break;
			case 9:
				this.set(new Sprite(Resources.C10));
				break;
			case 10:
				this.set(new Sprite(Resources.CJ));
				break;
			case 11:
				this.set(new Sprite(Resources.CQ));
				break;
			case 12:
				this.set(new Sprite(Resources.CK));
				break;
			default:
				this.set(new Sprite(Resources.cardBack));
				break;
			}
			break;
		case 1:
			switch (value) {
			case 0:
				this.set(new Sprite(Resources.SA));
				break;
			case 1:
				this.set(new Sprite(Resources.S2));
				break;
			case 2:
				this.set(new Sprite(Resources.S3));
				break;
			case 3:
				this.set(new Sprite(Resources.S4));
				break;
			case 4:
				this.set(new Sprite(Resources.S5));
				break;
			case 5:
				this.set(new Sprite(Resources.S6));
				break;
			case 6:
				this.set(new Sprite(Resources.S7));
				break;
			case 7:
				this.set(new Sprite(Resources.S8));
				break;
			case 8:
				this.set(new Sprite(Resources.S9));
				break;
			case 9:
				this.set(new Sprite(Resources.S10));
				break;
			case 10:
				this.set(new Sprite(Resources.SJ));
				break;
			case 11:
				this.set(new Sprite(Resources.SQ));
				break;
			case 12:
				this.set(new Sprite(Resources.SK));
				break;
			default:
				this.set(new Sprite(Resources.cardBack));
				break;
			}
			break;
		case 2:
			switch (value) {
			case 0:
				this.set(new Sprite(Resources.HA));
				break;
			case 1:
				this.set(new Sprite(Resources.H2));
				break;
			case 2:
				this.set(new Sprite(Resources.H3));
				break;
			case 3:
				this.set(new Sprite(Resources.H4));
				break;
			case 4:
				this.set(new Sprite(Resources.H5));
				break;
			case 5:
				this.set(new Sprite(Resources.H6));
				break;
			case 6:
				this.set(new Sprite(Resources.H7));
				break;
			case 7:
				this.set(new Sprite(Resources.H8));
				break;
			case 8:
				this.set(new Sprite(Resources.H9));
				break;
			case 9:
				this.set(new Sprite(Resources.H10));
				break;
			case 10:
				this.set(new Sprite(Resources.HJ));
				break;
			case 11:
				this.set(new Sprite(Resources.HQ));
				break;
			case 12:
				this.set(new Sprite(Resources.HK));
				break;
			default:
				this.set(new Sprite(Resources.cardBack));
				break;
			}
			break;
		case 3:
			switch (value) {
			case 0:
				this.set(new Sprite(Resources.DA));
				break;
			case 1:
				this.set(new Sprite(Resources.D2));
				break;
			case 2:
				this.set(new Sprite(Resources.D3));
				break;
			case 3:
				this.set(new Sprite(Resources.D4));
				break;
			case 4:
				this.set(new Sprite(Resources.D5));
				break;
			case 5:
				this.set(new Sprite(Resources.D6));
				break;
			case 6:
				this.set(new Sprite(Resources.D7));
				break;
			case 7:
				this.set(new Sprite(Resources.D8));
				break;
			case 8:
				this.set(new Sprite(Resources.D9));
				break;
			case 9:
				this.set(new Sprite(Resources.D10));
				break;
			case 10:
				this.set(new Sprite(Resources.DJ));
				break;
			case 11:
				this.set(new Sprite(Resources.DQ));
				break;
			case 12:
				this.set(new Sprite(Resources.DK));
				break;
			default:
				this.set(new Sprite(Resources.cardBack));
				break;
			}
			break;
		default:
			break;
		}
		
		this.setPosition(position.x, position.y);
	}
	
	@Override
	public void draw(Batch batch) {
		super.draw(batch);
	}
}

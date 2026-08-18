package lab3a;

import java.awt.Graphics;

public class Ball {
	
	
	int x,y,w,h,dirX,dirY;
	public static int worldW = 300;
	public static int worldH = 300;
	
	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
	}
	
	public Ball(int x, int y, int w, int h ) {
		this(x,y,w,h,1,8);
	}
	
	public void move() {
		x += dirX;
		y += dirY;
		if (x < 0) {
	        x = 0;
	        dirX = -dirX;
	    } else if (x+w > worldW) {
	        x = worldW - w;
	        dirX = -dirX;
	    }
		
		if (y < 0) {
	        y = 0;
	        dirY = -dirY;
	    } else if (y+h > worldH) {
	        y = worldH - h;
	        dirY = -dirY;
	    }
	}

	public void draw(Graphics g) {
		g.fillOval(x, y, w, h);
	}
	
	public static void setWorld(int w, int h) {
		worldW = w;
		worldH = h;
	}
}

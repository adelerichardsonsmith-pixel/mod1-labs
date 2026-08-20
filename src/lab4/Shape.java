package lab4;

import java.awt.Color;
import java.awt.Graphics;

enum ShapeType {
	Rectangle, ThreeDRectangle, RoundRectangle, Oval, Arc
}

public class Shape {

	private ShapeType shapeType;
	private Color colour;

	int x, y, w, h, dirX, dirY;
	public static int worldW = 300;
	public static int worldH = 300;
	public static int worldX = 300;
	public static int worldY = 300;

	public Shape(int x, int y, int w, int dirX, int dirY) {
		this(x, y, w, w, dirX, dirY, ShapeType.Oval, Color.BLACK);
	}

	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shapeType, Color colour) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		this.shapeType = shapeType;
		this.colour = colour;
	}

	public ShapeType getShapeType() {
		return shapeType;
	}

	public Color getColour() {
		return colour;
	}

	public void move() {
		x += dirX;
		y += dirY;
		if (x < 0) {
			x = 0;
			dirX = -dirX;
		} else if (x + w > worldW) {
			x = worldW - w;
			dirX = -dirX;
		}

		if (y < 0) {
			y = 0;
			dirY = -dirY;
		} else if (y + h > worldH) {
			y = worldH - h;
			dirY = -dirY;
		}
	}

	public void draw(Graphics g) {
		g.setColor(getColour());
		switch (getShapeType()) {
		case Rectangle:
			g.drawRect(x, y, w, h);
			g.fillRect(x, y, w, h);
			break;
		case ThreeDRectangle:
			g.draw3DRect(x, y, w, h, true);
			g.fill3DRect(x, y, w, h, true);
			break;
		case RoundRectangle:
			g.drawRoundRect(x, y, w, h, 15, 15);
			g.fillRoundRect(x, y, h, h, w, h);
			break;
		case Oval:
			g.drawOval(x, y, w, h);
			g.fillOval(x, y, w, h);
			break;
		case Arc:
			g.drawArc(x, y, w, h, 0, 180);
			g.fillArc(x, y, w, h, dirY, dirX);
			break;
		}
	}

	public static void setWorld(int w, int h, int x, int y) {
		worldW = w;
		worldH = h;
		worldX = x;
		worldY = y;
	}

}

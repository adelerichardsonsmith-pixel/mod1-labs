package lab7;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape {

	private double radius;

	public Circle(Color colour, Point position, double radius) {
		super(colour, position);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String getCharacteristics() {
	    return String.format("%s, Radius: %.2f, Area: %.2f, Circumference: %.2f, Diameter: %.2f",
	            super.getCharacteristics(), radius, getArea(), getCircumference(), getDiameter());
	}

	public void printCharacteristics() {
		System.out.println(getCharacteristics());
	}
}

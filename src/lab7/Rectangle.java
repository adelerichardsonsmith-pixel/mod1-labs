package lab7;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape {

	private double sideA;
	private double sideB;

	public Rectangle(Color colour, Point position, double sideA, double sideB) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getArea() {
		return sideA * sideB;
	}

	public double getCircumference() {
		return 2 * (sideA + sideB);
	}

	@Override
	public String getCharacteristics() {
	    return String.format("Rectangle [%s, SideA: %.2f, SideB: %.2f, Area: %.2f, Circumference: %.2f]",
	            super.getCharacteristics(), sideA, sideB, getArea(), getCircumference());
	}

	public void printCharacteristics() {
		System.out.println(getCharacteristics());
	}
}

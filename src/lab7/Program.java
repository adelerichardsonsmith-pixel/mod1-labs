package lab7;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(Color.BLACK, new Point(10, 20), 5.0, 4.0);
		Circle circle = new Circle(Color.CYAN, new Point(30, 60), 6.0);
		Sphere sphere = new Sphere(Color.GREEN, new Point(3, 6), 5);

		System.out.println(rectangle.getCharacteristics());
		System.out.println(circle.getCharacteristics());
		System.out.println(sphere.getCharacteristics());

		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(rectangle);
		shapes.add(circle);
		shapes.add(sphere);

		// Enhanced for loop inspecting base class properties
		for (Shape s : shapes) {
			Point p = s.getPosition();
			System.out.println("Shape Color: " + s.getColour() + " | Position: (" + p.x + ", " + p.y + ")");

		}

	}
}

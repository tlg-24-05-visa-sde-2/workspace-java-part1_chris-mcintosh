package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

import static java.lang.Math.round;

public class ShapeClient {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape circle = new Circle(3.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 7.0);

        // Display the areas of the shapes
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println();

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;


        for (Shape s : shapes) {
            System.out.println(String.format("%.2f", s.calculateArea()));
        }
    }
}
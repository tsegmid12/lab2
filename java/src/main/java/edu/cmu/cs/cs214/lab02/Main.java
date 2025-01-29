package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(4);

        Renderer renderer = new Renderer(rectangle);
        Renderer renderer2 = new Renderer(circle);

        renderer.draw();
        renderer2.draw();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of each shape using polymorphism
        shape circle = new atributes.Circle(5);        // Circle with radius 5
        shape rectangle = new atributes.Rectangle(4, 6); // Rectangle with width 4 and height 6
        shape square = new atributes.Square(3);        // Square with side 3

        // Display the areas by calling calculateArea
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}
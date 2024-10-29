public class Main {
    public static void main(String[] args) {

        sshape circle = new atributes.Circle(5);
        sshape rectangle = new atributes.Rectangle(4, 6);
        sshape square = new atributes.Square(3);


        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}

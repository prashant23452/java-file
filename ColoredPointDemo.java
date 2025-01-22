// Base class Point
class Point {
    protected int x, y; // Coordinates

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void displayPoint() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

// Derived class ColoredPoint
class ColoredPoint extends Point {
    private String color; // Additional property

    public ColoredPoint(int x, int y, String color) {
        super(x, y); // Call to the base class constructor
        this.color = color;
    }

    public void changeColor(String newColor) {
        this.color = newColor; // Method to change the color
    }

    @Override
    public void displayPoint() {
        super.displayPoint(); // Call the base class method
        System.out.println("Color: " + color);
    }
}

// Main class to demonstrate functionality
public class ColoredPointDemo {
    public static void main(String[] args) {
        // Create a ColoredPoint object
        ColoredPoint coloredPoint = new ColoredPoint(5, 10, "Red");
        System.out.println("Initial State:");
        coloredPoint.displayPoint();

        // Change the color of the point
        System.out.println("\nAfter Changing Color:");
        coloredPoint.changeColor("Blue");
        coloredPoint.displayPoint();
    }
}

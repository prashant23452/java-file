// Interface named Volume
interface Volume {
    double calculateVolume(); // Abstract method to calculate volume
}

// Cube class implementing the Volume interface
class Cube implements Volume {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side; // Volume = side³
    }
}

// Cylinder class implementing the Volume interface
class Cylinder implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height; // Volume = πr²h
    }
}

// RectangularBox class implementing the Volume interface
class RectangularBox implements Volume {
    private double length;
    private double width;
    private double height;

    public RectangularBox(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * width * height; // Volume = l × w × h
    }
}

// Main class to demonstrate the interface
public class VolumeCalculator {
    public static void main(String[] args) {
        // Cube instance
        Volume cube = new Cube(3);
        System.out.println("Volume of Cube: " + cube.calculateVolume());

        // Cylinder instance
        Volume cylinder = new Cylinder(2, 5);
        System.out.println("Volume of Cylinder: " + cylinder.calculateVolume());

        // RectangularBox instance
        Volume box = new RectangularBox(4, 3, 6);
        System.out.println("Volume of Rectangular Box: " + box.calculateVolume());
    }
}

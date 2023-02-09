import java.lang.Math;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    public double calculateLength(){
        return 2*radius* Math.PI;
    }
}

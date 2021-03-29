package day9.Task2;

public class Circle extends Figure {

    private double radios;

    public Circle(double radios, String color) {
        super(color);
        this.radios = radios;
    }


    @Override
    public double area() {
        return Math.PI * (radios * 2);
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI) * radios;
    }
}

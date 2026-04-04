package HomeWork_5_Figures;

public class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double Area() {
        return Math.PI * radius * radius;
    }
    @Override
    double Perimeter() {
        return 2 * Math.PI * radius;
    }
}

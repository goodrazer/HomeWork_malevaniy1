package HomeWork_5_Figures;

public class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double Area() {
        return width * height;
    }
    @Override
    double Perimeter() {
        return 2 * (width + height);
    }
}

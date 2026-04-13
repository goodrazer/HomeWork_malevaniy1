package HomeWork_5_Figures;

public class MainFigures {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(3, 3, 3);
        shapes[1] = new Rectangle(5, 5);
        shapes[2] = new Circle(99.9);
        shapes[3] = new Triangle(6, 8, 10);
        shapes[4] = new Rectangle(4, 4.5);
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            totalPerimeter = totalPerimeter + shape.Perimeter();
        }
        System.out.println("Выполнен рассчет периметра всех фигур из массива: " + totalPerimeter);
    }
}

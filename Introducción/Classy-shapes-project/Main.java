public class Main {
    public static void main(String args[]) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Llamamos al método calculateRectangleArea y pasamos la referencia rectangle como argumento
        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);

        // Llamamos al método calculateCircleArea y pasamos la referencia circle como argumento
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        
        System.out.println("Area of Rectangle: "+ areaOfRectangle);
        System.out.println("Area of Circle: "+ areaOfCircle);
    }
}
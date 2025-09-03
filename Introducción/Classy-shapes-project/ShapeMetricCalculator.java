/*
 * ShapeMetricCalculator
 * Clase de utilidad para agrupar toda la lógica de calculo relacionado
 * con las métricas de una forma (área o perímetro de una forma)
 */

public class ShapeMetricCalculator {

    /*
     * calculateRectangleArea 
     * - calcula el área del rectangulo
     * - recibe un argumento de tipo Rectangle (clase Rectangle)
     * - retorna el área del rectangulo
     */
    public static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }


    /*
     * calculateCircleArea 
     * - calcula el área del circulo
     * - recibe un argumento de tipo Circle (clase Circle)
     * - retorna el área del circulo
     */
    public static double calculateCircleArea(Circle circle) {
        return (circle.radius * circle.radius) * Math.PI ;
    }
}

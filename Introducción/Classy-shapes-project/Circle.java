public class Circle {
    // Variables miembro para almacenar el radio del circulo
    double radius;

    // Constructor No-argument
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor parametrizado
    // Java distingue los constructores porque tienen diferente firma
    // firma = número y tipo de parámetros.
    public Circle(double radius) {
        this.radius = radius;
    }
}

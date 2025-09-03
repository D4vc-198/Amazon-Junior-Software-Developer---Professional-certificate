public class Rectangle {
    // Variables miembro para almacenar el ancho y la longitud del rectangulo
    double length;
    double width;

    // Constructor No-argument
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    
    // Constructor parametrizado
    // Java distingue los constructores porque tienen diferente firma
    // firma = número  y tipo de parámetros.
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
}
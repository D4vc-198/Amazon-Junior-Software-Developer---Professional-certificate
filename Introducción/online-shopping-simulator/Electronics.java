/*
 * La clase Electronics representa un tipo específico de producto.
 * Hace uso de la herencia porque extiende de la clase Product, 
 * lo que le permite reutilizar los atributos y comportamientos 
 * de la clase base como name y price.
 *
 * Además, agrega un nuevo atributo propio: warrantyPeriodInMonths,
 * que indica el periodo de garantía de un producto electrónico en meses.
 *
 * También ejemplifica el polimorfismo, ya que sobrescribe el método 
 * displayInfo() de la superclase para mostrar información adicional 
 * relacionada con la garantía.
 */
public class Electronics extends Product {
    
    int warrantyPeriodInMonths;


    /*
     * Inicializa los atributos heredados name y proce a través del constructor
     * de la superclase Product,
     * y asigna el valor propio de warrantyPeriodInMonths
     */
    public Electronics(String name, double price, int warrantyPeriodInMonths) {
        super(name, price);

        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }

    /*
     * Sobrescribe el método displayInfo() de la clase Product.
     * 
     * Primero ejecuta el comportamiento original definido en la superclase,
     * y despues agrega la impresion del periodo de garantía para reflejar
     * información específica de productos electrónicos.
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warrantyPeriodInMonths + " months.");
    }
}

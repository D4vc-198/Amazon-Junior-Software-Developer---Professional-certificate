/*
 * La clase Clothing representa un tipo específico de producto.
 * Hace uso de la herencia porque extiende de la clase Product, 
 * lo que le permite reutilizar los atributos y comportamientos 
 * de la clase base como name y price.
 *
 * Además, agrega un nuevo atributo propio: size,
 * que indica el tamaño de la prenda.
 *
 * También ejemplifica el polimorfismo, ya que sobrescribe el método 
 * displayInfo() de la superclase para mostrar información adicional 
 * relacionada con la prenda
 */

public class Clothing extends Product {
    String size;

    /*
     * Inicializa los atributos heredados name y price a través del constructor
     * de la superclase Product,
     * y asigna el valor propio de size
     */
    public Clothing(String name, double price, String size) {
        super(name, price);

        this.size = size;
    }

    /*
     * Sobrescribe el método displayInfo() de la clase Product.
     * 
     * Primero ejecuta el comportamiento original definido en la superclase,
     * y despues agrega la impresion del periodo de garantía para reflejar
     * información específica de las prendas.
     */
    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Size: " + size);
    }
}

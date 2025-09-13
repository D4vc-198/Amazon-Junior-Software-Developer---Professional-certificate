/*
 * La clase ShoppingCart representa un carrito de compras que puede almacenar
 * distintos tipos de productos. Gracias al polimorfismo, no importa si el objeto
 * que se agrega es un Electronics o un Clothing: el método adecuado para mostrar
 * la información del producto se ejecutará en tiempo de ejecución.
 */
public class ShoppingCart {
    
/*
     * Añade un producto al carrito de compras.
     * 
     * Parámetro:
     *  - item: objeto de tipo Product, que puede ser una instancia de Electronics o Clothing.
     * 
     * Funcionamiento:
     *  - Se llama al método displayInfo() del objeto recibido.
     *    Debido al polimorfismo, se ejecuta la versión sobrescrita correspondiente
     *    al tipo real del objeto (ya sea Electronics o Clothing).
     *  - Luego, se imprime un mensaje indicando que el producto fue agregado al carrito.
     */
    public void addItem(Product item) {
       item.displayInfo();
       
       System.out.println("Item added to cart.\n");
    }
}

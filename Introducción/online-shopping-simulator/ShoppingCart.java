/*
 * Cuando se llama a addItem() para añadir un objeto electrónico o de ropa al carrito de compras
 * el polimorfismo garantiza que se llame a la versión correcta de la informacion de la pantalla en
 * funcion del tipo de objeto real.
 */
public class ShoppingCart {
    
    /*
     * Recibe un parametro de tipo Product (Electronics o Clothing)
     * Muestra la información del producto pasado por parámetro
     * y muestra un mensaje adicional indicando que se ha agregado el producto al carrito
     */
    public void addItem(Product item) {
       item.displayInfo();
       
       System.out.println("Item added to cart.\n");
    }
}

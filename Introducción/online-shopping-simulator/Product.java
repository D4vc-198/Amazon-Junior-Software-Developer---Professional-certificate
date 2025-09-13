public class Product {
    String name;
    double price;

    // Constructor parametrizado para inicializar name, price.
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // Método para mostrar la información del dispositivo
    public void displayInfo() {
        System.out.println("Product " + name + ", Price: $" + price);
    }
}

public class Latte extends Coffee {

    // Almacena el tipo del leche a utilizar
    String milkType;
    // Almacena el sabor del sirope
    String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price);

        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    /*
     * Sobrescribimos los métodos de la superClase Coffee para personalizar
     * el comportamiento específico del Latte. Aqui hacemos uso del polimorfismo
     * para adaptar los métodos grindBeans, brewCoffee y printInfo a las necesidades
     * del Latte.
     */

    @Override
    public void grindBeans() {
        System.out.println("Grinding coarse coffee beans for a latte (medium grind)...");
    }

    @Override
    public void brewCoffee() {
        if (!syrupFlavor.equals("no")) {
            System.out.println("Adding " + syrupFlavor + " syrup to the cup...");
        }

        System.out.println("Steaming " + milkType + " milk...");
        System.out.println("Mixing coffee with " + milkType + " milk...");
        System.out.println("Adding a layer of foam on top...");

    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Your latte has " + milkType + "and " + syrupFlavor + ".");
        System.out.println("Your total bill is $" + price);
    }

}
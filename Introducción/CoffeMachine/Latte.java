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

    public void printLatteDetails() {
        System.out.println("Your latte has " + milkType + "and " + syrupFlavor + ".");
        System.out.println("Your total bill is $" + price);
    }
}
public class Espresso extends Coffee {

    // Almacena el número de porciones
    int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots) {
        // Llamamos al constructor de la superClase
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    /*
     * Sobrescribimos los métodos de la superClase Coffee para personalizar
     * el comportamiento específico del Espresso. Aqui hacemos uso del polimorfismo
     * para adaptar los métodos grindBeans, brewCoffee y printInfo a las necesidades
     * del Espresso
     */

    @Override
    public void grindBeans() {
        System.out.println("Grinding espresso beans finely...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("Preparing espresso at high pressure...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("You ordered " + numberOfShots + " servings!");
        System.out.println("Each serving of espresso costs $" + super.price + ".");
        System.out.println("Your total bill is: $" + (numberOfShots * super.price));
    }

}

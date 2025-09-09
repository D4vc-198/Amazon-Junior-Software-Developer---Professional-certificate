public class Espresso extends Coffee {
    
    // Almacena el número de porciones
    int numberOfShots;


    public Espresso(String name, String roast, double price, int numberOfShots) {
        // Llamamos al constructor de la superClase
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    public void printEspressoDetails() {
        System.out.println("You ordered " + numberOfShots + " servings!");
        System.out.println("Each serving of espresso costs $" + super.price + ".");
        System.out.println("Your total bill is: $" + (numberOfShots * super.price) );
    }

}

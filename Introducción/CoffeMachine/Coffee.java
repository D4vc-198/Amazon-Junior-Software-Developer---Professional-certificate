public class Coffee {

    // Atributos para almacenar información sobre el café
    String name;                // Por ejemplo, "Espresso", "Latte", "Mocha"
    String roast;               // Por ejemplo, "light", "medium", "dark"
    int caffeineLevelInMg;      // Calculado basado en el tipo de tueste
    double price;               // En dolares, por ejemplo, 2.50

    // Constructor para crear un nuevo objeto de café con la información dada
    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;

        // El constructor llama al método para establecer el nivel de cafeína basado en el tueste
        setCaffeineLevel();
    }

    // Metodo para establecer el nivel de cafeína del café basado en el tueste
    public void setCaffeineLevel() {
        if (roast.equals("light")) {
            caffeineLevelInMg = 50;
        } else if (roast.equals("medium")) {
            caffeineLevelInMg = 100;
        } else if (roast.equals("dark")) {
            caffeineLevelInMg = 150;
        } else {
            caffeineLevelInMg = 0;
        }
    }

    // Metodo para simular la molienda de los granos de café
    public void grindBeans() {
        System.out.println("\nGrinding beans for " + name + "...");
    }

    // Metodo para simular la preparación del café
    public void brewCoffee() {
        System.out.println("\nBrewing your favorite " + name + "...");
    }

    // Metodo para imprimir la información del café
    public void printInfo() {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffeineLevelInMg + " mg.");
    }
}
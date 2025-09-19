import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        // Crea el objeto Scanner para leer la entrada
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            // Lee la elección del usuario
            int choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    // Inicializa el nombre del Espresso
                    String espressoName = "Espresso";

                    // Inicializa el precio del Espresso por porción
                    double espressoPrice = 2.50;

                    // Le pregunta al usuario el tipo de tueste y lo almacena en espressoRoast
                    System.out.print("What Roast would you like? (light, medium, dark): ");
                    String espressoRoast = keyboard.next();

                    // Le pregunta al usuario el número de porciones y lo almacena en numberOfShots
                    System.out.print("How many servings would you like? (a number please): ");
                    int numberOfShots = keyboard.nextInt();

                    // Crea un objeto Espresso usando la información proporcionada por el usuario
                    Espresso myEspresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);

                    myEspresso.grindBeans();
                    myEspresso.brewCoffee();
                    myEspresso.printInfo();
                    myEspresso.printEspressoDetails();

                    break;
                case 2:
                    // Inicializa el nombre del Latte
                    String latteName = "Latte";

                    // Inicializa el precio del Latte
                    double lattePrice = 3.50;

                    // Le pregunta al usuario el tipo de tueste y lo almacena en latteRoast
                    System.out.print("What Roast would you like? (light, medium, dark): ");
                    String latteRoast = keyboard.next();

                    // Le pregunta al usuario el tipo de leche y lo almacena en milkType
                    System.out.print("What milk type would you like? (whole, skim, almond, oat): ");
                    String milkType = keyboard.next();

                    // Le pregunta al usuario si quiere jarabe o no
                    System.out.print("Would you like syrup? (yes/ no): ");
                    String syrupWanted = keyboard.next();

                    String syrupFlavor = "no";
                    // Si syrupWanted es "yes", pregunta al usuario por el sabor del jarabe y lo almacena en syrupFlavor
                    if(syrupWanted.equals("yes")){
                        System.out.print("Which flavor would you like? (vanilla, caramel, hazelnut): ");
                        syrupFlavor = keyboard.next();
                    }

                    Latte myLatte = new Latte(latteName, latteRoast, lattePrice, milkType, syrupFlavor);

                    myLatte.grindBeans();
                    myLatte.brewCoffee();
                    myLatte.printInfo();
                    myLatte.printLatteDetails();

                    break;
                case 3:
                    System.out.println("Thank you for using the Coffee Machine!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}

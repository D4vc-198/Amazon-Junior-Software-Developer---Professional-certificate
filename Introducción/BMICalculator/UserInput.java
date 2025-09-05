import java.util.Scanner;

// La clase UserInput implementa métodos que se utilizan para obtener entradas del usuario para el cálculo del IMC
public class UserInput {

    // Método que solicita y retorna el sistema métrico ingresado por el usuario
    public String obtainBMISystem() {

        // Imprimimos el mensaje de bienvenida
        System.out.println("Welcome to the BMI calculator app!");
        System.out.print("Please select the preferred BMI calculation system (Imperial/Metric):");

        // Creamos un objeto Scanner para las entradas del usuario
        Scanner input = new Scanner(System.in);

        // Obtenemos la entrada del usuario y la almacenamos en la variable bmiSystem
        String bmiSystem = input.next();

        // Validamos la entrada del usuario
        // Si la entrada del usuario es distinto a los 2 asos: Imperial || Imperial
        // retornamos una cadena vacía
        if (!(bmiSystem.equalsIgnoreCase("Imperial") ||
                bmiSystem.equalsIgnoreCase("Metric"))) {
            return "";
        }

        // De lo contrario, retornamos el sistema ingresado por el usuario
        return bmiSystem;
    }

    // Método para obtener el peso (weight)
    public double obtainWeight(String bmiSystem) {

        double weight = 0;
        boolean isInvalidInput = true;

        // Se ejecuta cada que isInvalidInput = true
        while (isInvalidInput) {

            Scanner input = new Scanner(System.in);

            // Convertimos el sistema ingresado a Mayusculas y validamos
            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL":
                    System.out.print("Enter weight in Pounds:");
                    break;
                case "METRIC":
                    System.out.print("Enter weight in Kilos:");
                    break;
                case "":
                    System.out.println("Please Enter a valid BMI System as input");
                    break;
            }

            // Esperamos la entrada del usuario y validamos que sea double
            // De ser asi, cambiamos isInvalidInput = false para salir del bucle
            if (input.hasNextDouble()) {
                weight = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Please enter a valid weight");
                weight = 0;
            }
        }

        // Finalmente retornamos weight
        return weight;
    }

    // Método para obtener la altura (height)
    public double obtainHeight(String bmiSystem) {
        double height = 0;
        boolean isInvalidInput = true;

        // Se ejecuta cada que isInvalidInput = true
        while (isInvalidInput) {
            Scanner input = new Scanner(System.in);
            // Convertimos el sistema ingresado a Mayusculas y validamos
            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL":
                    System.out.print("Enter height in Inches:");
                    break;
                case "METRIC":
                    System.out.print("Enter height in Meters:");
                    break;
                case "":
                    System.out.println("Please Enter a valid BMI System as input");
                    break;
            }

            // Esperamos la entrada del usuario y validamos que sea double
            // De ser asi, cambiamos isInvalidInput = false para salir del bucle
            if (input.hasNextDouble()) {
                height = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Please enter a valid height");
                height = 0;
            }
        }
        // Finalmente retornamos height
        return height;
    }
}

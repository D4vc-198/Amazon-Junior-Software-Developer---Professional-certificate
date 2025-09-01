import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Car myFirstCar = new Car();
        Scanner scanner = new Scanner(System.in);

        // Creamos un carro individual
        myFirstCar.make = "Toyota";
        myFirstCar.model = "Corolla";
        myFirstCar.color = "Blue";
        myFirstCar.year = 2020;
        myFirstCar.getCarDetails();

        // Creamos una coleccion de carros 
        // donde el usuario llenara la información de cada carro
        Car[] cars = new Car[5];

        for (int index = 0; index < 5; index++) {
            cars[index] = new Car();

            System.out.println("Enter details for car" + (index + 1));

            System.out.print("Make: ");
            cars[index].make = scanner.nextLine();

            System.out.print("Model: ");
            cars[index].model = scanner.nextLine();

            System.out.print("Color: ");
            cars[index].color = scanner.nextLine();

            System.out.print("Year: ");
            cars[index].year = scanner.nextInt();
            scanner.nextLine();
        }

        // Imprimimos la coleccion de carros
        System.out.println("Your Car Collection");
        for (int index = 0; index < 5; index++) {
            String cardDetails = cars[index].getCarDetails();

            System.out.println("--- Car " + (index + 1) + "---");
            System.out.println(cardDetails);
        }
    }
}
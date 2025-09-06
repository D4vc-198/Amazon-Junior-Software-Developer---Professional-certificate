public class Vehicle {

    // Variables miembro de la clase Vehicle
    String make;
    String model;
    String color;
    int speed;

    // Constructor parametrizado de Vehicle
    // El constructor crea el objeto con los valores proporcionados
    // Inicializa make, model y color con los valores proporcionados y establece speed en 0
    public Vehicle(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;

        System.out.println("Vehicle created.");
    }

    // Metodo para acelerar el Vehiculo
    public void accelerate() {
        System.out.println("The vehicle is speeding up.");
        this.speed +=5;
    }

    // Metodo para frenar el Vehiculo
    public void brake() {
        System.out.println("The vehicle is slowing down.");
    }

    // Metodo para obtener la velocidad del Vehiculo
    public int getSpeed() {
        return speed;
    }
}
public class Car extends Vehicle {
    int seatPosition;

    // Constructor parametrizado
    // Llama al constructor de la superclase Vehicle para inicializar make, model y color
    public Car(String make, String model, String color) {
        // Inicializa las variables de Vehicle
        super(make, model, color); 
        // Inicializa la variable específica de Car
        this.seatPosition = 0; 
        
        System.out.println("Car created.");
    }

    public void adjustSeat(int adjustment) {
        this.seatPosition += adjustment;

        if (adjustment > 0) {
            System.out.println("Moving seat forward...");
        } else if (adjustment < 0) {
            System.out.println("Moving seat backward...");
        } else {
            System.out.println("Seat position not changed.");
        }
    }
}

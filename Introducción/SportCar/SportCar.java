public class SportCar extends Car {
    int turboBoost;

    // Constructor parametrizado
    // Llama al constructor de la superclase Vehicle para inicializar make, model y
    // color
    public SportCar(String make, String model, String color) {
        super(make, model, color);
        this.turboBoost = 0;

        System.out.println("SportCar created.");
    }

    // Metodo para activar el turboBoost
    public void activateTurboBoost() {
        super.accelerate();
        this.turboBoost += 50;
        this.speed += turboBoost;
        System.out.println("Turbo boost activated.");
    }
}



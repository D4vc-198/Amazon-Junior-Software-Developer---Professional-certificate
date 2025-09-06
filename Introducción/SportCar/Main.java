public class Main {
    public static void main(String args[]) {
        
        SportCar gt = new SportCar("Mustang", "Ford Mustang GT", "Black");

        // Llamamos al metodo accelerate() heredada de la super clase Vehicle
        gt.accelerate();

        // Llamamos al metodo activateTurboBoost() de la clase SportCar 
        gt.activateTurboBoost();

        System.out.println(gt.model + "is running at " + gt.getSpeed() + " miles per hour");
        
    }
}

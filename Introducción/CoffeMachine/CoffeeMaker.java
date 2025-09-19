/*
 * Clase de utilizad que contiene la lógica común para la preparación de café.
 * Esto ayuda a implementar la reutilización del código y la separacion de preocupaciones.
 */

public class CoffeeMaker {

    public void prepareCoffee(Coffee coffee) {
        // Llama al metodo grindBeans() y brewCoffee() del objeto Coffee
        coffee.grindBeans();
        coffee.brewCoffee();
    }
}

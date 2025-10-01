public class Dolphin extends Animal implements Swim{
    private String color;
    private int swimmingSpeed;

    /*
     * Llamamos al constructor de la superClase
     * para inicializar el nombre del animal
     * y poner Dolphin por defecto
     */
    public Dolphin() {
        super.setNameOfAnimal("Dolphin");
    }

    // Métodos getter/setter para color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = this.color;
    }

    // Métodos getter/setter para swimmingSpeed
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        swimmingSpeed = this.swimmingSpeed;
    }

    
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I'm eating a delicious fish.");
    }

    // Implementamos el metodo eatingCompleted de la interfaz Eat
    // que ha sido heredada por Animal
    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }

    @Override
    public void swimming() {
           System.out.println("Dolphin: I'm swimming at a speed of " + swimmingSpeed + " nautical miles per hour.");
    }

}
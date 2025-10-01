public class Dolphin extends Animal {
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

}
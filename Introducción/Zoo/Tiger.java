public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private int speed;
    private double soundLevel;

    public Tiger() {
        super.setNameOfAnimal("Tiger");
    }

    // Métodos getter/setter para numberOfStripes
    public int getnumberOfStripes() {
        return numberOfStripes;
    }

    public void setnumberOfStripes(int numberOfStripes) {
        numberOfStripes = this.numberOfStripes;
    }

    // Métodos getter/setter para speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        speed = this.speed;
    }


    // Métodos getter/setter para soundLevel
    public double getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(double soundLevel) {
        soundLevel = this.soundLevel;
    }

    // Implementamos el metodo eatingCompleted de la interfaz Eat
    // que ha sido heredada por Animal
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    
    // Implementamos el metodo walking de la interfaz Walk
    @Override
    public void walking() {
        System.out.println("I'm walking at speed " + speed + " mph");
    }
}

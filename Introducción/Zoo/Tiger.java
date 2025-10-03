public class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed;
    private double soundLevel;

    public Tiger() {
        super("Tiger");
    }

    // GET
    // Métodos getter/setter para numberOfStripes
    public int getnumberOfStripes() {
        return numberOfStripes;
    }

    // SET
    public void setnumberOfStripes(int numberOfStripes) {
        if (numberOfStripes < 0) {
            this.numberOfStripes = 0;
        } else {
            this.numberOfStripes = numberOfStripes;
        }
    }

    // GET
    // Métodos getter/setter para speed
    public int getSpeed() {
        return speed;
    }

    // SET
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    // GET
    // Métodos getter/setter para soundLevel
    public double getSoundLevel() {
        return soundLevel;
    }

    // SET
    public void setSoundLevel(double soundLevel) {
        if (soundLevel < 0) {
            this.soundLevel = 0;
        } else {
            this.soundLevel = soundLevel;
        }
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

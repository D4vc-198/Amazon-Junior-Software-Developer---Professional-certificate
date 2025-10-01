public class Tiger extends Animal {
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
}

public class Penguin extends Animal implements Walk, Swim {
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin() {
        super.setNameOfAnimal("Penguin");
    }

    // Método GET para isSwimming
    public boolean getIsSwimming() {
        return isSwimming;
    }

    // Método SET para isSwimming
    public void setIsIswimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    // Método GET para walkSpeed
    public int getWalkSpeed() {
        return walkSpeed;
    }

    // Método SET para walkSpeed
    public void setWalkSpeed(int walkSpeed) {
        if (walkSpeed < 0) {
            this.walkSpeed = 0;
        } else {
            this.walkSpeed = walkSpeed;
        }
    }

    // Método GET para swimSpeed
    public int getSwimSpeed() {
        return swimSpeed;
    }

    // Método SET para swimSpeed
    public void setSwimSpeed(int swimSpeed) {
        if (swimSpeed < 0) {
            this.swimSpeed = 0;
        } else {
            this.swimSpeed = swimSpeed;
        }
    }

    // Anulamos el método eatingFood de la superClase Animal
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I'm eating a delicious fish.");
    }

    // Implementamos el metodo eatingCompleted
    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }

    // Implementamos el método walking de la interfaz Walk
    @Override
    public void walking() {
        System.out.println("I'm walking at speed " + walkSpeed + " mph");
    }

    // Implementamos el método swimming de la interfaz Swim
    @Override
    public void swimming() {
        System.out.println("Penguin: I'm swimming at a speed of " + swimSpeed + " nautical miles per hour.");
    }

}

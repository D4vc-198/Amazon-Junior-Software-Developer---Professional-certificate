import java.util.Scanner;

public class SideKick {

    Scanner keyboard;

    private int modeOfOperation;

    int batteryCharge;

    /** Constructor **/
    public SideKick() {
        keyboard = new Scanner(System.in);

        // la carga inicial de la bateria es 0
        batteryCharge = 0;

        // establecer el valor predeterminado en limpieza o 1
        modeOfOperation = 1;
    }

    // Método getter para obtener el valor de batteryCharge
    public int getBatteryCharge() {
        return batteryCharge;
    }

    // Método setter para establecer el valor de batteryCharge
    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public void rechargeBattery() {
        System.out.println("Plug into socket.....");
        System.out.print("Charging ..");
        for (int i = 0; i <= 100; i += 10) {
            System.out.print(".");
            batteryCharge = i;

        }
        System.out.println("\nUnplug from socket.....");
        System.out.println("Fully charged.....");

    }

    public void displayBatteryLevel() {
        System.out.println("The battery charge is at :" + batteryCharge + " %.");
    }

    // Metodo getter para obtener el valor de modeOfOperation
    public int getModeOfOperation() {
        return modeOfOperation;
    }

    // Metodo setter para establecer el valor de modeOfOperation
    public void setModeOfOperation(int modeOfOperation) {
        if (modeOfOperation < 1 || modeOfOperation > 3) {
            this.modeOfOperation = 1;
        } else
            this.modeOfOperation = modeOfOperation;
    }

    // Muestra el menú y establece el modo de operación según la elección del
    // usuario
    public void setChoice() {
        System.out.println("***** SideKick Menu *****");
        System.out.println("1. Cleaning");
        System.out.println("2. Cooking");
        System.out.println("3. Re-charge");

        System.out.println("Enter choice(1-3):");
        int choice = keyboard.nextInt();
        modeOfOperation = choice;
    }

    // Método para realizar la acción según el modo de operación
    public void takeAction() {
        switch (modeOfOperation) {
            case 1:
                cleanHouse();
                System.out.println("SideKick cleaning completed.");
                break;
            case 2:
                cookFood();
                System.out.println("SideKick cooking completed.");
                break;
            case 3:
                rechargeBattery();
                System.out.println("SideKick recharged battery.");
                break;
            default:
                System.out.println("SideKick does not support the operation.");
        }
    }

    // Método para limpiar
    private void cleanHouse() {
        System.out.println("Get the vacuum cleaner.....");
        System.out.println("Put the dust bag in vacuum.....");
        System.out.println("Go to Living room and clean.....");
        System.out.println("Go to bedroom and clean.....");
        System.out.println("Go to kitchen and clean.....");
        System.out.println("Go to bathroom and clean.....");
        System.out.println("Retrieve dust bag from vacuum cleaner and put in bin.....");
        System.out.println("Go back to Toni.....");
    }

    // Método para cocinar
    private void cookFood() {
        System.out.println("Move to the kitchen.....");
        System.out.println("Get the vegetables.....");
        System.out.println("Cut the vegetables.....");
        System.out.println("Turn on the gas.....");
        System.out.println("Get the cooking pan and oil ready.....");
        System.out.println("Cook the food.....");
        System.out.println("Turn off the gas.....");
        System.out.println("Get it ready on the plate.....");
        System.out.println("Go back to Toni.....");
    }

}

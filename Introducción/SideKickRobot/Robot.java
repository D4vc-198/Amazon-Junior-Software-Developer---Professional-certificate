/*
 * Clase abstracta Robot
 *  representa un concepto general de un Robot
 * y no tiene una funcionalidad específica
 */

public abstract class Robot {

    private int modeOfOperation;
    private int batteryCharge;

    public Robot() {
        // la carga inicial de la bateria es 0
        batteryCharge = 0;
        // establecer el valor predeterminado en limpieza o 1
        modeOfOperation = 1;
    }

    // Metodo accessor/getter para obtener el valor de modeOfOperation
    public int getModeOfOperation() {
        return modeOfOperation;
    }

    // Metodo mutator/setter para establecer el valor de modeOfOperation
    public void setModeOfOperation(int modeOfOperation) {
        if (modeOfOperation >= 1 && modeOfOperation <= 3) {
            this.modeOfOperation = modeOfOperation;
        } else {
            this.modeOfOperation = 1;
        }
    }

    // Método acessor/getter para obtener el valor de batteryCharge
    public int getBatteryCharge() {
        return batteryCharge;
    }

    // Método mutator/setter para establecer el valor de batteryCharge
    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    // Método para simular la recarga de la batería
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

    // Método para mostrar el nivel de la batería
    public void displayBatteryLevel() {
        System.out.println("The battery charge is at :" + batteryCharge + " %.");
    }

}

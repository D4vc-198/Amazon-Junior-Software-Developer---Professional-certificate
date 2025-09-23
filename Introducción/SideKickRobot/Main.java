public class Main {
    public static void main(String[] args) {

        SideKick sideKickObject = new SideKick();


        sideKickObject.setModeOfOperation(3);
        sideKickObject.takeAction();

        sideKickObject.setModeOfOperation(1);
        sideKickObject.takeAction();

        sideKickObject.setModeOfOperation(2);
        sideKickObject.takeAction();

        
    }
}
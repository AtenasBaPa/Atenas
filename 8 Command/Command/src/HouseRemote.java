import java.util.InputMismatchException;
import java.util.Scanner;

public class HouseRemote {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            boolean Salir = false;
            int opc;
 
            while (!Salir) {
 
                System.out.println("1. Turn Lights On");
                System.out.println("2. Turn Lights Off");
                System.out.println("3. Open Door");
                System.out.println("4. Close Door");
                System.out.println("5. Exit");
 
                try {
 
                    System.out.println("Please, choice an option:");
                    opc = sn.nextInt();
 
                    switch (opc) {
                        case 1:
                            TurnLightsOnCommand();
                            System.out.println("The lights are on");
                            break;
                        case 2:
                            TurnLightsOffCommand();
                            System.out.println("The lights are off");
                            break;
                        case 3:
                            OpenDoorCommand();
                            System.out.println("The door is open");
                            break;
                        case 4:
                            CloseDoorCommand();
                            System.out.println("The door is closed");
                            break;
                        case 5:
                            Salir = true;
                            break;
                        default:
                            System.out.println("Please, choice an option between 1 and 5");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Sorry, you made a mistake, please try again");
                    sn.next();
                }
            }
        }
    }


    private static void TurnLightsOnCommand() {
        System.out.println("Turning lights on...");
        
    }
    
    private static void TurnLightsOffCommand() {
        System.out.println("Turning lights off...");
    }

    private static void OpenDoorCommand() {
        System.out.println("The door is opening...");
    }

    private static void CloseDoorCommand() {
        System.out.println("The door is closing...");
    }

    

    
   
}
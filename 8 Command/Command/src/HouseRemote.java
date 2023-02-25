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
                            
                            System.out.println("The lights are on");
                            break;
                        case 2:

                            System.out.println("The lights are off");
                            break;
                        case 3:
                            
                            System.out.println("The door is open");
                            break;
                        case 4:
                            
                            System.out.println("The door is close");
                            break;
                        case 5:
                            Salir = true;
                            break;
                        default:
                            System.out.println("Please, choice an option between 1 and 5");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Sorry, you make a mistake, please, try again");
                    sn.next();
                }
            }
        }
    }

    

}
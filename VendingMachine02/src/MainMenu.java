import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainMenu {

    public static void showMainMenu() throws FileNotFoundException {


        Scanner scanner = new Scanner(System.in);
        int clientInput;




    while(true){
        System.out.println("[ 1 ] Buy Some Drink " + "\n[ 2 ] ADMIN");
        clientInput = scanner.nextInt();
        switch (clientInput) {
            case 1 -> new Menu().showMenu();
            case 2 -> AdminMenu.adminLogin();
            default -> System.out.println("invalid selection please try again");
        }
    }





    }






}

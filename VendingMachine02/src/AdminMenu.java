import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminMenu {
  final  private static String ADMIN_USER_NAME = "alpaca69";
    final private  static String  ADMIN_PASSWORD = "1234";
    public static void adminLogin() throws FileNotFoundException {


        Scanner scanner = new Scanner(System.in);




        System.out.println("Enter Admin User Name : " );
        String adminUserNameInput = scanner.next();
        System.out.println("Enter Admin Password");
        String adminPasswordInput = scanner.next();
        if (adminUserNameInput.equals(ADMIN_USER_NAME) && adminPasswordInput.equals(ADMIN_PASSWORD)) {
            System.out.println("Hello Admin !");
            showAdminMenu();
        } else {
            System.out.println("""
                    Wrong Admin User Name or Password\s
                     Press [ 1 ] to try again\s
                     Press [ 2 ] for Exit to the Main Menu""");
            int userSelect = scanner.nextInt();
            if (userSelect == 1){
                adminLogin();
            } else if (userSelect == 2) {
                MainMenu.showMainMenu();

            }

        }
    }

    public static void showAdminMenu() throws FileNotFoundException {



        Scanner scanner = new Scanner(System.in);

        AdminMethods adminMethods = new AdminMethods();
        boolean endMenu = false;
        while (!endMenu){

            System.out.println("""
                (1) ~> Refill Products
                (2) ~> Add New Product
                (3) ~> Edit Existing Product
                (4) ~> Current Stock & Coin box status
                (5) ~> Emptying the coin box
                (6) ~> Plant Nuclear Bomb
                (7) ~> Exit To Main Menu
                (8) ~> SHUT DOWN VENDING MACHINE
                """);
            int adminSelect = scanner.nextInt();

            switch (adminSelect) {
                case 1 -> adminMethods.refillProducts();
                case 2 -> adminMethods.addNewProduct();
                case 3 -> adminMethods.editProduct();
                case 4 -> adminMethods.currentStatus();
                case 5 -> adminMethods.emptyingCoinBox();
                //case 6 -> MainMenu.showMainMenu();
                case 7 -> endMenu = true;
                case 8 -> adminMethods.shutDown();
                default -> { System.out.println("!!!!!!  TRY AGAIN (PLS)  !!!!!!!!");
                   // showAdminMenu();
                }

            }
        }









}}

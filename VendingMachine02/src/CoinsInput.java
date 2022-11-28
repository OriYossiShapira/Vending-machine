import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoinsInput{
    public static void coinsInput(double price) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        int userInput;

        double userTotal = 0;

        System.out.println("Please choose coins to insert\n\n");

        while (userTotal < price){
            System.out.println("""
                    [1] Ten aggorot
                    [2] Half a sheckel
                    [3] One sheckel
                    [4] Two sheckels
                    [5] Five sheckels
                    [6] Ten sheckels
                    [7] Cancel purchase""");
            userInput = scanner.nextInt();
            switch (userInput){
                case 1 -> userTotal += Coin.TEN_AGOROT.getValue();
                case 2 -> userTotal += Coin.HALF_SHEKEL.getValue();
                case 3 -> userTotal += Coin.ONE_SHEKEL.getValue();
                case 4 -> userTotal += Coin.TWO_SHEKEL.getValue();
                case 5 -> userTotal += Coin.FIVE_SHEKEL.getValue();
                case 6 -> userTotal += Coin.TEN_SHEKEL.getValue();
                case 7 -> {

                    System.out.println("Order canceled. " + userTotal + " refunded.\n\n" + "You will be returned to drinks menu screen\n\n");
                    userTotal = 0;
                    //Menu.showMenu();
                }
                default -> System.out.println("Invalid selection!\n");
            }
            if (userTotal < price)
                System.out.println("You put " + userTotal + '\u20AA' + "in.\n" + (price - userTotal) + '\u20AA' + " remaining.");
        }

        System.out.println("Please take your drink");
        if (userTotal > price){
            System.out.println("Your change is " + (userTotal - price) + '\u20AA');
        }

        System.out.println("Have a nice day!");

    }
}
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    private VendingMachine vm;

    public Menu() throws FileNotFoundException {
        vm = new VendingMachine();
    }
    public  void showMenu() throws FileNotFoundException {


        Scanner scanner = new Scanner(System.in);


        int userInput;
        String menu = "";
        ProductList pl = vm.getInventory();
        for(int i = 0; i < pl.getProductList().size() ;i++){
            ProductsForFile p = pl.getProductList().get(i);
            menu += "\n[" + (i+1) + "]" + p.getProductName() +" " + p.getPrice() +  '\u20AA';
        }
//        System.out.println("[1] " + + '\u20AA'
//                + "\n[2] Sprite-" + + '\u20AA'
//                + "\n[3] Fanta Exotic-" + + '\u20AA'
//                + "\n[4] Fuza Tea-" +  + '\u20AA'
//                + "\n[5] Neviot Mineral Water-" +  + '\u20AA'
//                + "\n[6] Prigat Orange-" + + '\u20AA');


        System.out.println("\nPlease select drink.");
        System.out.println(menu);

        userInput = scanner.nextInt();
        ProductsForFile p = pl.getProductList().get(userInput -1);

        int productPrice = 0;

//        switch (userInput) {
//            case 1 -> productPrice = Products.COCA_COLA.getPrice();
//            case 2 -> productPrice = Products.SPRITE.getPrice();
//            case 3 -> productPrice = Products.FANTA_EXOTIC.getPrice();
//            case 4 -> productPrice = Products.FUZE_TEA.getPrice();
//            case 5 -> productPrice = Products.NEVIOT_MINERAL_WATER.getPrice();
//            case 6 -> productPrice = Products.PRIGAT_ORANGE.getPrice();
//            default -> {
//                System.out.println("Invalid Selection!\n");
//                showMenu();
//            }
//        }

        CoinsInput.coinsInput(p.getPrice());
        vm.sell(p);
    }
}


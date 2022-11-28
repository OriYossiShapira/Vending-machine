import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminMethods {

    private VendingMachine vm;
    private Scanner scanner;

    public AdminMethods() throws FileNotFoundException {
        vm = new VendingMachine();
        scanner = new Scanner(System.in);
    }

    // TODO products refill
    public  void refillProducts() throws FileNotFoundException {
        vm = new VendingMachine();
        System.out.println("Successfully Done");

    }

    //TODO add new product
    public  void addNewProduct(){

        System.out.println("Enter product name");
        String name = scanner.nextLine();
        System.out.println("Enter product price");
        double price = scanner.nextDouble();
        System.out.println("Enter product stock");
        int supp = scanner.nextInt();
        vm.add(name, price, supp);
    }


    //TODO Edit Existing Product
    public  void editProduct(){
        String menu = "";
        ProductList pl = vm.getInventory();
        for(int i = 0; i < pl.getProductList().size() ;i++){
            ProductsForFile p = pl.getProductList().get(i);
            menu += "\n[" + (i+1) + "]" + p.getProductName() +" " + p.getPrice() +  '\u20AA';
        }
        System.out.println("\nPlease select product to edit.");
        System.out.println(menu);

        int userInput = scanner.nextInt();
        ProductsForFile p = pl.getProductList().get(userInput -1);
        System.out.println("you selected " + p.getProductName());
        String changeSelection = "\n1. change name, \n2. change price. ";
        System.out.println(changeSelection);
        userInput = scanner.nextInt();
        if(userInput == 1){
            System.out.println("Enter new name");
            String name = scanner.nextLine();
            p.setProductName(name);
        }else if(userInput == 2){
            System.out.println("Enter new price");
            double price = scanner.nextDouble();
            p.setPrice(price);
        }


    }


    //TODO Current Stock & Coin box status
    public  void currentStatus(){
        System.out.println(vm);
    }


    //TODO Emptying the coin box
    public  void emptyingCoinBox(){
        vm.setBalance(0);
    }


    //TODO shut down vending machine
    public  void shutDown(){
        System.exit(0);
    }
}

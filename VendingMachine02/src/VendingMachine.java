import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class VendingMachine {

    private ProductList inventory;
    private double balance;

    //public VendingMachine() {
     //   this.productList = new ProductList();
   // }

    public VendingMachine() throws FileNotFoundException {
        readData();
        this.balance = 0;
    }
    // TODO display customer menu or admin menu


    public void add(String name, double price, int supp){
        inventory.add(name, price, supp);
    }

    public void sell(ProductsForFile product){
        boolean success = this.inventory.decProductCount(product.getProductName());
        if(success){
            ProductsForFile p = this.inventory.getProduct(product.getProductName());
            this.balance += p.getPrice();
        }
    }

    // TODO refund product
    public void refund(String productName){
        boolean success = this.inventory.incProductCount(productName);
        if(success){
            ProductsForFile p = this.inventory.getProduct(productName);
            this.balance -= p.getPrice();
        }
    }

    public ProductList getInventory() {
        return inventory;
    }


    public void setInventory(ProductList inventory) {
        this.inventory = inventory;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private void readData() throws FileNotFoundException {
        Gson gson = new Gson();
        this.inventory = gson.fromJson(new FileReader("src\\files\\products.json"), ProductList.class);
    }

    @Override
    public String toString() {
        String str = "\nProduct list:";

        for(int i = 0; i < inventory.getProductList().size() ;i++){
            ProductsForFile p =inventory.getProductList().get(i);
            str += "\n[" + (i+1) + "]" + p.getProductName() +" " + p.getPrice() +  '\u20AA';
        }

        return  "\nBalance=" + balance + str;
    }

    public static void extractProductName(){

    }
}

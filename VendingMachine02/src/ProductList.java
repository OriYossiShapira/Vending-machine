import java.util.ArrayList;

public class ProductList {
    private ArrayList<ProductsForFile> productList;

    public  ProductList(ArrayList<ProductsForFile> productList) {
        this.productList = productList;
    }

    public ProductList(){
        this.productList = new ArrayList<ProductsForFile>();
    }

    public ArrayList<ProductsForFile> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<ProductsForFile> productList) {
        this.productList = productList;
    }

    // ***** inventory methods ***** //

    public  void add(String name, double price, int supp){
        ProductsForFile p = new ProductsForFile(name, price, supp);
        productList.add(p);
    }
    public ProductsForFile getProduct(String productName){
        for(ProductsForFile p : productList) {
            if (p.getProductName().equals(productName)) {
                return p;
            }
        }
        return null;
    }
    public boolean decProductCount(String productName){
        // TODO find product
        ProductsForFile product = null;
        for(ProductsForFile p : productList){
            if(p.getProductName().equals(productName)){
                product = p;
            }
        }
        // if we found the product
        if(product == null){
            return false;
        }
        if(product.getSupp() == 0){
            return false;
        }

        product.setSupp(  product.getSupp() - 1 );
        return true;
    }

    public boolean incProductCount(String productName){
        // TODO find product
        ProductsForFile product = null;
        for(ProductsForFile p : productList){
            if(p.getProductName().equals(productName)){
                product = p;
            }
        }
        // if we found the product
        if(product == null){
            return false;
        }
        product.setSupp(  product.getSupp() + 1 );
        return true;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productList=" + productList +
                '}';
    }
}

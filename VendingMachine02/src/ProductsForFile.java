

public class ProductsForFile {




        private String productName;
        private Double price;
        private int supp;

        public ProductsForFile(){}


        public ProductsForFile(String productName, Double price, int supp) {
            this.productName =  productName;
            this.price = price;
            this.supp = supp;
        }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSupp() {
        return supp;
    }

    public void setSupp(int supp) {
        this.supp = supp;
    }

    @Override
    public String toString() {
        return "ProductsForFile{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", supp=" + supp +
                '}';
    }
}




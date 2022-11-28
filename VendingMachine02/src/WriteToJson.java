import com.google.gson.*;

import java.io.*;

public class WriteToJson {



    public static void wtj() throws FileNotFoundException {
        ProductsForFile productsForFile = new ProductsForFile();
        productsForFile.setProductName("cola");
        productsForFile.setPrice(12.0);
        productsForFile.setSupp(10);


        File input = new File("src/files/products.json");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();



        try (FileWriter writer  = new FileWriter(input)) {
            gson.toJson(productsForFile, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }



}
}

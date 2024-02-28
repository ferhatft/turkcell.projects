package oopAdvanced.dependencyinjection;


import oopAdvanced.logging.BaseLogger;
import oopAdvanced.logging.DatabaseLogger;
import oopAdvanced.logging.FileLogger;

public class Main {
    public static void main(String[] args) {
        // IoC
        ProductRepository productRepository = new MongoDbProductRepository();
        ProductRepository productRepository1 = new MySqlProductRepository();

        BaseLogger fileLogger = new FileLogger();
        BaseLogger dbLogger = new DatabaseLogger();

        // Loose-coupling
        ProductService productService = new ProductServiceImpl(productRepository,fileLogger); // mysql
        productService.add();

        ProductService productService1 = new ProductServiceImpl(productRepository1, dbLogger); // mongodb
        productService1.add();
    }
}

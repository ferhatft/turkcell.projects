package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Product pcproduct = new Product();

        pcproduct.setName("Asus Thingpad");
        pcproduct.setId(1);
        pcproduct.setDescription("Asus laptop");
        pcproduct.setPrice(5000);
        pcproduct.setStockAmount(3);


        Product pc2product =  new Product();


        ProductManager productManager = new ProductManager();
        productManager.Add(pcproduct);


//        productManager.Add(pc2product);

        System.out.println(pcproduct.getKod());

    }
}
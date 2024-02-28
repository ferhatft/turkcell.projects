package oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.name = "Delonghi kahve makinasi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl =  "bilmemne.jpg";


        Product product2 = new Product();
        product2.name = "Delonghi kahve makinasi";
        product2.unitPrice = 7500;
        product2.discount = 7;
        product2.unitsInStock = 3;
        product2.imageUrl =  "bilmemne.jpg";

        Product product3 = new Product();
        product3.name = "Delonghi kahve makinasi";
        product3.unitPrice = 7500;
        product3.discount = 7;
        product3.unitsInStock = 3;
        product3.imageUrl =  "bilmemne.jpg";

        Product[] products = {product1,product2,product3};



        for (Product i: products){
            System.out.println(i.name);
        }

        for (Product product: products){
            System.out.println(product.name);
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }


}
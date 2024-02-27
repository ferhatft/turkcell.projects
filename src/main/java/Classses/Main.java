package Classses;

//Bağlantılı tüm methodlar aynı class altında toplanır ve takibi ve güncellemesi kolaylaşır
//refference type


public class Main {
    public static void main(String[] args) {

//value type

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

//reference type
        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};

        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);

        DortIslem dortIslem = new DortIslem();

        int output = dortIslem.Remove(5,3);
        System.out.println(output);


// CTOR
        Product product = new Product();

        product.id = 5;
        product.name = "Asus tuf";
        product.description =" Asus marka bilgisayar";
        product.price = 5000;
        product.stockAmount = 23;

        ProductManager productManager = new ProductManager();

        productManager.Add(product);




    }


}

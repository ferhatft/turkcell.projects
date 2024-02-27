package org.example;


// **Encapsulation** = Bir class içerisindeki değişkenlerin farklı bir class tarafından erişim  izninin kontrolünü sağlar
// Class içerisinde  Prive & Public olarak farklı classların erişimleri kontrol edilebilir


// **Getter&Setter**  = classda private olarak tanımladığımız obj leri  getter ve settler ile class dışına nasıl aktarılacağını belirtiriz

// **Cunstroctor**  =
public class Product {
    // CTOR
    // Aşağıddaki gibi  ctor oluşturulduğunda  ctor içerisindeki tüm değişkenleri newleme işleminde değişken parametresi olarak belirtmemiz gerekir.

    public Product(int id, String name, String description, double price, int stockAmount) {


        System.out.println("yapıcı blok çalıştı");

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }


//      Tüm değişkenleri belirtme zorunluluğundan kurtulmak için iki farklı ctor tanımlanabilir ( OverCtor )
    public Product(){

    }

    //attribute |field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    // **Getter&Setter**
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.kod = this.name.substring(0, 1) + this.id;
    }
}

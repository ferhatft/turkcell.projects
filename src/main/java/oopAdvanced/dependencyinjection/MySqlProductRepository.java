package oopAdvanced.dependencyinjection;

public class MySqlProductRepository implements ProductRepository
{

    @Override
    public void addToDb() {
        System.out.println("Mysql veritabanına ürün ekleniyor..");
    }
}

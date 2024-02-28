package oopAdvanced.dependencyinjection;

public class MongoDbProductRepository implements ProductRepository{
    @Override
    public void addToDb() {
        System.out.println("Mongodb veritabanına ürün ekleniyor..");
    }
}

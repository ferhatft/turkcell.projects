package polymorphism;

public class CustomerManager {
    Baselogger logger;

    public CustomerManager(Baselogger logger) {
        this.logger = logger;
    }

    public void Add(){
        System.out.println("Müşteri eklendi");
        logger.Log("Log mesajı");
    }
}

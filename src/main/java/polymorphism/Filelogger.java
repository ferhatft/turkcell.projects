package polymorphism;

public class Filelogger extends Baselogger{

    public void Log(String message) {
        System.out.println("File Log mesajı " + message);
    }
}

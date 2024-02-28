package polymorphism;

public class Main {

    public static void main(String[] args) {

//        Baselogger[] Loggers = new  Baselogger[]{new Filelogger(),new Dblogger(),new Emaillogger()};
//
//        for (Baselogger logger:Loggers){
//            logger.Log("Log mesajı");
//        }

         CustomerManager customerManager = new CustomerManager(new Filelogger());

         customerManager.Add();


    }
}


// aralarında inheritance olan classların birbirinin yerini tutması polymorhism dir
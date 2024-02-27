package methods;


// methods - parameter methods - variable arguments 

//     void methodlarda bir şeyi yapar ama bize bir return yapmaz.
//     void yerine farklı formatlarda  int string double gibi hangi variable ile return yapacağını belirterek farklı methodlar yazılabilir.
//     İstediği kadar değişken gönderebilmesini sağlayabilmek için variable arguments kullanılır

public class Main {

    public static void main(String[] args) {
        String mesaj ="bugün hava güzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int toplam = topla(5,7);
        System.out.println(toplam);
        
        int addition = add(2,3,4,5,6,7,8,9);
        System.out.println(addition);
    }

//    method with arguments
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

//    Methods with variable arguments
    public static int add(int... numbers){
        int addition = 0;
        for (int num:numbers) {
            addition += num;
        }
        return addition;
    }

}

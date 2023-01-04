package TryCAtchBlokları;

public class TryCatchBlokları {
    public static void main(String[] args) {
        //EN COK KARSIMIZA CIKAN HATALAR ...
        //NULL POİNT EXCEPTİON
        try {
            String isim ;
            System.out.println(Test.isim.length());
        }catch (NullPointerException e){
            System.out.println(e.toString());
        }
        //ArrayIndexOutOfBoundsException hatası
        try {
            int [] sayilar = {1,2,3};
            System.out.println(sayilar[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        // NumberFormatException hatası
       try {
           int sayi =Integer.parseInt("123");
           int sayi2 = Integer.parseInt("asdsa");
       }catch (NumberFormatException e ){
           System.out.println(e);
       }finally {
           System.out.println("taktaktak");
       }
        try {
            Class.forName("azadsınıfı");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            System.out.println("buradan taktak");




    }
}
class Test{
    static String isim ;
}

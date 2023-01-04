package dosyaAlıştırmalar;

public class Alştırmalar {
    public static void main(String[] args) {
        try {//try ıcındekı kodu calıstırmayı dene olakı bır hata cıkarsa catch kısmına gel .
            Integer i = new Integer("asd");
            System.out.println(i);
        }catch (Exception e ){
            System.out.println("hata cıktı " + e.toString());
        }
        finally { // hata cıksada cıkmasada bu kodu mutlaka calıstır .
            System.out.println("fınally calıstırıldı ");
        }
        System.out.println("program buradan devam etmeli ");
    }


}

package CollectionFrameWorkKullanımı;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListKullanımı {
    public static void main(String[] args) {
        //bellekte 10 eleman tutan bir arraylist olusturur.
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        ArrayList<String> isimler = new ArrayList<>(1000);
        isimler.add("tk");
        ArrayList<String> isimlerYedek = new ArrayList<>(isimler);
        System.out.println(isimlerYedek);
        //arraylisti verilen sayı kadar eleman tutacak sekılde attırır.
        isimler.ensureCapacity(100);
        //arraylisti sadece icindeki eleman tutacak kadar küçültür.
        isimler.trimToSize();
        //eleman sayısını gösterir
        System.out.println(isimlerYedek.size());
        // liste bos ise true dondurür .
        System.out.println(isimlerYedek.isEmpty());
        //bütün liste silmek icin
        isimlerYedek.clear();
        System.out.println(isimlerYedek.isEmpty());
        System.out.println(isimler.contains("tk"));
        //toArray ile arraylist diziye dondurelubıılır.
        String [] isimlerDizisi = (String[]) isimler.toArray(new String[0]);
        System.out.println(isimlerDizisi[0]);
        //belirli indeksteki elemanı okumak
        System.out.println(isimler.get(0));
        //belirli bir indeksteki elemanı guncellemek
        isimler.set(0,"yeni azad");
        System.out.println(isimler.get(0));
        //belirli bir indekse eleman yerleştirmek.
        isimler.add(1,"azad");
        System.out.println(isimler);
        //belirli bir indeksteki elemanı silmek icin
        isimler.remove("azad");
        System.out.println(isimler);
        isimler.add("taktak");
        isimler.add("hafsa");
        isimler.add("ronas");
        // belirli indeksler arasındaki elemanları yeni bir listeye atamak
        List<String> yeniDizi = isimler.subList(1,3);
        System.out.println(yeniDizi);
        //iki listeyi birleştirmek icin addAll kullanılır
        //arrayi listeye donusturmek
        String [] sehirler = {"izmir" , "bursa" , "izmir"};
        List<String> sehirelerListe;
        sehirelerListe = Arrays.asList(sehirler);
        System.out.println(sehirelerListe);



    }
}

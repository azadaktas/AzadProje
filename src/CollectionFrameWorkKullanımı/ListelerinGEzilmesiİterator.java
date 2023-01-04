package CollectionFrameWorkKullanımı;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ListelerinGEzilmesiİterator {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        ArrayList<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(3);
        sayilar1.add(4);
        sayilar1.add(5);
        sayilar1.add(6);
        System.out.println(sayilar);
        System.out.println("sayıları for dongüsü ile gezmek ");
        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println(sayilar.get(i));
        }
        System.out.println("gelismis for dongüsü");
        for (int gecici : sayilar) {
            System.out.println(gecici);
        }
        System.out.println("sayilar 1 ve 2 de ortak olan elamanları cıkar ");
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar1.contains(sayilar.get(i))) {
                sayilar.remove(i);
            }

        } //böyle sıralı gezmelerde ıterator kullaınılır .
        // listiterator ıle gerıye de gıdelebılır.
        System.out.println("cıkarılma ıslemınden sonra sayılar " + sayilar);
        System.out.println("iteratör ile lıstenın gezilmesi ");
        Iterator<Integer> iterator = sayilar.iterator();
        while (iterator.hasNext()) {
            if (sayilar1.contains(iterator.next())) {
                iterator.remove();
            }

        }
        System.out.println("it" + sayilar);
        System.out.println("listiterator");
        ListIterator<Integer> listIterator = sayilar1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("listiteratorsondan basa");
        ListIterator<Integer> listIteratorSondanBasa = sayilar1.listIterator(sayilar1.size());//burda ındex degerı gırmek püf noktası.
        while (listIteratorSondanBasa.hasPrevious()) {
            System.out.println(listIteratorSondanBasa.previous());
        }
    }

}

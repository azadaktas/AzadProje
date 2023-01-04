package CollectionFrameWorkKullanımı;

import java.util.LinkedList;
import java.util.ListIterator;

public class Lınkedlisttttt {
    public static void main(String[] args) {
        //ctrl b ıle bir üst sınıfın ne olduuguna bakılabılır .
        LinkedList <Integer> sayilar = new LinkedList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(2,3);
        sayilar.set(1,10);
        System.out.println(sayilar);
        System.out.println(sayilar.get(1));
        ListIterator<Integer> listIterator = sayilar.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


    }

}

package CollectionFrameWorkKullanımı;

import java.util.HashMap;

public class HashMapKullanımı {
    public static void main(String[] args) {
        HashMap<Integer,String > plakalar = new HashMap<>();
        plakalar.put(1,"adana ") ;
        plakalar.put(34,"istanbul ");
        plakalar.put(27,"antep ");
        plakalar.put(44,"malatya ");
        plakalar.put(47,"mardin");
        plakalar.put(44,"asdasd");
        System.out.println(plakalar);
       String deger =  plakalar.get(44);
        System.out.println(deger);
        System.out.println(plakalar.size());
        System.out.println(plakalar.isEmpty());
        System.out.println();


    }
}

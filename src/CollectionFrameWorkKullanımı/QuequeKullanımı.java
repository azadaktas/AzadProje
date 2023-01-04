package CollectionFrameWorkKullanımı;

import java.util.LinkedList;
import java.util.Queue;

public class QuequeKullanımı {
    public static void main(String[] args) {
        Queue<Integer> sayilar = new LinkedList<>();
        sayilar.offer(1);
        sayilar.offer(2);
        sayilar.offer(3);
        sayilar.offer(4);
        System.out.println(sayilar.peek());
        System.out.println(sayilar.poll());
        System.out.println(sayilar);
    }
}

package TheradOlusturma;

public class ThreadOlusturmaornek {
    public static void main(String[] args) {
        System.out.println("program baslatildi " + Thread.currentThread().getName());
        İsci i̇sci = new İsci();
        i̇sci.setName("ıscı sınıfı threadı ");
        i̇sci.start();//run kullanmadık
        System.out.println("program bitti ");
        IscıRunnubla isciRunnble = new IscıRunnubla();
        Thread isci1 = new Thread(isciRunnble);
        isci1.setName("ıscırunbble therad ");
        isci1.start();

    }
}

package TheradOlusturma;

public class IscıRunnubla implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("ıscı runnuble calısmaya baslad ı thread adı :  " + Thread.currentThread().getName());

            Thread.sleep(2000);
            System.out.println("ıscı runnuble calısmayı bıtırdı thread adı :  " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

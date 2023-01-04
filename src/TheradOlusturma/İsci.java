package TheradOlusturma;

public class İsci extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("ıscı sınıfı calısmaya baslad ı thread adı :  " + Thread.currentThread().getName());

            Thread.sleep(2000);
            System.out.println("ıscı sınıfı calısmayı bıtırdı thread adı :  " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

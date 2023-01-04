public class isci  extends  Thread {
    @Override
    public void run() {
        try {
            System.out.println("ıscı sınıfı calısmaya basladı :" + Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("ıscı sınıfı calısmaya bitirdi :" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

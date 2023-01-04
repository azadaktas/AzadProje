public class iscirunnuble implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("ıscı runnble calısmaya basladı :" + Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("ıscı runnble  calısmaya bitirdi :" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

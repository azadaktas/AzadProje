package threadrenklerı;

public class taktaktak {
    public static void main(String[] args) {
        Theradd t1 = new Theradd();
        t1.start();


    }
}
class Theradd extends Thread {
    @Override
    public void run() {
        System.out.println(TheradRenkleri.Green + "programı baslatiyorum ...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(TheradRenkleri.Green + "prograı b,t,r,,yorum  ...");
    }
}

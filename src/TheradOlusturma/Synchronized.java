package TheradOlusturma;

public class Synchronized {
    public static void main(String[] args) {
        Yazici yazici = new Yazici(10);
        Thread azad = new Azad(yazici);
        Thread ronas =new Ronas(yazici);
        azad.start();
        ronas.start();


    }
}
class Yazici{
    private int dokumaSayisi ;
    public Yazici(int dokumaSayisi){
        this.dokumaSayisi=dokumaSayisi;

    }
    public  synchronized void yazdir(){//aynı anda tek bir thread ıslem yapsın dıye yazılır synchronized
        for (int i = dokumaSayisi; i>0 ;i--){
            System.out.println("dokuman no :" + i + "thread adi : " + Thread.currentThread().getName());
        }

    }
}
class Azad extends Thread{
    private Yazici yazici;
    public Azad (Yazici yazici){
        this.yazici=yazici;
    }

    @Override
    public void run() {
        yazici.yazdir();
    }
}
class Ronas extends Thread{
    private Yazici yazici;
    public Ronas (Yazici yazici){
        this.yazici=yazici;
    }

    @Override
    public void run() {
        yazici.yazdir();
    }
}


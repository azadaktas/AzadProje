package TheradOlusturma;

public class ÜreticiTüketiciProblemi {
    public static void main(String[] args) {
         //üretici 1 i üreticek tüketici  1 kullanıcak ...
        OrtakAlan ortakAlan =new OrtakAlan();
        Üretici üretici=new Üretici(ortakAlan);
        Tüketici tüketici=new Tüketici(ortakAlan);
        üretici.start();
        tüketici.start();
    }

}
class OrtakAlan{
    private int veri ;

    public int getVeriAl() {
        return veri;
    }

    public void setVeriYaz(int veri) {
        this.veri = veri;
    }
}
class Üretici extends Thread{
    private OrtakAlan ortakAlan;
    public Üretici (OrtakAlan o){
        this.ortakAlan=o;
    }

    @Override
    public void run() {
        for (int i = 1 ; i<=10 ; i++) {
            ortakAlan.setVeriYaz(i);
            System.out.println("uretici thread konulan veri : " + i);
            try {
                sleep((int) (Math.random()*3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Tüketici extends Thread{
    private OrtakAlan ortakAlan;
    public Tüketici (OrtakAlan o){
        this.ortakAlan=o;
    }

    @Override
    public void run() {
        int okunanDeger = 0 ;
        for (int i = 1 ; i<=10 ; i++) {

            okunanDeger=ortakAlan.getVeriAl();
            System.out.println("tuketici thread konulan veri : " + i);
            try {
                sleep((int) (Math.random()*3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

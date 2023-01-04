import java.util.Scanner;

public class MonteCarloYontemı {
    public static void main(String[] args) {
        System.out.println("lütfen bir sayi giriniz : ");
        Scanner tara = new Scanner(System.in);
        int taktak= tara.nextInt();
        int cemberinİcindekiNoktaSayisi = 0 ;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i<taktak ; i++){
            double x = Math.random();
            double y = Math.random();
            double distance = x*x + y*y ;
            if (distance<= 1 ){
                cemberinİcindekiNoktaSayisi++;
            }

        }
        long end = System.currentTimeMillis();
        long time = end - start ;
        double myPi = 4.0 *(cemberinİcindekiNoktaSayisi) / taktak;
        System.out.println("bulunan pi sayisi : "+ myPi);
        double javaPi = Math.PI;
        System.out.println("javadaki pi sayisi : " + javaPi);
        System.out.println("tollam mss  " + time);


    }
}

import java.util.Scanner;

public class udemuykursu {

    //Monte carlo yontemı pi sayisi bulma
    public static void main(String[] args) {

        System.out.println("nokta sayısını giriniz");
        Scanner tara = new Scanner(System.in);
        int n = tara.nextInt();
        int numberCircle = 0 ;

        for (int i = 0 ; i<n ; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = x * x + y * y;

            if (distance < 1) {
                numberCircle++;
            }
            double myPi = 4.0 * numberCircle / n;
            System.out.println("myPi :" + myPi);
            System.out.println("javanın pi ssi :  " + Math.PI);
        }
    }

}

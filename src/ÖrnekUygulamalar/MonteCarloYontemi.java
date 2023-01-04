package ÖrnekUygulamalar;

import java.util.Scanner;

public class MonteCarloYontemi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz : ");
        int n = sc.nextInt();
        int numberInCircle = 0 ;

        for (int i = 0 ; i<n ;i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = x * x + y * y;
            if (distance <= 1)
                numberInCircle++;
        }
            double myPı =4.0* numberInCircle/n ;
            System.out.println("my pi " + myPı);

    }
}


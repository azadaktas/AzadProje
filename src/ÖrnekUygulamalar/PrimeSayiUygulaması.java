package ÖrnekUygulamalar;

import java.util.Scanner;

public class PrimeSayiUygulaması {
    public static void main(String[] args) {
        PrimeSayiUygulaması prime = new PrimeSayiUygulaması();
        Scanner tara = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi giriniz : ");
        int n = tara.nextInt();
        System.out.println(prime.primeSayi(n));


    }
    boolean primeSayi(int n){
        boolean prime = true;
        for (int i = 2 ; i<n ; i++){
            if (n % i == 0 ) {
                prime = false;
                break;
            }
        }

        return prime;
    }

}

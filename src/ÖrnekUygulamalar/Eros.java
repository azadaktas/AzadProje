package ÖrnekUygulamalar;

import java.util.Arrays;
import java.util.Scanner;

public class Eros {
    public static void main(String[] args) {
        Eros tak = new Eros();
        System.out.println("lütfen bir sayi giriniz : ");
        Scanner tara = new Scanner(System.in);
        int n = tara.nextInt();

    }
    void countNumber(int n ){
        boolean [] list = new boolean[n];
        Arrays.fill(list,true);
        for (int i=2 ; i<n ; i++){
            if (list[i]==true)
            for (int j = 2 ; i*j<n ; j++){
                list[i*j] = false;

            }
        }

    }
}

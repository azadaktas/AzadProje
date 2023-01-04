package ÖrnekUygulamalar;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    //eleme yöntemi ile asal sayıları bulma (once 2 nın katları sonra 3 un katları dıyerekden ılerlıyor . )
    public static void main(String[] args) {

        SieveOfEratosthenes soe = new SieveOfEratosthenes();
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("lütfen bir tam sayi giriniz : ");
        int n = sc.nextInt();

        soe.primeSayi(n);}

    }void primeSayi (int n ){
        boolean [] list  = new boolean[n+1];//n nın kendısınıde dahıl ettıgım ıcın 100 odacıkdan 99 tanesı alıyor n de dahıl olur bolece.
        Arrays.fill(list,true);
        for (int i = 2 ; i<= n ; i++){
            if (list[i]==true)
                for (int j = 2 ; i*j<= n ;  j++)
                    list[i*j] = false ;
        } int numberOfPrimes = 0 ;
        for (boolean b : list){
            if (b == true)
                numberOfPrimes++;
            }
        System.out.println(n+"sayısına kadar " + (numberOfPrimes - 2)+"tane asal sayı vardır ");


    }


}

import java.util.Arrays;
import java.util.Scanner;

public class AsalSayiBulmaYöntemi {
    public static void main(String[] args) {
        AsalSayiBulmaYöntemi soe = new AsalSayiBulmaYöntemi();
        System.out.println("lütfen bir sayi giriniz : ");
        Scanner tara= new Scanner(System.in);
        int n = tara.nextInt();
        soe.asalSayiBulma(n );


    }
    void asalSayiBulma (int n ){
        boolean [] list = new boolean[n+1];
        Arrays.fill(list,true);
        for (int i = 2 ; i<=n ; i++){
            if (list[i]==true)
                for (int j=2 ;i*j<=n ; j++)
                     list [i*j] = false;
        }
        int numberOfPrime = 0 ;
        for (boolean b : list) {
            if(b)
            numberOfPrime++;


        }
        System.out.println("asal sayi :  " + numberOfPrime );

    }
}

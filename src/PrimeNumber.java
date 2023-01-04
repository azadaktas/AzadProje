import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber pc = new PrimeNumber();
        while (true){
        System.out.println("ltfen positive bir tam sayi giriniz : ");
        Scanner tara = new Scanner(System.in);
        int n = tara.nextInt();
        System.out.println(pc.isPrime(n));}

    }
    boolean isPrime(int n ){
        boolean prime = true;
        int i  = 2 ;
        for (;i<n ; i++){
            if (n % i == 0 )    {
                prime = false;
                break;
            }

        }
        if (!prime){
            System.out.println("ilk bölen " + i);
        }
        return prime;


    }
}

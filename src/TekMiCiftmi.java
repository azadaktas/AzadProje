import java.util.Scanner;

public class TekMiCiftmi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        int sayac = 0 ;
        while (sayac<3){
            System.out.println("lütfen bir sayi giriniz : ");

            int sayi = tara.nextInt();
            if (sayi% 2 == 0  ){
                System.out.println("sayi cifttir... ");
            }else {
                System.out.println("sayi tektir ...");
            }//sayac++;

        }

    }
}

import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("sayıların tek mi cift mi oldugunu bulan program ");
        System.out.println("lütfen bir sayi giriniz : ");
        int girilenSayilar = tara.nextInt();
        int sayilar [] = new int[girilenSayilar];
        for (int i = 0  ; i<sayilar.length ; i++){
            sayilar[i] = tara.nextInt();

        }
        for (int deger : sayilar){
            tekMiCiftMi(deger);

        }

    }
    public static void tekMiCiftMi(int girilenSayilar ){
        if (girilenSayilar  %2==0 ){
            System.out.println("bu sayi cifttir "  );
        }else System.out.println("sayi tektir "  );
    }




}



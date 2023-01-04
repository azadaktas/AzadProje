package UdemyKursOrnegi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);



        while (true){
            System.out.println("oncelikle hosgeldiniz  : ");
            System.out.println("0->oncelıkle bir  ders olusturunuz : ");
            System.out.println("1-> kursa egitmen ekleyiniz ");
            System.out.println("2-> kursa ders ekleyiniz  ");
            System.out.println("3->  kursu ekleyiniz  ");
            int secim = Integer.parseInt(tara.nextLine());
            if (secim == 0 ){
                System.out.println("dersno giriniz  : ");
                int dersNo =tara.nextInt();
                System.out.println("lütfen ders baslıgı giriniz  : ");
                String dersBasligi = tara.next();
                System.out.println("lütfen ders dakikasi giriniz : ");
                int dersDakika =tara.nextInt();
                Ders ders1 = new Ders(dersNo,dersBasligi,dersDakika);
                System.out.println("kursa adini giriniz: ");
                String kursAdi = tara.nextLine();
                System.out.println("kursun basegıtmenını gırınız : ");
                String basEgitmen = tara.nextLine();
                Kurs kurs1 = new Kurs(kursAdi,basEgitmen);
                kurs1.kursaDersEkle(ders1);
                System.out.println(ders1 + "bu" + kurs1 + "e eklendi "  );
            }else if (secim ==1 ){ System.out.println("dersno giriniz  : ");
                int dersNo =tara.nextInt();
                System.out.println("lütfen ders baslıgı giriniz  : ");
                String dersBasligi = tara.next();
                System.out.println("lütfen ders dakikasi giriniz : ");
                int dersDakika =tara.nextInt();
                Ders ders1 = new Ders(dersNo,dersBasligi,dersDakika);
                System.out.println("kursa adini giriniz: ");
                String kursAdi = tara.nextLine();
                System.out.println("kursun basegıtmenını gırınız : ");
                String basEgitmen = tara.nextLine();
                Kurs kurs1 = new Kurs(kursAdi,basEgitmen);
                kurs1.kurstanDersSil(ders1);
                System.out.println(ders1 + "bu" + kurs1 + "e silindi "  );

            }




        }




    }
}

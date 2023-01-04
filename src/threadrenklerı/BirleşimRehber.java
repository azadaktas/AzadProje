package threadrenklerı;

import java.util.Scanner;

public class BirleşimRehber {
    public static void main(String[] args) {


        Contatcs myContatcs = new Contatcs();
        while (true) {
            Scanner tara = new Scanner(System.in);
            System.out.println("lutfen yapmak istediginiz işlemi secin ...");
            System.out.println("1-> Rehbere kişi eklemek " +
                    "2-> isme göre kişi bul " + "3->kişi sil ." + "4->bütün kişileri listele ");
            int secim = Integer.parseInt(tara.nextLine());
            if (secim == 1) {
                System.out.println("isminizi giriniz : ");
                String isim = tara.nextLine();
                System.out.println("soyisim giriniz : ");
                String soyisim = tara.nextLine();
                System.out.println("tel no giriniz : ");
                String telNo = tara.nextLine();
                Person person = new Person(isim, soyisim, telNo);
                myContatcs.rehberdenKişiEkle(person);
                System.out.println("eklendi " + person);
            }
            if (secim == 2) {
                System.out.println("ismi bulunucak kisiyi giriniz :  ");
                String aranacakKisi = tara.nextLine();
                Person foundPerson = myContatcs.findPersonByName(aranacakKisi);
                if (foundPerson != null) {
                    System.out.println(aranacakKisi + " isimli kişinin telefon numarası: " + foundPerson.getPhoneNumber());
                } else {
                    System.out.println(aranacakKisi + " isimli kişi rehberde bulunamamıştır.");
                }
            }
            if (secim == 3) {
                System.out.println("isminizi giriniz : ");
                String isim = tara.nextLine();
                Person person = new Person();


            }
            if (secim == 4) {
                for (Person person : myContatcs.getRehberdekiKişiler()) {
                    System.out.println(person);
                }
            }

        }
    }

}

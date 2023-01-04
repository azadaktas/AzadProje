import java.util.Scanner;

public class papapa {
    public static void main(String[] args) {
        // azad aktas iban :TR 213213213213
        // azadın kullanıcı adı ve sıfresı azad21 123
        // ronas aktas ıban :TR 12321312312
        // ronasın kullanıcı adı ve sıfresı : ronas12 şifre 123
    /*
    AZADIN hesabaı ıcın 8 e basınız ronasın hesabı ıcın 9 a basınız.
    bakıye goruntulemek ıcın 1
    para cekmek ıcın 2
    farklı hesaba para yatırmak ıcın 3
    uygulamadan cıkmak ıcın 4
     */
        Scanner tara = new Scanner(System.in);
        String secim = "bakiye görüntülemek icin 1 "
                + "para cekmek icin 2 " + "farklı hesaba para yatırmak iccin 3 "
                + "uygulamadan cıkmak icin 4 " ;
        System.out.println("atm ye hosgeldınız .....");
        double azadBakiye = 2500 ;
        double ronasBakiye = 3500  ;
        String azadIban = "TR 213213213213";
        String ronasIban = "TR 12321312312" ;
        String azadKullanıcıAdı = "azad21" ;
        String ronasınKullanıcıAdı = "ronas12 " ;
        String azadınSifresi = "123" ;
        String ronasınSifresi = "123";
        System.out.println("kullanıcıAdı : ");
        String kullanıcıAdı = tara.nextLine();
        System.out.println("kullanıcı sifresi : ");
        String kullanıcıSifresi = tara.nextLine();
        if (kullanıcıAdı.equals(azadKullanıcıAdı) && kullanıcıSifresi.equals(azadınSifresi)){
            System.out.println("azad bey hosgeldınız . ");
            System.out.println(secim );
            System.out.println("lütfen bir secim yapiniz : ");
            String islemSecenekleri = tara.nextLine();



            switch (islemSecenekleri) {
                case "1" :
                    System.out.println("bakiyeniz " + azadBakiye);
                    break;
                case "2" :
                    System.out.println("cekmek ıstedıgınız tutarı gırınız " );
                    int cekılıcekTutar = tara.nextInt();
                    double yeniTutar = azadBakiye - cekılıcekTutar  ;
                    if (cekılıcekTutar <= azadBakiye){

                        System.out.println("para hesaptan cekilmiştir");
                        System.out.println("yeni tutar : " + yeniTutar );
                    }else System.out.println("yetersiz bakiye ...");
                    break;
                case "3" :
                    System.out.println("ne kadar para yatırmak istiyorsunuz : ");
                    double yatırmakİstenilenPara = tara.nextInt();
                    if (yatırmakİstenilenPara<=azadBakiye){
                        System.out.println("iban  giriniz : ");
                        String yatırılıcakIban = tara.nextLine();
                        if (yatırılıcakIban == ronasIban){
                            System.out.println("para ronas adlı kişiye aktarılıyor ");
                            azadBakiye = azadBakiye - yatırmakİstenilenPara ;
                            ronasBakiye = ronasBakiye + yatırmakİstenilenPara ;

                        }

                    }
                    break;

            }

        }else if (kullanıcıAdı.equals(ronasınKullanıcıAdı) && kullanıcıSifresi.equals(ronasınSifresi)){
            System.out.println("ronas bey sısteme hosgeldınız . ");
            System.out.println("lütfen bir secim yapiniz " + secim);
        }else {
            System.out.println("kullanıcı adı veya sıfre yanlıs  .");
        }





    }

}

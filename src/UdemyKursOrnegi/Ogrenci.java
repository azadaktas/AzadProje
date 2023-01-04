package UdemyKursOrnegi;

import java.util.ArrayList;

public class Ogrenci extends Kişi{
    private ArrayList<Kurs> katildigimKurslar ;
    public Ogrenci(String isim, String tanitimYazisi, String kullaniciAdi) {
        super(isim, tanitimYazisi, kullaniciAdi);
        katildigimKurslar = new ArrayList<>();
    }

    @Override
    public String  toString() {
        return "Ogrenci{" +
                "katildigimKurslar=" + katildigimKurslar +
                '}';
    }
}

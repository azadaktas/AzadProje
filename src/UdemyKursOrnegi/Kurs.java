package UdemyKursOrnegi;

import java.util.ArrayList;

public class Kurs {
    private String kursAdi ;
    private ArrayList<Ders> kurstakidersler ;
    private ArrayList<String> kurstakiEgitmenler ;
    private ArrayList<Ogrenci> kurstakiOgrenciler ;
    //ders sayısı en az 5 toplam icerik en az 60 dakika olmalı .
    private boolean yayinda ;

    public Kurs(String kursAdi, String basEgitmen) {
        this.kursAdi = kursAdi;
        this.kurstakidersler = new ArrayList<>();
        this.kurstakiEgitmenler = new ArrayList<String>();
        this.kurstakiOgrenciler = new ArrayList<>() ;
        kurstakiEgitmenler.add(basEgitmen);
        this.yayinda = false;
    }
    public void kursaDersEkle(Ders eklenecekDers){
        kurstakidersler.add(eklenecekDers);
    }
    public void kurstanDersSil(Ders silinicekDers){kurstakidersler.remove(silinicekDers);}
    public void kursaEgitmenEkle(String yeniEgitmen){
        kurstakiEgitmenler.add(yeniEgitmen);
    }
    public void kurstanEgitmenSil(Egitmen siliniciekEgitmen){
        kurstakiEgitmenler.remove(siliniciekEgitmen);
    }
    public int kurstakiDersSayisi(){
     return    kurstakidersler.size();
    }
    private int kurstakiDerslerinToplamDakikaSüresi(){
        double toplamSüre= 0 ;
        for (Ders ders : kurstakidersler){
            toplamSüre = toplamSüre + ders.getDakika();
        }
        return(int) toplamSüre ;
    }
    private boolean yayindaKontrol(){
        if (kurstakidersler.size()>5 && kurstakiDerslerinToplamDakikaSüresi()>60){
            yayinda = true;
            return true ;
        }else return false ;


    }
    public void kursaOgrenciEkle (Ogrenci ogrenci){
        if (yayindaKontrol()){
            kurstakiOgrenciler.add(ogrenci);
        }

    }

}

package SanslıOnnumaraOyunu;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static final int URETILICEK_MAX_SAYI_SINIR = 60 ;
    static final int URETILICEK_SAYI_MİKTAR = 1000000 ;
    public static void main(String[] args) {
        Map<Integer,Integer> olusturulanSayılarMap = new HashMap<>();
        mapiSayilarlaDoldur(olusturulanSayılarMap);

        /*  for (Map.Entry<Integer, Integer> gecici : olusturulanSayılarMap.entrySet()){
            System.out.println(gecici);
        }*/
    }

    private static void mapiSayilarlaDoldur(Map<Integer, Integer> olusturulanSayılarMap) {
        for (int i = 0 ; i<URETILICEK_SAYI_MİKTAR ; i++){
            int randomSayi = sayiOlustur();
            if (olusturulanSayılarMap.containsKey(randomSayi)) {
                int value = olusturulanSayılarMap.get(randomSayi);//indexi
                olusturulanSayılarMap.put(randomSayi,++value);
            }else {
                olusturulanSayılarMap.put(randomSayi,1);

            }
        }
    }
    private static int sayiOlustur (){
        return ((int)   (Math.random()*URETILICEK_MAX_SAYI_SINIR)  + 1 ) ;
    }
}


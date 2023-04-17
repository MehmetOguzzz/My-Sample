package ARRAYS;

import java.util.Arrays;

public class SORU4_ARRAYHARFBULMA {
    public static void main(String[] args) {
        //Verilen bir String'de 'a' veya 'A' ile başlayan kelime sayısını bulunuz

        String arr = "Ankara ankara güzel ankara,Ayran içtik ayrı düştük...";

        String[] yeniArr = arr.split("\\s+");
        System.out.println(Arrays.toString(yeniArr));

        int sayac = 0;

        for (String w : yeniArr) {
            if (w.startsWith("a") || w.startsWith("A"))
                sayac++;

        }
        System.out.println(sayac);
    }
}


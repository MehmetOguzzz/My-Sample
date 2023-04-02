package FOR_WHİLE_DoWHİLE;

import java.util.Scanner;

public class SORU_5_FORLOOPS {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        Scanner scan=new Scanner(System.in);
        System.out.println("Başlangıç değerini tam sayı olarak giriniz");
        int bas= scan.nextInt();
        System.out.println("Bitiş değerini tam sayı olarak giriniz");
        int bit=scan.nextInt();
        int sayilarToplami=0;

        if (bas<bit) {
            for (int i = bas; i <= bit; i++) {
                sayilarToplami += i;
            }
        }else{
            for (int i = bas; i >=bit ; i--) {
                sayilarToplami+=i;
            }

        }

        System.out.println("sayılar toplamı : " + sayilarToplami);
    }
}

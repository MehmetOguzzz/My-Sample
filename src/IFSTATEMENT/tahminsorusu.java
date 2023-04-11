package IFSTATEMENT;

import java.util.Random;
import java.util.Scanner;

public class tahminsorusu {
    public static void main(String[] args) {
        /*Soru : 0-100  arasinda random bir sayi ureteci olusturup kullanicidan bu sayiyi tahmin etmesini isteyin
       Kullanicidan alinan tahmin fazla "Cok soyledin dusur" , az ise "Dusuk soyledin artir, bilince tebrik edip durduran ve
       Kacinci denemede buldugunu da yazidran bir Sayi Tahmin oyunu olusturun
         */
        int tahminSayisi = 0;

        Scanner scan = new Scanner(System.in);

        boolean dogruMu = false;

        System.out.println("Lütfen bir tahminde bulunun...");

        Random rnd = new Random();

        int Input = rnd.nextInt(101);
        System.out.println(Input);

        while (!dogruMu) {

            int tahmin = scan.nextInt();

            if (tahmin > Input) {
                System.out.println("Lütfen daha küçük bir sayı söyleyiniz...");
                tahminSayisi++;
            } else if (tahmin < Input) {
                System.out.println("Lütfen daha büyük bir sayı söyleyiniz...");
                tahminSayisi++;

            } else {
                System.out.println("tebrikler doğru tahminde bulundunuz...");
                dogruMu = true;

            }

        }
        System.out.println(tahminSayisi + " deneme sonucunda tahmini sayıyı buldunuz...");


    }
}
